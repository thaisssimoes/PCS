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

        Usuario usuario = new Aluno("133", "Raf", "datanacs", "endreco");
        Usuario usuarioprof = new Professor("555", "stav", "datanacs2", "endreco2");
        Requerimento requerimento = new Requerimento(usuario, usuarioprof, "TRIAGEM", "Descricao", LocalDate.now(), null, "feedback");
        XMLHandler xml = new XMLHandler();
        Aluno alunoTeste = xml.LerXmlProduto("133");

        analisaRequerimento(requerimento);
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
