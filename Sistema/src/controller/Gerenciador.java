package controller;

import dao.XMLHandler;
import java.beans.XMLDecoder;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.time.LocalDate;
import model.entity.Aluno;
import model.entity.Professor;

import model.requerimento.Requerimento;
import view.Login;

public class Gerenciador {

    public static void main(String[] args) {
        //  Login login = new Login();

        Aluno aluno = new Aluno("555", "stav", "Thay", "99@blablabla.com", "171-17171", "12345678");

        XMLHandler xml = new XMLHandler();

        //analisaRequerimento(requerimento);
        xml.escreveAluno(aluno);

    }

    public static void analisaRequerimento(Requerimento requerimento) {
        if (requerimento.getStatus().equals("TRIAGEM")) {
            encaminharParaTecnico(requerimento);
//
//        } else {
//            if (requerimento.getStatus().equals("ATRIBUIDO")) {
//                if (requerimento.getAreaResponsavel().getClass().equals(Aluno.class)) {
//                    encaminharParaAluno(requerimento);
//                } else if (requerimento.getAreaResponsavel().getClass().equals(Professor.class)) {
//                    encaminharParaProfessor(requerimento);
//                } else if (requerimento.getAreaResponsavel().getClass().equals(Tecnico.class)) {
//                    encaminharParaTecnico(requerimento);
//                }
//            }
//        }
        }
    }

    public static Aluno obterAluno(String cpf, String senha) {
        String PATH = "alunos.xml";
        Aluno loginAluno = new Aluno();

        try {
            FileInputStream fis = new FileInputStream(PATH);
            BufferedInputStream buff = new BufferedInputStream(fis);

            XMLDecoder decoder = new XMLDecoder(buff);

            loginAluno = (model.entity.Aluno) decoder.readObject();
            if (loginAluno.getCpf().equals(cpf)) {
                senha = loginAluno.getSenha();
            }
            decoder.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return loginAluno;
    }

    private static void encaminharParaTecnico(Requerimento requerimento) {
        ListaTecnico listaTecnico = new ListaTecnico();
        listaTecnico.getLista().add(requerimento);

    }

    private static void encaminharParaAluno(Requerimento requerimento) {
        ListaAluno listaAluno = new ListaAluno();
        listaAluno.getLista().add(requerimento);

    }

    private static void encaminharParaProfessor(Requerimento requerimento) {
        ListaProfessor listaProfessor = new ListaProfessor();
        listaProfessor.getLista().add(requerimento);

    }

    private static void criar(Requerimento requerimento) {

    }
}
