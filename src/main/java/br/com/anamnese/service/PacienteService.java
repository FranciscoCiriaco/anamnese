package br.com.anamnese.service;

import br.com.anamnese.model.Paciente;
import br.com.anamnese.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente buscarPorUsuarioId(Long usuarioId) {
        return pacienteRepository.findByUsuarioId(usuarioId);
    }

    public void salvar(Paciente paciente) {
        pacienteRepository.save(paciente);
    }
}
