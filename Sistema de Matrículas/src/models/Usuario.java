package models;

public abstract class Usuario {
 protected int matricula;
 protected String senha;
 protected String nome;
 protected String origem;

 public void login(int matricula, String senha) {

 }

 public void recuperarSenha(String senha) {

 }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public Usuario(int matricula, String senha, String nome, String origem) {
      setMatricula(matricula);
      setOrigem(origem);
      setNome(nome);
      setSenha(senha);
    }
}
