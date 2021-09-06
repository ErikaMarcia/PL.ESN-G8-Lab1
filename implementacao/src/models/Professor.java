package models;

import java.util.Set;

public class Professor extends Usuario{
    private Set<Disciplina> disciplinas;
    public Professor(int matricula, String senha, String nome, String origem) {
        super(matricula, senha, nome, origem);
    }

    public Professor(Usuario usuario) {
        super(usuario.getMatricula(),
                usuario.getSenha(),
                usuario.getNome(),
                usuario.getOrigem()
        );
    }

    public void consultar(int disciplina) { }
}
