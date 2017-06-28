/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import model.entity.Aluno;

/**
 *
 * @author rafae
 */
public class XMLHandler {

    public Aluno LerXmlProduto(String cpf) {

        Aluno aluno = null;
        String PATH = "Alunos.xml";

        try {

            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(PATH)));
            while (decoder.readObject() != null) {
                System.out.println("dentro");
                aluno = (Aluno) decoder.readObject();
                if (aluno.getCpf().equals(cpf)) {
                    System.out.println("achou");
                    decoder.close();
                    return aluno;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return aluno;
    }
}
