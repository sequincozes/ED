package aula05;

import java.util.Scanner;

public class Aula5MatrizDinamicaParte3 {

    public static void main(String[] args) {
        Pessoa[][] cadastros;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de associados:");
        int qtdAssociados = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite a quantidade MAXIMA de dependentes:");
        int qtdDependentes = Integer.parseInt(teclado.nextLine()) + 1;
        cadastros = new Pessoa[qtdAssociados][qtdDependentes];

        for (int i = 0; i < cadastros.length; i++) {
            System.out.println("Digite o nome do associado [" + i + "]:");
            String nomeAssociado = teclado.nextLine();
            cadastros[i][0] = new Pessoa(nomeAssociado);
            for (int j = 1; j < cadastros[i].length; j++) {
                if (j==1){ // Está no primeiro dependente
                    System.out.println("Há dependentes (S/N)?");
                    String resposta = teclado.nextLine();
                    if (!resposta.equalsIgnoreCase("S")){
                        break;
                    }
                } else { // Está no segundo ou posterior dependente
                    System.out.println("Há mais dependentes (S/N)?");
                    String resposta = teclado.nextLine();
                    if (!resposta.equalsIgnoreCase("S")){
                        break;
                    }
                }


                System.out.println("Digite o nome do dependente [" + j + "]:");
                String nomeDependente = teclado.nextLine();
                cadastros[i][j] = new Pessoa(nomeDependente);
            }
        }

        System.out.println("####### IMPRIMINDO A MATRIZ ########");
        Aula5MatrizEstaticaParte2.imprimirMatriz(cadastros);

    }
}
