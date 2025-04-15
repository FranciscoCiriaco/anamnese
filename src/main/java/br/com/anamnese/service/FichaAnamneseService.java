package br.com.anamnese.service;

import br.com.anamnese.model.FichaAnamnese;
import br.com.anamnese.repositories.FichaAnamneseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FichaAnamneseService {

    @Autowired
    private FichaAnamneseRepository fichaAnamneseRepository;

    public List<FichaAnamnese> listarTodos() {
        return fichaAnamneseRepository.findAll();
    }

    public FichaAnamnese buscarPorId(Long id) {
        return fichaAnamneseRepository.findById(id).orElse(null);
    }

    public FichaAnamnese salvar(FichaAnamnese fichaAnamnese) {
        return fichaAnamneseRepository.save(fichaAnamnese);
    }

    public void excluir(Long id) {
        fichaAnamneseRepository.deleteById(id);
    }
}