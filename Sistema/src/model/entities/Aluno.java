package model.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class Aluno extends Usuario implements Serializable {

	public Disciplina[] getGrade() {
		return grade;
	}

	public void setGrade(Disciplina[] grade) {
		this.grade = grade;
	}

	private Disciplina grade[];

	public void abrirRequerimento() {

	}

	public void cancelarRequerimento() {

	}

	public void atualizarRequerimento() {

	}

	public Aluno(String nome, String cPF, String matricula, String email, LocalDate dataIngresso, String telefone,
			Disciplina[] grade) {
		super(nome, cPF, matricula, email, dataIngresso, telefone);
		this.grade = grade;
	}

}
