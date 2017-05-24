package dao;

import java.time.LocalDate;
import java.util.ArrayList;

import model.entities.Aluno;
import model.entities.Disciplina;
import utils.XMLHandler;

public class DAO {

	private final static String ALUNOSXML = "C://alunos.xml";
	private final static String PROFESSORXML = "/professores.xml";
	private final static String TECNICOXML = "/tecnicos.xml";
	private final static String REQUERIMENTOSXML = "/requerimentos.xml";

	public static void main(String[] args) {
		LocalDate ingresso = LocalDate.now();
		Disciplina[] grade = new Disciplina[] { new Disciplina("PCS", "IMPOSSIVEL") };
		Aluno alunoteste = new Aluno("Thais", "987654321", "53417386", "thais.ferreira@gmail.com", ingresso,
				"2153647574", grade);
		manipulaAluno(alunoteste, "WRITE");
		manipulaAluno(alunoteste, "READ");
	}

	public static void manipulaAluno(Aluno aluno, String operacao) {
		XMLHandler<Aluno> manipulador = new XMLHandler<>(ALUNOSXML);
		switch (operacao) {
		case "WRITE":
			manipulador.escreveXML(aluno);
			
			break;
		case "READ":
			manipulador.leXML();
			manipulador.getLista();
		case "UPDATE":
			manipulador.leXML();
			ArrayList<Aluno> listaAluno = manipulador.getLista();
			for (Aluno element : listaAluno) {
				if (aluno.getCPF() == element.getCPF()) {
					manipulador.escreveXML(aluno);
					break;
				}
			}
			break;
		default:
			break;
		}
	}
}
