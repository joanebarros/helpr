package org.soulcodeacademy.helpr.domain;

import org.soulcodeacademy.helpr.domain.enums.Perfil;

import javax.persistence.*;

@Entity
@Table(name = "Usuario") // Colocar um nome expesifico na tabela
public abstract class Usuario { // Não sera possivel criar objetos desta classe
    @Id // Torna o campo abaixo uma PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Preenche o campo ID com AUTO_INCREMENT
    protected Integer id;

    @Column(nullable = false, length = 150)
    protected String nome;

    @Column(nullable = false, unique = true, length = 120)
    protected String email;

    @Column(nullable = false, unique = true, length = 11)
    protected String cef;

    @Column(nullable = false)
    protected String senha;

    @Enumerated(EnumType.STRING) // Representa os valores do ENUM como texto
    protected Perfil perfil; // Indicar o que este usuario é no sistema

    public Usuario() {

    }

    public Usuario(Integer id, String nome, String email, String cef, String senha, Perfil perfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cef = cef;
        this.senha = senha;
        this.perfil = perfil;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCef() {
        return cef;
    }

    public void setCef(String cef) {
        this.cef = cef;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
