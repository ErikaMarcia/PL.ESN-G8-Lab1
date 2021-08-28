package models;

public class Disciplina {
    String nome;
    boolean optativa;
    int[] alunos;
    int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isOptativa() {
        return optativa;
    }

    public void setOptativa(boolean optativa) {
        this.optativa = optativa;
    }

    public int[] getAlunos() {
        return alunos;
    }

    public void setAlunos(int[] alunos) {
        this.alunos = alunos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Disciplina(String nome, boolean optativa, int id) {
        setNome(nome);
        setOptativa(optativa);
        setId(id);

    }
}
