package entities;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Aluno {
    @Id @GeneratedValue
    private int id;
    @OneToMany(mappedBy = "aluno", targetEntity=Boleto.class,fetch= FetchType.LAZY,cascade = CascadeType.ALL)
    private ArrayList<Boleto> boletos;


    private String nome;
    private String email;
    private String telefone;

    public Aluno(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.boletos = new ArrayList<Boleto>();
    }

    public Aluno(ArrayList<Boleto> boletos, String nome, String email, String telefone) {
        this.boletos = boletos;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Boleto> getIdBoleto() {
        return boletos;
    }

    public void setIdBoleto(Boleto novoBoleto) {
        this.boletos.add(novoBoleto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
