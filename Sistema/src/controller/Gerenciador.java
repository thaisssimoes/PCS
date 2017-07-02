package controller;

import dao.ManipuladorXML;
import java.util.ArrayList;
import model.entity.Aluno;
import model.entity.Professor;
import model.entity.Tecnico;

import model.requerimento.Requerimento;

public class Gerenciador {

    public static void main(String[] args) {

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
        Aluno aluno2 = new Aluno("1585210001", "12345678903", "456", "Galileu Galilei",
                "15/02/1564", "Italiana", "galileu.galilei@uniriotec.br", "3", "Solteiro",
                "Masculino", "Giulia", "Vincenzo", "Não se aplica",
                "Residencial", "Avenida", "AlgumNomeItaliano", "44", "PIS", "2112236666",
                "Algum", "Florença", "21912345678", "66", "12345678", "Itália");
        Aluno aluno3 = new Aluno("18941210003", "12345678902", "789", "Oswaldo Gonçalves Cruz",
                "05/08/1872", "Brasileira", "osvaldo.cruz@uniriotec.br", "1", "Solteiro",
                "Masculino", "Maria", "Jose", "Não se aplica",
                "Residencial", "Avenida", "AlgumNomePortuguês", "44", "SP", "2112236666",
                "São Luís", "São Paulo", "21912345678", "66", "12345678", "Brasil");

        ManipuladorXML manipulador = new ManipuladorXML("Alunos.xml");
        ArrayList<Aluno> lista;

        manipulador.adiciona(aluno);
        manipulador.adiciona(aluno2);
        manipulador.adiciona(aluno3);
        manipulador.escreveXML();
        lista = manipulador.getLista();
        manipulador.leXML();

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getEmail());
        }
        /*
  (siape, regimeTrabalho, classeDocente, titulacao, cargo, cpf, 
          senha, nome, dataNascimeto, nacionalidade, email,
          estadoCivil, sexo, nomeDaMae, nomeDoPai, deficiencia, tipoDeEndereco, 
          tipoLogradouro, logradouro, complemento, estado, telefoneResidencial, 
          bairro, cidade, telefoneCelular, numero, cep, pais);
         */
        Professor prof = new Professor("123456", "Regime3", "Classe3", "Doutora", "Decano",
                "99900011122", "123", "Ada Augusta King", "10/12/1815",
                "Inglesa", "ada.lovelace@uniriotec.br",
                "Casado", "Feminino", "Anne Isabella",
                "Lord Byron", "Nenhuma", "Residencial", "Rua", "Matemática",
                "42", "Byron", "08000099", "EnglishTea", "Londres", "5647483",
                "42", "06987648", "Inglaterra");
        Professor prof2 = new Professor("789012", "Regime2", "Classe2", "Doutora", "Chefe de Departamento",
                "55566677788", "789", "Marie Skłodowska Curie", "07/11/1867",
                "Polonesa", "marie.curie@uniriotec.br",
                "Casada", "Feminino", "Bronisława",
                "Władysław", "Nenhuma", "Residencial", "Rua", "Química",
                "88", "Passy", "5556677", "Local", "Paris", "6655474",
                "88", "64745678", "Polônia");

        Professor prof3 = new Professor("345678", "Regime1", "Classe1", "Doutor", "SemCargo",
                "11122233344", "345", "Albert Einstein", "14/03/1879",
                "Alemã", "albert.einstein@uniriotec.br",
                "Casado", "Masculino", "Pauline",
                "Hermann", "Nenhuma", "Residencial", "Rua", "Fisica",
                "42", "Ulm", "08000099", "Princeton", "Princeton", "08001122",
                "42", "22233356", "Alemanha");
        ManipuladorXML manipulador2 = new ManipuladorXML("Professors.xml");
        ArrayList<Professor> lista2;

        manipulador2.adiciona(prof);
        manipulador2.adiciona(prof2);
        manipulador2.adiciona(prof3);
        manipulador2.escreveXML();
        lista2 = manipulador2.getLista();
        manipulador.leXML();

        for (int i2 = 0; i2 < lista2.size(); i2++) {
            System.out.println(lista2.get(i2).getEmail());

        }

        //(siape, cpf, senha, nome, dataNascimeto, 
        // nacionalidade, email, estadoCivil, sexo, nomeDaMae, nomeDoPai, 
        // deficiencia, tipoDeEndereco, tipoLogradouro, logradouro, 
        // complemento, estado, telefoneResidencial, bairro, cidade, 
        // telefoneCelular, numero, cep, pais)
        Tecnico tecnico = new Tecnico("000111", "12376598707", "000", "Thomas Alva Edison",
                "11/02/1847", "Estadunidense", "thomas.edison@uniriotec.br",
                "Solteiro", "Masculino", "Nancy", "Samuel", "Nenhuma", "Residencial", "Avenida",
                "Das Luzes", "01", "Ohio", "25556769", "Milanhood", "Milan", "5553034", "10", "101607",
                "Estados Unidos");
        Tecnico tecnico2 = new Tecnico("222333", "65748390012", "222", "Nikola Tesla",
                "10/07/1856", "Sérvio", "nikola.tesla@uniriotec.br",
                "Solteiro", "Masculino", "Đuka Mandici", "Milutin Tesla", "Nenhuma", "Residencial", "Avenida",
                "Chocante", "09", "Smiljan", "25556769", "Smiljanhood", "Aust", "5553034", "10", "101607",
                "Império Austríaco");
        Tecnico tecnico3 = new Tecnico("444555", "19181716151", "444", "Neil deGrasse Tyson",
                "05/10/1958", "Estadunidense", "neil.tyson@uniriotec.br",
                "Casado", "Masculino", " Sunchita", "Cyril", "Nenhuma", "Residencial", "Avenida",
                "Dos Planetas", "101", "Manhattan", "25556769", "Manhattanhood", "Nova York", "5553034", "010", "101607",
                "Estados Unidos");

        ManipuladorXML manipulador3 = new ManipuladorXML("Tecnicos.xml");
        ArrayList<Tecnico> lista3;
        manipulador3.adiciona(tecnico);
        manipulador3.adiciona(tecnico2);
        manipulador3.adiciona(tecnico3);
        manipulador3.escreveXML();
        lista3 = manipulador3.getLista();
        manipulador3.leXML();
        for (int i = 0; i < lista3.size(); i++) {
            System.out.println(lista3.get(i).getEmail());
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
        ManipuladorXML manipulador = new ManipuladorXML("Alunos.xml");
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
