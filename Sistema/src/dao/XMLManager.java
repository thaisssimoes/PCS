/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.entity.Aluno;
import model.entity.Usuario;

/**
 *
 * @author RafaelSalazarStavale
 */
// imports...
public class XMLManager {

    public void gravarXML(Aluno aluno) {

        //Inicialização do objeto xstream:
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("Aluno", Aluno.class);

        //Gerar o XML:
        String xml = xStream.toXML(aluno);
        System.out.println(xml);

        //Gerar arquivo "arquivo.xml" com o conteúdo XML:
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("Aluno.xml"));
            out.write(xml);
            out.close();
        } catch (IOException e) {
            System.out.println("Erro ao gerar arquivo!");
        }
    }

    public void lerXML() {
        try {
            //Le arquivo
            FileInputStream in = new FileInputStream(new File("aluno.xml"));

            //Cria objeto da classe XStream
            XStream xStream = new XStream(new DomDriver());
            xStream.alias("Aluno", Aluno.class);
            //Criar objeto da classe aluno com base no arquivo XML
            Aluno aluno = (Aluno) xStream.fromXML(in);
            

            //Imprime método toString() da classe aluno:
            System.out.println(aluno.toString());

        } catch (IOException ex) {
            System.out.println("Erro ao ler arquivo!");
        }
    }
}
