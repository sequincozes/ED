package aula01.animais;

public class Cachorro {
    private String nome;
    private int idade;
    private String latido;

    public Cachorro() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLatido() {
        return latido;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }

    public Cachorro(String nome, int idade, String latido) {
        this.nome = nome;
        this.idade = idade;
        this.latido = latido;
    }

    // Método (ação) de latir

    /*
    comentário de várias
    linhas
    * */

    public String latir(String latido) {
        System.out.println("O cachorro "+ this.nome+" latiu: "+this.latido);
        return latido + " " +latido;
    }

    // Método (ação) de latir
    public void latir() {
        System.out.println("O cachorro "+ this.nome+" latiu: "+this.latido);
    }

    @Override
    public String toString() {
        return "aula01.animais.Cachorro - {" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", latido='" + latido + '\'' +
                '}';
    }
}
