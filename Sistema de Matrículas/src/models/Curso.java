package models;

import models.Aluno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Curso {
    private String nome;
    private int creditos;
    private int id;
    private Date inicioMatricula;
    private Date terminoMatricula;
    private ArrayList<Disciplina> disciplina = new ArrayList<>();

    public void InserirDisciplina(Disciplina disciplina){
        this.disciplina.add(disciplina);
    }

    public void ListarDisciplina(){
        ArrayList<Disciplina> disciplinas = getDisciplina();
        Disciplina disciplina;
        for (int i = 0; i < disciplinas.size(); i++) {
            disciplina = disciplinas.get(i);
            System.out.println(disciplina.getId()+" "+disciplina.getNome()+" Optativa: "+ (disciplina.optativa?"Sim":"Não"));
        }
    }

    public void NotificarFinanceiro(Aluno aluno){}

    public void DefinirPeriodoMatricula(String inicioMatricula, String terminoMatricula) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.inicioMatricula = formato.parse(inicioMatricula);
        this.terminoMatricula = formato.parse(terminoMatricula);
    }


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

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public Curso(String nome, int creditos, int id) {
        setNome(nome);
        setCreditos(creditos);
        setId(id);
    }
}
