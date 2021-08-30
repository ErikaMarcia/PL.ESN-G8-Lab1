import models.Secretaria;
import views.SecretariaView;

import java.util.Scanner;

public class CLI {
    private SecretariaView secretariaView;
    CLI() {
        secretariaView = new SecretariaView();
    }

    void menu() {
        this.listarOpcoes();
        System.out.print("Opção: ");
        int input = CLI.lerEntrada();
        this.escolherOpcao(input);
    }

    void listarOpcoes() {
        System.out.print(
            "\n\n=== CLI: Opções ===\n" +
                    "(1) Listar Secretarias\n" +
                    "(2) Selecionar Secretaria\n"

        );
    }

    void escolherOpcao(int opcao) {
        switch (opcao) {
            case 1:
                secretariaView.listarSecretarias();
                break;

            case 2:
                int input = solicitarEntrada();
                secretariaView.selecionarSecretaria(input);
                break;
        }
    }

    public static int solicitarEntrada(String textoPersonaliado) {
        String texto = textoPersonaliado.isEmpty() ?
                "Entrada: " : textoPersonaliado;

        System.out.print(texto);
        int input = CLI.lerEntrada();
        return input;
    }

    public static int lerEntrada() {
        Scanner leitor = new Scanner(System.in);
        return leitor.nextInt();
    }
}
