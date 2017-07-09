package model.requerimento;

import java.io.File;
import java.time.Instant;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import model.entity.Disciplina;
import model.entity.Usuario;

public class RequerimentoAnexo {

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
    private String resposta;
    @Getter
    @Setter
    private String tipoRequerimento;
    @Getter
    @Setter
    private File anexo;
    @Getter
    @Setter
    private Disciplina disciplina;

    public RequerimentoAnexo(Usuario requerente, Usuario areaResponsavel, String status, String descricao, LocalDate dataCriacao, LocalDate dataSolucao, String resposta, String tipoRequerimento, File anexo, Disciplina disciplina) {
        this.numeroProtocolo = gerarNumeroProtocolo();
        this.requerente = requerente;
        this.areaResponsavel = areaResponsavel;
        this.status = status;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataSolucao = dataSolucao;
        this.resposta = resposta;
        this.tipoRequerimento = tipoRequerimento;
        this.anexo = anexo;
        this.disciplina = disciplina;
        
    }

    public RequerimentoAnexo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

private String gerarNumeroProtocolo() {
        return Instant.now().toString();
    }    
    
}