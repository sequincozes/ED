package aula05;

public class Aula5MatrizEstaticaParte2 {

    public static void main(String[] args) {
        //        0         1         2         3
        // 3  [Pessoa 1][Pessoa 2][Pessoa 3][Pessoa 4]
        // 1  [Pessoa 5][Pessoa 6][Pessoa 7][Pessoa 8]
        // 2  [Pessoa 9][Pessoa 10][Pessoa 11][Pessoa 12]
        // 3  [Pessoa 13][Pessoa 14][Pessoa 15][Pessoa 16]

        Pessoa[][] cadastros = new Pessoa[4][4]; // Matriz com 16 posições
        cadastros[0][0] = new Pessoa("João", "Rua 1", 18, 01212312311, 0110011122);
        cadastros[0][1] = new Pessoa("Maria", "Rua 2", 17, 01212312311, 0110011122);
        cadastros[0][2] = new Pessoa("José", "Rua 3", 15, 01212312311, 0110011122);
        cadastros[0][3] = new Pessoa("Pedro", "Rua 4", 11, 01212312311, 0110011122);

        cadastros[1][0] = new Pessoa("Paulo", "Rua 5", 22, 01212312311, 0110011122);
        cadastros[1][1] = new Pessoa("Silva", "Rua 6", 38, 01212312311, 0110011122);
        cadastros[1][2] = new Pessoa("Pedrito", "Rua 7", 48, 01212312311, 0110011122);
        cadastros[1][3] = new Pessoa("José Maria", "Rua 8", 58, 01212312311, 0110011122);

        cadastros[2][0] = new Pessoa("João2", "Rua 1", 18, 01212312311, 0110011122);
        cadastros[2][1] = new Pessoa("Maria", "Rua 2", 17, 01212312311, 0110011122);
        cadastros[2][2] = new Pessoa("José", "Rua 3", 15, 01212312311, 0110011122);
        cadastros[2][3] = new Pessoa("Pedro", "Rua 4", 11, 01212312311, 0110011122);

        cadastros[3][0] = new Pessoa("Paulo2", "Rua 5", 22, 01212312311, 0110011122);
        cadastros[3][1] = new Pessoa("Silva", "Rua 6", 38, 01212312311, 0110011122);
        cadastros[3][2] = new Pessoa("Pedrito", "Rua 7", 48, 01212312311, 0110011122);
        cadastros[3][3] = new Pessoa("José Maria", "Rua 8", 58, 01212312311, 0110011122);

        imprimirMatriz(cadastros);
    }

    public static void imprimirMatriz(Pessoa[][] cadastros) {
        for (int i = 0; i < cadastros.length; i++) {
            System.out.println("Pessoa: " + cadastros[i][0]);
            System.out.println("Dependentes: ");
            for (int j = 1; j < cadastros[i].length; j++) {
                try {
                    if (cadastros[i][j].getNome() != null) {
                        System.out.println(" ---  " + cadastros[i][j]);
                    }
                } catch (NullPointerException e) {
                    // Ignorar nomes nulos
                    System.out.println("O associado não possui dependentes.");
                }
            }
        }
    }

}
