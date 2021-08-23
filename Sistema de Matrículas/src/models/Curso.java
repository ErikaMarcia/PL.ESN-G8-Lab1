package models;

import models.Aluno;

import java.util.Date;

public class Curso {
    private String nome;
    private int creditos;
    private int id;
    private Date inicioMatricula;
    private Date terminoMatricula;

    public void Curso(){}
    public void InserirDisciplina(){}
    public void ListarDisciplina(){}
    public void NotificarFinanceiro(Aluno aluno){}
    public void DefinirPeriodoMatricula(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getInicioMatricula() {
        return inicioMatricula;
    }

    public void setInicioMatricula(Date inicioMatricula) {
        this.inicioMatricula = inicioMatricula;
    }

    public Date getTerminoMatricula() {
        return terminoMatricula;
    }

    public void setTerminoMatricula(Date terminoMatricula) {
        this.terminoMatricula = terminoMatricula;
    }

    public Curso(String nome, int creditos, int id, Date inicioMatricula, Date terminoMatricula) {
        setCreditos(creditos);
        setId(id);
        setInicioMatricula(inicioMatricula);
        setTerminoMatricula(terminoMatricula);
    }
}
