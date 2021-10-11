package aula01;

import aula01.animais.Cachorro;

import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {
        Cachorro c3 = new Cachorro();
        String nome = "";
        String latido="";
        int idade;

        // Recebe entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Usuário, digite o nome do seu cachorro:");
        nome = scanner.nextLine();
        c3.setNome(nome);

        System.out.println("Usuário, digite a idade do seu cachorro:");
        idade = scanner.nextInt();
        c3.setIdade(idade);
        scanner.nextLine();

        // Recebe entrada do usuário
        System.out.println("Usuário, digite o latido do seu cachorro:");
        latido = scanner.nextLine();
        c3.setLatido(latido);


        System.out.println(c3.toString());
    }
}
