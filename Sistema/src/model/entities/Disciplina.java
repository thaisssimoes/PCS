package model.entities;

import java.io.Serializable;

public class Disciplina implements Serializable {

	public Disciplina(String nome, String tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}

	private String nome;
	private String tipo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
