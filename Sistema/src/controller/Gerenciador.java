package controller;

import dao.ManipuladorXML;

import java.util.ArrayList;
import model.entity.Aluno;

import model.entity.Professor;
import model.entity.Tecnico;

import model.requerimento.Requerimento;
import view.Login;

public class Gerenciador {

    private static final String REQUERIMENTO = "Requerimentos.xml";
    private static final String PROFESSOR = "Professors.xml";
    private static final String TECNICO = "Tecnicos.xml";
    private static final String ALUNO = "Alunos.xml";

    public static void analisaRequerimento(Requerimento requerimento) {
        if (requerimento.getStatus().equals("TRIAGEM")) {
            ManipuladorXML xml = new ManipuladorXML(REQUERIMENTO);
            xml.leXML();
            ArrayList<Requerimento> listaInicial = xml.getLista();
            ArrayList<Requerimento> listaVazia = new ArrayList<>();

            xml.setLista(listaVazia);
            xml.escreveXML();

            for (int i = 0; i < listaInicial.size(); i++) {
                if (listaInicial.get(i).getNumeroProtocolo().equals(requerimento.getNumeroProtocolo())) {
                    listaInicial.remove(i);
                }
            }

            xml.setLista(listaInicial);
            xml.adiciona(requerimento);
            xml.escreveXML();

        } else if (requerimento.getStatus().equals("DESIGNADO")) {
            ManipuladorXML xml = new ManipuladorXML(REQUERIMENTO);
            xml.leXML();
            ArrayList<Requerimento> listaInicial = xml.getLista();
            ArrayList<Requerimento> listaVazia = new ArrayList<>();

            xml.setLista(listaVazia);
            xml.escreveXML();

            for (int i = 0; i < listaInicial.size(); i++) {
                if (listaInicial.get(i).getNumeroProtocolo().equals(requerimento.getNumeroProtocolo())) {
                    listaInicial.remove(i);
                }
            }

            xml.setLista(listaInicial);
            xml.adiciona(requerimento);
            xml.escreveXML();

        } else if (requerimento.getStatus().equals("CONCLUIDO")) {
            ManipuladorXML xml = new ManipuladorXML(REQUERIMENTO);
            xml.leXML();
            ArrayList<Requerimento> listaInicial = xml.getLista();
            ArrayList<Requerimento> listaVazia = new ArrayList<>();

            xml.setLista(listaVazia);
            xml.escreveXML();

            for (int i = 0; i < listaInicial.size(); i++) {
                if (listaInicial.get(i).getNumeroProtocolo().equals(requerimento.getNumeroProtocolo())) {
                    listaInicial.remove(i);
                }
            }

            xml.setLista(listaInicial);
            xml.adiciona(requerimento);
            xml.escreveXML();

        } else if (requerimento.getStatus().equals("REJEITADO")) {
            ManipuladorXML xml = new ManipuladorXML(REQUERIMENTO);
            xml.leXML();
            ArrayList<Requerimento> listaInicial = xml.getLista();
            ArrayList<Requerimento> listaVazia = new ArrayList<>();

            xml.setLista(listaVazia);
            xml.escreveXML();

            for (int i = 0; i < listaInicial.size(); i++) {
                if (listaInicial.get(i).getNumeroProtocolo().equals(requerimento.getNumeroProtocolo())) {
                    listaInicial.remove(i);
                }
            }

            xml.setLista(listaInicial);
            xml.adiciona(requerimento);
            xml.escreveXML();
        } else if (requerimento.getStatus().equals("PENDENTE")) {
            ManipuladorXML xml = new ManipuladorXML(REQUERIMENTO);
            xml.leXML();
            ArrayList<Requerimento> listaInicial = xml.getLista();
            ArrayList<Requerimento> listaVazia = new ArrayList<>();

            xml.setLista(listaVazia);
            xml.escreveXML();

            for (int i = 0; i < listaInicial.size(); i++) {
                if (listaInicial.get(i).getNumeroProtocolo().equals(requerimento.getNumeroProtocolo())) {
                    listaInicial.remove(i);
                }
            }

            xml.setLista(listaInicial);
            xml.adiciona(requerimento);
            xml.escreveXML();
        }
    }

