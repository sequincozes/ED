package aula05;

public class Pessoa {
    String nome;
    String endereco;
    int idade;
    int cpf;
    int rg;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, String endereco, int idade, int cpf, int rg) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Nome: ".concat(this.nome) + ", endereço: " + this.endereco + ", idade: " + this.idade;
    }
}
