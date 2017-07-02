package controller;

import dao.ManipuladorXML;
import java.util.ArrayList;
import model.entity.Aluno;

import model.requerimento.Requerimento;

public class Gerenciador {

    public static void main(String[] args) {
        // Login login = new Login();


        //analisaRequerimento(requerimento);
        ManipuladorXML manipulador = new ManipuladorXML("alunos.xml");
<<<<<<< HEAD
        //manipulador.adiciona(aluno1);
        //manipulador.adiciona(aluno2);
       // manipulador.escreveXML();
=======
>>>>>>> e3e1dcbdd6b52f4c970850c476a440e41301886a
        manipulador.leXML();
        ArrayList<Aluno> lista = manipulador.getLista();
        for(int i =0; i<lista.size(); i++ ){
        System.out.println(lista.get(i).getEmail());
        }
    }

    public static void analisaRequerimento(Requerimento requerimento) {
        if (requerimento.getStatus().equals("TRIAGEM")) {
            ManipuladorXML xml = new ManipuladorXML("Requerimentos.xml");
            xml.adiciona(requerimento);
            xml.escreveXML();

            //    encaminharParaTecnico(requerimento);
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
        ArrayList<Aluno> lista;
        Aluno alunoObtido;
        alunoObtido = null;
        ManipuladorXML manipulador = new ManipuladorXML("alunos.xml");
        manipulador.leXML();
        lista = manipulador.getLista();
        for (int i = 0; i < lista.size(); i++) {
            if ((lista.get(i).getCpf().equals(cpf)) && lista.get(i).getSenha().equals(senha)) {
                alunoObtido = lista.get(i);
                return alunoObtido;
            }
        }
        return alunoObtido;
    }

    private static void encaminharParaTecnico(Requerimento requerimento) {
        ManipuladorXML xml = new ManipuladorXML("");

    }

    private static void encaminharParaAluno(Requerimento requerimento) {

    }

    private static void encaminharParaProfessor(Requerimento requerimento) {

    }

    public static ArrayList acessarXML(String tipoUsuario) {
        ManipuladorXML manipulador = new ManipuladorXML(String.valueOf(tipoUsuario) + ".xml");
        manipulador.leXML();
        return manipulador.getLista();
    }
}
