package model.entities;

import java.time.LocalDate;

class Usuario {

	private String nome;

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return CPF;
	}

	private String CPF;

	private String matricula;

	private String email;

	private LocalDate dataIngresso;

	private String telefone;

	public Usuario(String nome, String cPF, String matricula, String email, LocalDate dataIngresso, String telefone) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.matricula = matricula;
		this.email = email;
		this.dataIngresso = dataIngresso;
		this.telefone = telefone;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(LocalDate dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
}
