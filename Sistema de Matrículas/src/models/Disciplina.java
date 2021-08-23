package models;

public class Disciplina {
    String nome;
    int minInscritos;
    int maxInscritos;
    boolean optativa;
    int[] alunos;
    int id;

    public void disciplina(){

    }
    public void confirmarTurma(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMinInscritos() {
        return minInscritos;
    }

    public void setMinInscritos(int minInscritos) {
        this.minInscritos = minInscritos;
    }

    public int getMaxInscritos() {
        return maxInscritos;
    }

    public void setMaxInscritos(int maxInscritos) {
        this.maxInscritos = maxInscritos;
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
    public Disciplina(String nome, int minInscritos, int maxInscritos, boolean optativa, int id) {
        setNome(nome);
        setMinInscritos(minInscritos);
        setMaxInscritos(maxInscritos);
        setOptativa(optativa);
        setId(id);

    }
}
