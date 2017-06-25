package model.requerimentos;
import model.entities.Usuario;

public class Requerimento {

	private String numeroProtocolo;

	private Usuario requerente;

	private String status;

	private Usuario areaResponsavel;

	private Usuario USUARIOIMEDIATO;

	private String observacao;

	private PDF documentoAnexado;

	private Date dataCriacao;

	private int prazoEstimado;

	public String getNumeroProtocolo() {
		return null;
	}

}
