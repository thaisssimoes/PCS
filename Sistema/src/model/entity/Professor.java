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
public class Professor extends Usuario {

    @Getter
    @Setter
    ArrayList<Disciplina> grade;
    @Getter
    @Setter
    String siape;
    @Getter
    @Setter
    String centroAcademico = "CCET";
    @Getter
    @Setter
    String regimeTrabalho;
    @Getter
    @Setter
    String lotacao = "Escola de Informática Aplicada";
    @Getter
    @Setter
    String classeDocente;
    @Getter
    @Setter
    String titulacao;
    @Getter
    @Setter
    String cargo;

    public Professor() {
    }

    public Professor(String siape, String regimeTrabalho, String classeDocente, String titulacao, String cargo, String cpf, String senha, String nome, String dataNascimeto, String nacionalidade, String email, String estadoCivil, String sexo, String nomeDaMae, String nomeDoPai, String deficiencia, String tipoDeEndereco, String tipoLogradouro, String logradouro, String complemento, String estado, String telefoneResidencial, String bairro, String cidade, String telefoneCelular, String numero, String cep, String pais) {
        super(cpf, senha, nome, dataNascimeto, nacionalidade, email, estadoCivil, sexo, nomeDaMae, nomeDoPai, deficiencia, tipoDeEndereco, tipoLogradouro, logradouro, complemento, estado, telefoneResidencial, bairro, cidade, telefoneCelular, numero, cep, pais);
        this.siape = siape;
        this.regimeTrabalho = regimeTrabalho;
        this.classeDocente = classeDocente;
        this.titulacao = titulacao;
        this.cargo = cargo;
    }

}
