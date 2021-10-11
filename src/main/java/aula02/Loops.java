package aula02;

public class Loops {
    public static void main(String[] args) {
        Loops l = new Loops();
        l.lerLinhas("Teste");
    }

    public String lerLinhas(String carta) {
        String livro = "";
        int linha = 0;
        while (linha < 5) {
            livro = livro.concat(String.valueOf(carta.charAt(linha)));
            linha++;
        }
        System.out.println(livro);
        return livro;
    }

}
