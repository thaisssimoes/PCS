/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.requerimento;

import java.time.LocalDate;
import model.entity.Usuario;

/**
 *
 * @author RafaelSalazarStavale
 */
public class RevisaoDeProva extends Requerimento{
    
    public RevisaoDeProva(Usuario requerente, Usuario areaResponsavel, String status, String descricao, LocalDate dataCriacao, LocalDate dataSolucao, String feedback) {
        super(requerente, areaResponsavel, status, descricao, dataCriacao, dataSolucao, feedback);
    }
    
}
