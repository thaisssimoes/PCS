/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author RafaelSalazarStavale
 */
public class Usuario {

    @Getter
    @Setter
    private String cpf;
    @Getter
    @Setter
    private String matricula;
    @Getter
    @Setter
    private String senha;
    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private String dataNascimeto;
    @Getter
    @Setter
    private String endereco;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String periodo;
    @Getter
    @Setter
    private String telefone;

    public Usuario() {
    }

    ;
    public Usuario(String cpf, String nome, String dataNascimeto, String endereco) {
        super();
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimeto = dataNascimeto;
        this.endereco = endereco;
    }

    public Usuario(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }

    public Usuario(String cpf, String senha, String nome, String email, String telefone, String matricula) {
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}
