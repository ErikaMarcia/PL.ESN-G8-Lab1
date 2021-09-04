import views.SecretariaView;

import java.text.ParseException;
import java.util.Scanner;

public class CLI {
    private SecretariaView secretariaView;
    CLI() {
        secretariaView = new SecretariaView();
    }

    void menu() throws ParseException {
        this.listarOpcoes();
        System.out.print("Opção: ");
        int input = CLI.lerEntrada();
        this.escolherOpcao(input);
    }

    void listarOpcoes() {
        System.out.print(
            "\n\n=== CLI: Opções ===\n" +
                    "(1) Cadastrar novo aluno\n" +
                    "(2) Cadastrar novo professor\n" +
                    "(3) Cadastrar nova oferta\n" +
                    "(4) Cadastrar nova disciplina\n" +
                    "(5) Adicionar aluno à oferta\n" +
                    "(6) Listar ofertas\n" +
                    "(7) Listar usuarios\n" +
                    "(8) Listar Disciplinas\n" +
                    "(9) Salvar dados\n"

        );
    }

    void escolherOpcao(int opcao) throws ParseException {
        switch (opcao) {
            case 1:
                secretariaView.cadastrarAluno();
                break;
            case 2:
                secretariaView.cadastrarProfessor();
                break;
            case 3:
                secretariaView.cadastrarOferta();
                break;
            case 4:
                secretariaView.cadastrarDisciplina();
                break;
            case 5:
                secretariaView.matricularAluno();
                break;
            case 6:
                secretariaView.listarOfertas();
                break;
            case 7:
                secretariaView.listarUsuarios();
                break;
            case 8:
                secretariaView.listarDisciplinas();
                break;
            case 9:
                secretariaView.salvar();
                break;
        }
    }

    public static int solicitarEntrada() {
        String texto = "Entrada: ";

        System.out.print(texto);
        int input = CLI.lerEntrada();
        return input;
    }

    public static int lerEntrada() {
        Scanner leitor = new Scanner(System.in);
        return leitor.nextInt();
    }
}
