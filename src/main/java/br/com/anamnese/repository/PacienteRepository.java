package br.com.anamnese.repository;

import br.com.anamnese.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Paciente findByUsuarioId(Long usuarioId);
}
