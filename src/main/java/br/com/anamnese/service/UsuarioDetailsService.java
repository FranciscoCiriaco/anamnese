package br.com.anamnese.service;

import br.com.anamnese.model.Usuario;
import br.com.anamnese.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado: " + email));

        String role = "ROLE_" + usuario.getRole().name();

        return new User(
                usuario.getEmail(),
                usuario.getSenha(),
                usuario.isAutorizado(), // apenas se o médico autorizou!
                true, // conta não expirada
                true, // credencial não expirada
                true, // conta não bloqueada
                List.of(new SimpleGrantedAuthority(role))
        );
    }
}
