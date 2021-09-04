

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        //curso = g.fromJson(json, Curso.class);
        CLI cli = new CLI();

        while (true) {
            cli.menu();
        }
    }
}
