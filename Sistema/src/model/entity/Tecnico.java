/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

/**
 *
 * @author RafaelSalazarStavale
 */
public class Tecnico extends Usuario{
    
    public Tecnico(String cpf, String nome, String dataNascimeto, String endereco) {
        super(cpf, nome, dataNascimeto, endereco);
    }

    public Tecnico() {
    }
    
}
