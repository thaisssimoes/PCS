package controller;

import dao.ManipuladorXML;
import java.util.ArrayList;
import model.entity.Aluno;

import model.requerimento.Requerimento;

public class Gerenciador {

    public static void main(String[] args) {
        // Login login = new Login();
/*
        //analisaRequerimento(requerimento);
        ManipuladorXML manipulador = new ManipuladorXML("Alunos.xml");
       
       //matricula, cpf, senha, nome, dataNascimeto, 
       //nacionalidade, email, periodo, estadoCivil, 
       //sexo, nomeDaMae, nomeDoPai, deficiencia, 
       //tipoDeEndereco, tipoLogradouro, logradouro, 
       //complemento, estado, telefoneResidencial, bairro, 
       //cidade, telefoneCelular, numero, cep, pais)
       Aluno aluno = new Aluno("18002210002", "12345678901", "123", "Ludwig Van Beethoven",
                "16/12/1770", "Alemã", "ludwig.beethoven@uniriotec.br", "9", "Solteiro", 
               "Masculino", "Maria", "Johann", "Surdo", 
               "Residencial", "Avenida", "AlgumNomeAlemao", "99", "PRU", "2112236666", 
               "NemUm", "Bonn", "21912345678", "66", "12345678", "Prussia");
       Aluno aluno2 = new Aluno("1585210001", "10987654321", "456", "Galileu Galilei",
                "15/02/1564", "Italiana", "galileu.galilei@uniriotec.br", "3", "Solteiro", 
               "Masculino", "Giulia", "Vincenzo", "Não se aplica", 
               "Residencial", "Avenida", "AlgumNomeItaliano", "44", "PIS", "2112236666", 
               "Algum", "Florença", "21912345678", "66", "12345678", "Itália");
       Aluno aluno3 = new Aluno("18941210003", "12345678902", "789", "Oswaldo Gonçalves Cruz",
                "05/08/1872", "Brasileira", "osvaldo.cruz@uniriotec.br", "1", "Solteiro", 
               "Masculino", "Maria", "Jose", "Não se aplica", 
               "Residencial", "Avenida", "AlgumNomePortuguês", "44", "SP", "2112236666", 
               "São Luís", "São Paulo", "21912345678", "66", "12345678", "Brasil");
       
        manipulador.adiciona(aluno);
        manipulador.adiciona(aluno2);
        manipulador.adiciona(aluno3);
        manipulador.escreveXML();
        ArrayList<Aluno> lista;
        lista = manipulador.getLista();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getEmail());

        }
         */
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
        ManipuladorXML manipulador = new ManipuladorXML(String.valueOf(tipoUsuario) + "s.xml");
        manipulador.leXML();
        return manipulador.getLista();
    }
}
