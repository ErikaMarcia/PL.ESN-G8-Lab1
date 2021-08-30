package views;

import models.Secretaria;

import java.util.Set;

public class SecretariaView {
    Secretaria secretaria;

    public void listarSecretarias() {
        System.out.println("= Listando Secretarias =");

        Set<Secretaria> secretarias = Secretaria.listarSecretarias();
        for (Secretaria secretaria : secretarias) {
            System.out.println("1. " + secretaria);
        }
    }

    public void selecionarSecretaria(int id) {
    }


}
