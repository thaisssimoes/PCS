package model.requerimento;

import java.time.Instant;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import model.entity.Usuario;

public class Requerimento {

    @Getter
    @Setter
    private String numeroProtocolo;
    @Getter
    @Setter
    private Usuario requerente;
    @Getter
    @Setter
    private Usuario areaResponsavel;
    @Getter
    @Setter
    private String status;
    @Getter
    @Setter
    private String descricao;
    @Getter
    @Setter
    private LocalDate dataCriacao;
    @Getter
    @Setter
    private LocalDate dataSolucao;
    @Getter
    @Setter
    private String feedback;

    public Requerimento(Usuario requerente, Usuario areaResponsavel, String status, String descricao,
            LocalDate dataCriacao, LocalDate dataSolucao, String feedback) {
        super();
        this.requerente = requerente;
        this.areaResponsavel = areaResponsavel;
        this.status = status;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataSolucao = dataSolucao;
        this.feedback = feedback;
        this.numeroProtocolo = gerarNumeroProtocolo();
    }

    private String gerarNumeroProtocolo() {
        return Instant.now().toString();
    }
}
