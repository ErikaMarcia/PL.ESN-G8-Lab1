package models;


import java.util.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Oferta {
    int minInscritos;
    int maxInscritos;
    Professor professor;
    Date anoSemestre;
    Disciplina disciplina;
    Set<Aluno> alunos;

    Oferta() {
        this.alunos = new HashSet<Aluno>();
    }

    void vincularDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    void matricularAluno(Aluno aluno) {
        if (this.alunos.size() < this.maxInscritos) {
            this.alunos.add(aluno);
            aluno.matricular(this);
        }
    }
}
