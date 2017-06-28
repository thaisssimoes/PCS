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

}
