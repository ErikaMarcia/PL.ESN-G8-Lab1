import models.Curso;
import models.Disciplina;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        System.out.println("Abacate");
        CLI cli = new CLI();

        while (true) {
            cli.menu();
        }
    }
}
