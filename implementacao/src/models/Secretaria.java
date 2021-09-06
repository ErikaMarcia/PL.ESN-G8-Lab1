package models;

import java.util.HashSet;
import java.util.Set;

public class Secretaria  {
    private Set<Disciplina> disciplinas;
    private Set<Oferta> ofertas;
    private Set<Professor> professores;
    private Set<Aluno> alunos;

    public Secretaria() {
        this.ofertas = new HashSet<Oferta>();
        this.disciplinas = new HashSet<Disciplina>();
        this.professores = new HashSet<Professor>();
        this.alunos = new HashSet<Aluno>();
    }

    public void cadastrarUsuario(Aluno usuario) {
        Aluno aluno = new Aluno(usuario);
        this.alunos.add(aluno);
    }

    public void cadastrarUsuario(Professor usuario) {
        Professor professor = new Professor(usuario);
        this.professores.add(professor);
    }

//    public void cadastrarUsuario(Usuario usuario) {
//        if (usuario instanceof Aluno) {
//            Aluno aluno = new Aluno(usuario);
//            this.alunos.add(aluno);
//        }
//        if (usuario instanceof Professor) {
//            Professor professor = new Professor(usuario);
//            this.professores.add(professor);
//        }
//    }

//    public void removerUsuario(Usuario usuario){
//        if (usuario instanceof Aluno) {
//            Aluno aluno = new Aluno(usuario);
//            this.alunos.add(aluno);
//        }
//        if (usuario instanceof Professor) {
//            Professor professor = new Professor(usuario);
//            this.professores.add(professor);
//        }
//    }

    public void removerUsuario(Aluno usuario){
        Aluno aluno = new Aluno(usuario);
        this.alunos.remove(aluno);
    }

    public void removerUsuario(Professor usuario){
        Professor professor = new Professor(usuario);
        this.professores.add(professor);
    }

    public Set<Usuario> listarUsuarios() {
        Set<Usuario> usuarios = new HashSet<Usuario>();
        usuarios.addAll(this.professores);
        usuarios.addAll(this.alunos);
        return usuarios;
    }

    public Set<Oferta> listarOfertas() {
        return this.ofertas;
    }

    public Set<Disciplina> listarDisciplinas() {return this.disciplinas;}

    public void cadastrarOferta(Oferta oferta){
        this.ofertas.add(oferta);
    }
    public void cadastarDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public static Set<Secretaria> listarSecretarias() {
        return new HashSet<Secretaria>();
    }

    public void matricularAluno(Oferta oferta, Aluno aluno){
        oferta.matricularAluno(aluno);
    }

    public void vincularDisciplinaEProfessor(Oferta oferta, Professor professor, Disciplina disciplina ) {
        oferta.vincularDisciplina(disciplina);
        oferta.vincularProfessor(professor);
    }
}
