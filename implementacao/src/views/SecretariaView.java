package views;

import com.google.gson.Gson;
import models.*;

import java.io.File;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SecretariaView {
    Secretaria secretaria = new Secretaria();

    public void listarSecretarias() {
        System.out.println("= Listando Secretarias =");

        Set<Secretaria> secretarias = Secretaria.listarSecretarias();
        for (Secretaria secretaria : secretarias) {
            System.out.println("1. " + secretaria);
        }
    }

    public void selecionarSecretaria(int id) {
    }
    public void cadastrarAluno(){

        int matricula = Integer.parseInt(solicitarEntrada("Digite a matricula do aluno "));

        String senha = solicitarEntrada("Digite a senha do aluno ");

        String nome = solicitarEntrada("Digite o nome do aluno ");

        Aluno aluno = new Aluno(matricula, senha, nome, "Aluno");
        secretaria.cadastrarUsuario(aluno);
    }

    public void cadastrarProfessor(){

        int matricula = Integer.parseInt(solicitarEntrada("Digite a matricula do professor "));
        String senha = solicitarEntrada("Digite a senha do professor ");
        String nome = solicitarEntrada("Digite o nome do professor ");;
        Professor professor = new Professor(matricula, senha, nome, "Professor");
        secretaria.cadastrarUsuario(professor);
    }

    public void cadastrarDisciplina(){
        String nome = solicitarEntrada("Qual o nome da disciplina? ");
        boolean optativa = solicitarEntrada("É uma disciplina optativa? ").equals("Sim");
        int id = Integer.parseInt(solicitarEntrada("Digite o id da disciplina: "));;
        Disciplina disciplina = new Disciplina(nome, optativa, id);
        secretaria.cadastarDisciplina(disciplina);
    }

    public void cadastrarOferta() throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("MM/yyyy");
        int id = Integer.parseInt(solicitarEntrada("Qual o id da oferta? "));
        Date anoSemestre = formato.parse(solicitarEntrada("Digite o semestre da oferta: (MM/AA) "));
        int idProfessor = Integer.parseInt(solicitarEntrada("Qual a matricula do professor? "));
        int idDisciplina = Integer.parseInt(solicitarEntrada("Qual o id da disciplina? "));
        Oferta oferta = new Oferta(id, anoSemestre);

        try {
            Usuario usuario = secretaria.listarUsuarios().stream().filter(e -> e.getMatricula() == idProfessor).findFirst().orElse(null);
            Professor professor = new Professor(usuario.getMatricula(), usuario.getSenha(), usuario.getNome(), usuario.getOrigem());
            Disciplina disciplina = secretaria.listarDisciplinas().stream().filter(e -> e.getId() == idDisciplina).findFirst().orElse(null);
            secretaria.vincularDisciplinaEProfessor(oferta, professor, disciplina);
            secretaria.cadastrarOferta(oferta);
        } catch (Exception e){
            e.getMessage();
        }
    }

    public void listarUsuarios(){
        Set<Usuario> usuarios = secretaria.listarUsuarios();
        Iterator<Usuario> usuarioAsIterator = usuarios.iterator();
        while (usuarioAsIterator.hasNext()){
            Usuario usuario = usuarioAsIterator.next();
            System.out.println("Matricula: "+usuario.getMatricula()+
                    " | Nome: "+usuario.getNome()+
                    " | Origem: "+usuario.getOrigem()+
                    " \n"
            );
        }
    }
    public void listarOfertas(){
        Set<Oferta> ofertas = secretaria.listarOfertas();
        Iterator<Oferta> ofertaAsIterator = ofertas.iterator();
        while (ofertaAsIterator.hasNext()){
            Oferta oferta = ofertaAsIterator.next();
            System.out.println("Disciplina: "+oferta.getDisciplina().getNome()+
                    " | Professor: "+oferta.getProfessor().getNome()+
                    " | Semestre: "+oferta.getAnoSemestre()+
                    " | Limite max de alunos: "+oferta.getMaxInscritos()+
                    " | Limite min de alunos: "+oferta.getMinInscritos()+
                    "\n"
            );
        }
    }

    public  void listarDisciplinas(){
        Set<Disciplina> disciplinas = secretaria.listarDisciplinas();
        Iterator<Disciplina> disciplinaAsIterator = disciplinas.iterator();
        while (disciplinaAsIterator.hasNext()){
            Disciplina disciplina = disciplinaAsIterator.next();
            System.out.println("Disciplina: "+disciplina.getNome()+
                    " | id: "+disciplina.getId()+
                    " | optativa: "+(disciplina.isOptativa()?"Sim":"Não")+
                    "\n"
                    );
        }
    }
    public void matricularAluno(){
        int idOferta = Integer.parseInt(solicitarEntrada("Digite o id do Curso: "));
        int idAluno = Integer.parseInt(solicitarEntrada("Digite o id do aluno"));
        Oferta oferta = secretaria.listarOfertas().stream().filter(e -> e.getId() == idOferta).findFirst().orElse(null);
        Usuario usuario = secretaria.listarUsuarios().stream().filter(e -> e.getMatricula() == idAluno).findFirst().orElse(null);
        Aluno aluno = new Aluno(usuario.getMatricula(), usuario.getSenha(), usuario.getNome(), usuario.getOrigem());
        secretaria.matricularAluno(oferta, aluno);
    }

    public static String solicitarEntrada(String texto) {

        System.out.print(texto);
        String input = lerEntrada();
        return input;
    }

    public static String lerEntrada() {
        Scanner leitor = new Scanner(System.in);
        return leitor.next();
    }

    public void salvar() {
        Gson g = new Gson();
        String json = g.toJson(secretaria);
        write(json);
    }
    public void write(String json) {
        try{
            File arquivo = new File("src/data/secretaria.txt");
            FileWriter gravarArquivo = new FileWriter(arquivo, false);
            gravarArquivo.append(json);
            gravarArquivo.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
