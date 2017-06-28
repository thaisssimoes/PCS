package dao;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import model.entity.Aluno;

/**
 *
 * @author Thaïs Simões Classe responsável pelo armazenamento em XML dos dados
 * da agenda.
 */
public class XMLHandler {

    public void escreveAluno(Aluno aluno) {
        String PATH = "Alunos.xml";

        try {
            XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(PATH)));

            encoder.writeObject(aluno);

            encoder.close();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public Aluno lerAluno(Aluno aluno) {

        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("Alunos.xml")));

            aluno = (Aluno) decoder.readObject();

            decoder.close();

        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return aluno;

    }

}