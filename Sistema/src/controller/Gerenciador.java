package controller;

import dao.ManipuladorXML;
import java.util.ArrayList;
import model.entity.Aluno;

import model.requerimento.Requerimento;

public class Gerenciador {

    public static void main(String[] args) {
        // Login login = new Login();

        Aluno aluno1 = new Aluno("123", "sol", "Galileu", "galileu@blablabla.com", "171-17171", "12345678");
        Aluno aluno2 = new Aluno("456", "jupiter", "Galilei", "galilei@blablabla.com", "171-17171", "12345678");
        Aluno aluno3 = new Aluno("789", "stav", "Thay", "99@blablabla.com", "171-17171", "12345678");
        Aluno aluno4 = new Aluno("101112", "stav", "Thay", "99@blablabla.com", "171-17171", "12345678");
        Aluno aluno5 = new Aluno("131415", "stav", "Thay", "99@blablabla.com", "171-17171", "12345678");
        Aluno aluno6 = new Aluno("161718", "stav", "Thay", "99@blablabla.com", "171-17171", "12345678");

        //analisaRequerimento(requerimento);
        ManipuladorXML manipulador = new ManipuladorXML("alunos.xml");
        //manipulador.adiciona(aluno1);
        //manipulador.adiciona(aluno2);
       // manipulador.escreveXML();
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
        ListaAluno listaAluno = new ListaAluno();
        listaAluno.getLista().add(requerimento);

    }

    private static void encaminharParaProfessor(Requerimento requerimento) {
        ListaProfessor listaProfessor = new ListaProfessor();
        listaProfessor.getLista().add(requerimento);

    }

    public static ArrayList acessarXML(String tipoUsuario) {
        ManipuladorXML manipulador = new ManipuladorXML(String.valueOf(tipoUsuario) + ".xml");
        manipulador.leXML();
        return manipulador.getLista();
    }
}
