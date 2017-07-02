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
class Disciplina {
    @Getter
    @Setter
    private String nome;
    private String tipo;

    public Disciplina(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
    
    
    
}
