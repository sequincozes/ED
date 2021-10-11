package aula02;

public class Loops {
    public static void main(String[] args) {
        Loops l = new Loops();
//        System.out.println(l.procurarLinhaFor("Teste", 's'));

        String linha1 = "Texto da linha 1";
        String linha2 = "Texto da linha 2";
        String linha3 = "Texto da linha 3";
        String linha4 = "Texto da linha 4";
        String linha5 = "Texto da linha 5";

        // Exemplo 1 - Vetores
        // [0][1][2][3][4]
        String[] pagina = {linha1, linha2, linha3, linha4, linha5};

        // Exemplo 2 - Vetores
        // [0][1][2][3][4]
        String pagina2[] = new String[5];
        pagina2[0] = linha1;
        pagina2[1] = linha2;
        pagina2[2] = linha3;
        pagina2[3] = linha4;
        pagina2[4] = linha5;

//        l.lerLinhasFor(pagina);

        // Matrizes
//        String [][] livro = new String[][];
        // [0,0][0,1][0,2][0,3][0,4] (Linha zero, colunas do 0 ao 4)
        // [1,0][1,1][1,2][1,3][1,4] (Linha um, colunas do 0 ao 4)
        // [2,0][2,1][2,2][2,3][2,4] (Linha um, colunas do 0 ao 4)

    }

    public void lerLinhasWhile(String[] linhas) {
        int linhaAtual = 0;
        int numDeLinhas = linhas.length;

        while (linhaAtual < numDeLinhas) {
            System.out.println(linhas[linhaAtual++]); // linhaAtual = linhaAtual + 1;
        }
    }

    public void lerLinhasFor(String[] linhas) {
        for (int linhaAtual = 0; linhaAtual < linhas.length; linhaAtual++) {
            System.out.println("Posição acessada:" + linhaAtual + ", valor: " + linhas[linhaAtual]);
        }
    }

    public String lerLinhasWhile(String carta) {
        String livro = "";
        int linha = 0;
        while (linha < 5) {
            livro = livro.concat(String.valueOf(carta.charAt(linha)));
            linha++;
        }
        return livro;
    }

    public char procurarLinhaFor(String carta, char caractereProcurado) {
        char linhaEncontrada = '*';

        for (int linha = 0; linha < carta.length(); linha++) {
            System.out.println("Posição acessada:" + linha + ", valor: " + carta.charAt(linha));

            if (carta.charAt(linha) == caractereProcurado) {
                linhaEncontrada = carta.charAt(linha);
                System.out.println("Encontrou: " + linhaEncontrada);
                break;
            }
        }

        return linhaEncontrada;
    }

    public String lerLinhasFor(String carta) {
        String livro = "";

        for (int linha = 0; linha < carta.length(); linha++) {
            System.out.println("Posição acessada:" + linha + ", valor: " + carta.charAt(linha));
            livro = livro.concat(String.valueOf(carta.charAt(linha)));
        }

        return livro;
    }

}
