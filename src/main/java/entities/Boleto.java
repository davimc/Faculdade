package entities;

import javax.persistence.*;
import java.util.Calendar;

public class Boleto {
    @Id @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name="idAluno")
    private Aluno aluno;

    private double mensalidade;
    @Temporal(TemporalType.DATE)
    private Calendar dataVencimento;
    @Temporal(TemporalType.DATE)
    private Calendar dataPagamento;
    private Status status;


    public Boleto(Aluno aluno, double mensalidade, Calendar dataVencimento, Calendar dataPagamento, Status status) {
        this.aluno = aluno;
        this.mensalidade = mensalidade;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Calendar getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Calendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Calendar getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Calendar dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
