package br.com.anamnese.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class FichaAnamnese {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String historicoMedico;
    private String alergias;
    private String medicamentos;

    @ManyToOne
    private Paciente paciente;

    // Getters, Setters, Construtores


    public FichaAnamnese(Long id, String historicoMedico, String alergias, String medicamentos, Paciente paciente) {
        this.id = id;
        this.historicoMedico = historicoMedico;
        this.alergias = alergias;
        this.medicamentos = medicamentos;
        this.paciente = paciente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
