package models;

public class Professor extends Usuario{

    public Professor(int matricula, String senha, String nome, String origem) {
        super(matricula, senha, nome, origem);
    }

    public void consultar(int disciplina) { }
}
