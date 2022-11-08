package org.soulcodeacademy.helpr.domain;

import org.soulcodeacademy.helpr.domain.enums.Perfil;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Funcionario extends Usuario {
// Gera uma coluna dtype para indicar qual a subclasse (Funcionario ou Cliente)

    // Coluna foto não é obrigatória
    private String foto;
    @ManyToOne // ANOTAÇÃO USADA PARA UM RELACIONAMENTO DE MUITOS FUNCIONARIOS PARA UM CARGO
    @JoinColumn(name = "id_cargo") // Criar uma coluna nova que é a chave estrangeira de cargo
    private Cargo cargo; // Se eu quiser mudar o cargo do funcionario basta mudar o obejeto deste campo.

    private Funcionario() {}


    public Funcionario(Integer id, String nome, String email, String cef,
                       String senha, Perfil perfil, String foto, Cargo cargo) {
        super(id, nome, email, cef, senha, Perfil.FUNCIONARIO); // Chamada do construtor de usuario.
        this.foto = foto;
        this.cargo = cargo;
    }


    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
// ANOTAÇÕES DE RELACIONAMENTO
// @oneToOne -> 1:1
// @oneToMany/@ManyToOne -> 1:N
// @ManyToMany -> N:N

// RELACIONAMENTO UNIDIRECIONAL = APENAS UMA DAS ENTIDADES "CONHECE" A OUTRA.
// RELACIONAMENTO BIDIMECIONAL = AS DUAS ENTIDADES SE "CONHECEM"