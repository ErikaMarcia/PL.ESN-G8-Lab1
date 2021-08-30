package models;

import views.SecretariaView;

import java.util.HashSet;
import java.util.Set;

public class Secretaria extends Usuario {
    private Set<Disciplina> disciplinas;
    private Set<Oferta> ofertas;
    private Set<Usuario> usuarios;

    public Secretaria(int matricula, String senha, String nome, String origem) {
        super(matricula, senha, nome, origem);
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


    public static Set<Secretaria> listarSecretarias() {
        return new HashSet<Secretaria>();
    }
}
