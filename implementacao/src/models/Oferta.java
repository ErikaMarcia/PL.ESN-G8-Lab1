package models;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Oferta {
    int minInscritos = 3;
    int maxInscritos = 60;
    int id;
    Professor professor;
    Date anoSemestre;
    Disciplina disciplina;

    Set<Aluno> alunos;

    public Oferta(int id, Date anoSemestre) {
        this.anoSemestre = anoSemestre;
        this.id = id;
        this.alunos = new HashSet<Aluno>();
    }

    void vincularDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    void vincularProfessor(Professor professor){
        this.professor = professor;
    }

    void matricularAluno(Aluno aluno) {
        if (this.alunos.size() < this.maxInscritos) {
            this.alunos.add(aluno);
        }else {
            System.out.println("Quantidade maxima de alunos atingida!");
        }
    }

    public int getMinInscritos() {
        return minInscritos;
    }

    public int getMaxInscritos() {
        return maxInscritos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Date getAnoSemestre() {
        return anoSemestre;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public int getId() {
        return id;
    }
}
