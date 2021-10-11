package aula01;

import aula01.animais.Cachorro;

public class ClassePrincipal {
    public static void main(String args[]) {
        Cachorro c1 = new Cachorro("Bolinha", 1, "Auuuuuuu");
        Cachorro c2 = new Cachorro("Rex", 2, "Au");

        String latidoNovo = c1.latir("Auuuuuuuuu");

        System.out.println(c1.toString());

    }
}
