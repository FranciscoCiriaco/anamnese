package br.com.anamnese.service;

import br.com.anamnese.model.Usuario;
import br.com.anamnese.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));

        // Aqui a gente converte o "Usuario" da aplicação para o "User" do Spring Security
        return User.builder()
                .username(usuario.getEmail())
                .password(usuario.getSenha())
                .roles(usuario.getRole().name().replace("ROLE_", "")) // Remove o prefixo ROLE_
                .disabled(!usuario.isAtivo()) // Se não estiver ativo, bloqueia o login
                .build();
    }
}
