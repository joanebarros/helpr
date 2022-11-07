package org.soulcodeacademy.helpr.domain.dto;

// DTO -> Ogejeto de tranferencia de dados.
// É util para validarmos as informações tranferidas pelo cliente

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CargoDTO {
    // Mensagem e texto de validação
    @NotBlank(message = "Campo nome é obrigatório") // Impede que o valor de nome seja "", por exemplo
    private String nome;

    @NotBlank(message = "Campo descrição é obrigatório")
    private String descricao;

    // Impede que o valor seja null
    @NotNull(message = "Campo salário é obrigatorio")
    @Min(value = 500, message = "Campo salário invalido")
    @Max(value = 100000, message = "Campo salário invalido")
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
