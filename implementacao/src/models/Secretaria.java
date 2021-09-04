package models;

import java.util.HashSet;
import java.util.Set;

public class Secretaria  {
    private Set<Disciplina> disciplinas;
    private Set<Oferta> ofertas;
    private Set<Usuario> usuarios;

    public Secretaria() {

        this.usuarios = new HashSet<Usuario>();
        this.ofertas = new HashSet<Oferta>();
        this.disciplinas = new HashSet<Disciplina>();
    }

    public void cadastrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario){
        this.usuarios.remove(usuario);
    }

    public Set<Usuario> listarUsuarios() {
        return this.usuarios;
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
