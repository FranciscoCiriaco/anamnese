package br.com.anamnese.model;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;

    @Enumerated(EnumType.STRING)
    private Role role; // CLIENTE ou MEDICO

    private boolean autorizado; // Médico autoriza o acesso do cliente à ficha
    private boolean ativo; // Para controle de acesso no login

    public Usuario() {
    }

    public Usuario(Long id, String nome, String email, String senha, Role role, boolean autorizado, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.role = role;
        this.autorizado = autorizado;
        this.ativo = ativo;
    }

    // Getters e Setters

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }

    public void setSenha(String senha) { this.senha = senha; }

    public Role getRole() { return role; }

    public void setRole(Role role) { this.role = role; }

    public boolean isAutorizado() { return autorizado; }

    public void setAutorizado(boolean autorizado) { this.autorizado = autorizado; }

    public boolean isAtivo() { return ativo; }

    public void setAtivo(boolean ativo) { this.ativo = ativo; }
}
