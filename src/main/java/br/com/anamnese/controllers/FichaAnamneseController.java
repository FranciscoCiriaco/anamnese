package br.com.anamnese.controllers;

import br.com.anamnese.model.FichaAnamnese;
import br.com.anamnese.model.Paciente;
import br.com.anamnese.service.FichaAnamneseService;
import br.com.anamnese.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/fichas")
public class FichaAnamneseController {

    @Autowired
    private FichaAnamneseService fichaAnamneseService;

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("fichas", fichaAnamneseService.listarTodos());
        return "fichas/listar";
    }
//    @GetMapping("/nova/{pacienteId}")
//    public String novaFicha(@PathVariable Long pacienteId, Model model) {
//        FichaAnamnese ficha = new FichaAnamnese();
//        Paciente paciente = pacienteService.buscarPorId(pacienteId);
//        ficha.setPaciente(paciente);
//        model.addAttribute("ficha", ficha);
//        return "fichas/formulario"; // Vamos criar esse HTML no frontend
//    }


    @GetMapping("/nova/{pacienteId}")
    public String nova(@PathVariable Long pacienteId, Model model) {
        FichaAnamnese fichaAnamnese = new FichaAnamnese();
        Paciente paciente = pacienteService.buscarPorId(pacienteId);
        fichaAnamnese.setPaciente(paciente);
        model.addAttribute("fichaAnamnese", fichaAnamnese);
        return "fichas/formulario";
    }


    @PostMapping
    public String salvar(@ModelAttribute FichaAnamnese fichaAnamnese) {
        fichaAnamneseService.salvar(fichaAnamnese);
        return "redirect:/fichas";
    }

    @GetMapping("/{id}/editar")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("fichaAnamnese", fichaAnamneseService.buscarPorId(id));
        return "fichas/formulario";
    }

    @PostMapping("/{id}/remover")
    public String remover(@PathVariable Long id) {
        fichaAnamneseService.excluir(id);
        return "redirect:/fichas";
    }
}