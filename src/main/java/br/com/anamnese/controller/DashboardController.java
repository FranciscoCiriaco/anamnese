package br.com.anamnese.controller;

import br.com.anamnese.model.Usuario;
import br.com.anamnese.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/dashboard")
    public String redirecionarDashboard(Authentication auth) {
        Usuario usuario = usuarioRepository.findByEmail(auth.getName()).orElseThrow();
        if (usuario.getRole().name().equals("MEDICO")) {
            return "redirect:/medico/dashboard";
        } else {
            return "redirect:/cliente/dashboard";
        }
    }

    @GetMapping("/medico/dashboard")
    public String dashboardMedico() {
        return "medico-dashboard";
    }

    @GetMapping("/cliente/dashboard")
    public String dashboardCliente() {
        return "cliente-dashboard";
    }
}
