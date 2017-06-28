package controller;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import model.entity.Aluno;
import model.entity.Professor;
import model.entity.Tecnico;

public class Autenticacao {

    public static boolean reconhecerUsuario(String tipoUsuario, String cpfTela, String senhaTela) {
        String PATH = "";
        if (tipoUsuario.equals("Aluno")) {
            PATH = "alunos.xml";
        } else if (tipoUsuario.equals("Tecnico")) {
            PATH = "tecnicos.xml";
        } else {
            PATH = "professores.xml";
        }

        String senha;
        boolean autenticado = false;

        Aluno loginAluno = new Aluno();
        Professor loginProfessor = new Professor();
        Tecnico loginTecnico = new Tecnico();

        try {
            FileInputStream fis = new FileInputStream(PATH);
            BufferedInputStream buff = new BufferedInputStream(fis);

            XMLDecoder decoder = new XMLDecoder(buff);

            if (tipoUsuario == "Aluno") {

                loginAluno = (model.entity.Aluno) decoder.readObject();
                if (loginAluno.getCpf().equals(cpfTela)) {
                    senha = loginAluno.getSenha();
                    autenticado = autenticacao(senha, senhaTela);

                }

            } else if (tipoUsuario == "Tecnico") {
                while (decoder.readObject() != null || autenticado == true) {
                    loginTecnico = (Tecnico) decoder.readObject();
                    if (loginTecnico.getCpf().equals(cpfTela)) {
                        senha = loginTecnico.getSenha();
                        autenticado = autenticacao(senha, senhaTela);

                    }
                }
            } else {
                while (decoder.readObject() != null || autenticado == true) {
                    loginProfessor = (Professor) decoder.readObject();
                    if (loginProfessor.getCpf().equals(cpfTela)) {
                        senha = loginProfessor.getSenha();
                        autenticado = autenticacao(senha, senhaTela);

                    }
                }

            }
            decoder.close();
            return autenticado;

        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return autenticado;
    }

    public static boolean autenticacao(String senha, String senhaTela) {

        /*
        
			se classe da tela tem o mesmo cpf e password é o mesmo da tela, retorna true;
         */
        if (senha.equals(senhaTela)) {
            return true;
        } else {
            return false;
        }
    }

}