    public static Aluno obterAluno(String cpf, String senha) {
        ArrayList<Aluno> lista;
        Aluno alunoObtido;
        alunoObtido = null;
        ManipuladorXML manipulador = new ManipuladorXML(ALUNO);
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

    public static Tecnico obterTecnico(String cpf, String senha) {
        ArrayList<Tecnico> lista;
        Tecnico tecnicoObtido;
        tecnicoObtido = null;
        ManipuladorXML manipulador = new ManipuladorXML(TECNICO);
        manipulador.leXML();
        lista = manipulador.getLista();
        for (int i = 0; i < lista.size(); i++) {
            if ((lista.get(i).getCpf().equals(cpf)) && lista.get(i).getSenha().equals(senha)) {
                tecnicoObtido = lista.get(i);
                return tecnicoObtido;
            }
        }
        return tecnicoObtido;
    }

    public static Professor obterProfessorDisciplina(String disciplina) {
        ArrayList<Professor> lista;
        Professor professorObtido;
        professorObtido = null;
        ManipuladorXML manipulador = new ManipuladorXML(PROFESSOR);
        manipulador.leXML();
        lista = manipulador.getLista();
        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i).getGrade().get(i));
//
            if ((lista.get(i).getGrade().contains(disciplina))) {
                
                professorObtido = lista.get(i);
                return professorObtido;
            }
        }
        return professorObtido;
    }

    public static Professor obterProfessorCargo(String cargo) {

        ArrayList<Professor> lista;
        Professor professorObtido;
        professorObtido = null;
        ManipuladorXML manipulador = new ManipuladorXML(PROFESSOR);
        manipulador.leXML();
        lista = manipulador.getLista();
        for (int i = 0; i < lista.size(); i++) {
            if ((lista.get(i).getCargo().equals(cargo))) {
                professorObtido = lista.get(i);
                return professorObtido;
            }
        }
        return professorObtido;
    }

    public static Tecnico criarTecnicoGenerico() {
        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Tecnico Generico");
        tecnico.setCpf("0000");
        return tecnico;
    }

    public static Professor obterProfessorCPF(String cpf, String senha) {
        ArrayList<Professor> lista;
        Professor professorObtido;
        professorObtido = null;
        ManipuladorXML manipulador = new ManipuladorXML(PROFESSOR);
        manipulador.leXML();
        lista = manipulador.getLista();
        for (int i = 0; i < lista.size(); i++) {
            if ((lista.get(i).getCpf().equals(cpf)) && lista.get(i).getSenha().equals(senha)) {
                professorObtido = lista.get(i);
                return professorObtido;
            }
        }
        return professorObtido;
    }

    public static ArrayList<Requerimento> buscarTriagem() {
        ManipuladorXML xml = new ManipuladorXML(REQUERIMENTO);
        xml.leXML();
        ArrayList<Requerimento> lista = xml.getLista();
        ArrayList<Requerimento> listaRetorno = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getStatus().equals("TRIAGEM")) {
                listaRetorno.add(lista.get(i));
            }
        }
        return listaRetorno;
    }

    public static ArrayList<Requerimento> buscarRequerimentoProtocolo(String numeroProtocolo) {
        ManipuladorXML xml = new ManipuladorXML(REQUERIMENTO);
        xml.leXML();
        ArrayList<Requerimento> lista = xml.getLista();
        ArrayList<Requerimento> listaRetorno = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNumeroProtocolo().equals(numeroProtocolo)) {
                listaRetorno.add(lista.get(i));
            }
        }
        return listaRetorno;
    }

    public static ArrayList<Requerimento> buscarRequerimentoCPF(String cpf) {
        ManipuladorXML xml = new ManipuladorXML(REQUERIMENTO);
        xml.leXML();
        ArrayList<Requerimento> lista = xml.getLista();
        ArrayList<Requerimento> listaRetorno = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getRequerente().getCpf().equals(cpf)) {
                listaRetorno.add(lista.get(i));
            }
        }
        return listaRetorno;
    }

    public static ArrayList<Requerimento> buscarRequerimentoRequerenteAluno() {
        ManipuladorXML xml = new ManipuladorXML(REQUERIMENTO);
        xml.leXML();
        ArrayList<Requerimento> lista = xml.getLista();
        ArrayList<Requerimento> listaRetorno = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getRequerente() instanceof model.entity.Aluno) {
                listaRetorno.add(lista.get(i));
            }
        }
        return listaRetorno;
    }

    public static ArrayList<Requerimento> buscarRequerimentoRequerenteProfessor() {
        ManipuladorXML xml = new ManipuladorXML(REQUERIMENTO);
        xml.leXML();
        ArrayList<Requerimento> lista = xml.getLista();
        ArrayList<Requerimento> listaRetorno = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getRequerente() instanceof model.entity.Professor) {
                listaRetorno.add(lista.get(i));
            }
        }
        return listaRetorno;
    }

    public static ArrayList<Requerimento> buscarRequerimentoAreaResponsavelProfessor() {
        ManipuladorXML xml = new ManipuladorXML(REQUERIMENTO);
        xml.leXML();
        ArrayList<Requerimento> lista = xml.getLista();
        ArrayList<Requerimento> listaRetorno = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getAreaResponsavel() instanceof model.entity.Professor) {
                listaRetorno.add(lista.get(i));
            }
        }
        return listaRetorno;
    }

    public static ArrayList<Requerimento> buscarRequerimentoAreaResponsavelTecnico() {
        ManipuladorXML xml = new ManipuladorXML(REQUERIMENTO);
        xml.leXML();
        ArrayList<Requerimento> lista = xml.getLista();
        ArrayList<Requerimento> listaRetorno = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getAreaResponsavel() instanceof model.entity.Tecnico && lista.get(i).getStatus().equals("DESIGNADO")) {
                listaRetorno.add(lista.get(i));
            }
        }
        return listaRetorno;
    }

    public static ArrayList<Requerimento> buscarRequerimentoFinalizado() {
        ManipuladorXML xml = new ManipuladorXML(REQUERIMENTO);
        xml.leXML();
        ArrayList<Requerimento> lista = xml.getLista();
        ArrayList<Requerimento> listaRetorno = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getStatus().equals("REJEITADO") ||  lista.get(i).getStatus().equals("CONCLUIDO") ) {
                
                    listaRetorno.add(lista.get(i));
                
            }
        }
        return listaRetorno;
    }
    
    
    public static ArrayList<Requerimento> buscarRequerimentoAreaResponsavelProfessorDesignado(String cpf) {
        ManipuladorXML xml = new ManipuladorXML(REQUERIMENTO);
        xml.leXML();
        ArrayList<Requerimento> lista = xml.getLista();
        ArrayList<Requerimento> listaRetorno = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getStatus().equals("DESIGNADO")) {
                        
                if (lista.get(i).getAreaResponsavel().getCpf().equals(cpf)) {
                    listaRetorno.add(lista.get(i));
                }
            }
        }
        return listaRetorno;
    }
