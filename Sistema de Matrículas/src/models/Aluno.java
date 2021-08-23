package models;

public class Aluno extends Usuario{
    private Disciplina disciplina;

    public void CancelarMatricula(Disciplina disciplina) {

    }
    public Aluno(int matricula, String senha, String nome, String origem) {
        super(matricula, senha, nome, origem);
    }
}
