package br.com.anamnese.repository;

import br.com.anamnese.model.FichaAnamnese;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FichaAnamneseRepository extends JpaRepository<FichaAnamnese, Long> {
}