public static ArrayList<Requerimento> buscarRequerimentoAreaResponsavelProfessorDesignadoPendente(String cpf) {
        ManipuladorXML xml = new ManipuladorXML(REQUERIMENTO);
        xml.leXML();
        ArrayList<Requerimento> lista = xml.getLista();
        ArrayList<Requerimento> listaRetorno = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getStatus().equals("PENDENTE")) {
                        
                if (lista.get(i).getAreaResponsavel().getCpf().equals(cpf)) {
                    listaRetorno.add(lista.get(i));
                }
            }
        }
        return listaRetorno;
    }
    public static ArrayList<Requerimento> buscarRequerimentoAreaResponsavelProfessorFinalizado(String cpf) {
        ManipuladorXML xml = new ManipuladorXML(REQUERIMENTO);
        xml.leXML();
        ArrayList<Requerimento> lista = xml.getLista();
        ArrayList<Requerimento> listaRetorno = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {

            if ((lista.get(i).getStatus().equals("CONCLUIDO") )|| (lista.get(i).getStatus().equals("REJEITADO"))) {
                        
                if (lista.get(i).getAreaResponsavel().getCpf().equals(cpf)) {
                    listaRetorno.add(lista.get(i));
                }
            }
        }
        return listaRetorno;
    }
    public static ArrayList acessarXML(String tipoUsuario) {
        ManipuladorXML manipulador = new ManipuladorXML(String.valueOf(tipoUsuario) + "s.xml");
        manipulador.leXML();
        return manipulador.getLista();
    }
}
