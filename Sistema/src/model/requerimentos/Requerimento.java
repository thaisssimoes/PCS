package model.requerimentos;

import java.io.File;

public class Requerimento {

	private String numeroProtocolo;

	private Usuario requerente;

	private String status;

	private Usuario areaResponsavel;

	private Usuario USUARIOIMEDIATO;

	private String observacao;

	private File documentoAnexado;

	private LocalDate dataCriacao;

	private int prazoEstimado;

	public String getNumeroProtocolo() {
		return null;
	}

}
