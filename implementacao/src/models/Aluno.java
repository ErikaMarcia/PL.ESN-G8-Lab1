package models;

import java.util.Set;

public class Aluno extends Usuario{
    private Set<Oferta> ofertas;

    public Aluno(int matricula, String senha, String nome, String origem) {
        super(matricula, senha, nome, origem);
    }

    public void matricular(Oferta oferta) {
        this.ofertas.add(oferta);
    }

    public void cancelarMatricula(Oferta oferta) {
        this.ofertas.remove(oferta);
    }
}
