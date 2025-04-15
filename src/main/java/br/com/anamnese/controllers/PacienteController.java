package br.com.anamnese.controllers;

import br.com.anamnese.model.Paciente;
import br.com.anamnese.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("pacientes", pacienteService.listarTodos());
        return "pacientes/listar";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "pacientes/formulario";
    }

    @PostMapping
    public String salvar(@ModelAttribute Paciente paciente) {
        pacienteService.salvar(paciente);
        return "redirect:/pacientes";
    }

    @GetMapping("/{id}")
    public String visualizar(@PathVariable Long id, Model model) {
        model.addAttribute("paciente", pacienteService.buscarPorId(id));
        return "pacientes/detalhes";
    }

    @GetMapping("/{id}/editar")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("paciente", pacienteService.buscarPorId(id));
        return "pacientes/formulario";
    }

    @PostMapping("/{id}/remover")
    public String remover(@PathVariable Long id) {
        pacienteService.excluir(id);
        return "redirect:/pacientes";
    }
}