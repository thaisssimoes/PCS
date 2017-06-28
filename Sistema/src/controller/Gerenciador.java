package controller;

import dao.XMLHandler;
import java.time.LocalDate;
import model.entity.Aluno;
import model.entity.Professor;
import model.entity.Tecnico;
import model.entity.Usuario;
import model.requerimento.Requerimento;
import view.Login;

public class Gerenciador {

    public static void main(String[] args) {
        //  Login login = new Login();

        Aluno usuario1 = new Aluno("133", "senha123");
        Aluno usuario2 = new Aluno("999", "456senha");
        Professor usuarioprof = new Professor("555", "stav", "datanacs2", "endreco2");
        Requerimento requerimento = new Requerimento(usuario1, usuarioprof, "TRIAGEM", "Descricao", LocalDate.now(), null, "feedback");
        XMLHandler xml = new XMLHandler();

        //analisaRequerimento(requerimento);
        xml.escreveAluno(usuario1);
        xml.escreveAluno(usuario2);

        System.out.println(xml.lerAluno(usuario1).getCpf());
        System.out.println(xml.lerAluno(usuario1).getSenha());
        System.out.println(xml.lerAluno(usuario2).getCpf());
        System.out.println(xml.lerAluno(usuario2).getSenha());
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
