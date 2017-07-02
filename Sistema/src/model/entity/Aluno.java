/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author RafaelSalazarStavale
 */
public class Aluno extends Usuario {

    @Getter
    @Setter
    private ArrayList<Disciplina> grade;
    @Getter
    @Setter
    private String matricula;

    public Aluno() {
    }

    public Aluno(String matricula, String cpf, String senha, String nome, String dataNascimeto, String nacionalidade, String email, String periodo, String telefone, String estadoCivil, String sexo, String nomeDaMae, String nomeDoPai, String deficiencia, String tipoDeEndereco, String tipoLogradouro, String complemento, String estado, String telefoneResidencial, String bairro, String cidade, String telefoneCelular, String numero, String cep, String pais) {
        super(cpf, senha, nome, dataNascimeto, nacionalidade, email, periodo, telefone, estadoCivil, sexo, nomeDaMae, nomeDoPai, deficiencia, tipoDeEndereco, tipoLogradouro, complemento, estado, telefoneResidencial, bairro, cidade, telefoneCelular, numero, cep, pais);
        this.matricula = matricula;
    }
    
    

}
