import models.Curso;
import models.Disciplina;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        Curso engenharia;
        engenharia = new Curso("Engenharia", 10, 01);
        Disciplina disciplina = new Disciplina("Engenharia de requisitos", false, 01);
        Disciplina disciplina2 = new Disciplina("Engenharia de sistemas", false, 02);
        engenharia.InserirDisciplina(disciplina);
        engenharia.InserirDisciplina(disciplina2);
        System.out.println(engenharia.getDisciplina().get(1).getNome());
        System.out.println(engenharia.getDisciplina().get(0).getNome());
        engenharia.ListarDisciplina();
        engenharia.DefinirPeriodoMatricula("09/01/2020", "25/02/2020");
        System.out.println(engenharia.getInicioMatricula());
        System.out.println(engenharia.getTerminoMatricula());

    }
}
