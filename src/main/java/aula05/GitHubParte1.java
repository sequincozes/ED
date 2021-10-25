package aula05;

public class GitHubParte1 {

    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[10];
        pessoas[0] = new Pessoa("João", "Rua 1", 18, 01212312311, 0110011122);
        pessoas[1] = new Pessoa("Maria", "Rua 2", 17, 01212312311, 0110011122);
        pessoas[2] = new Pessoa("José", "Rua 3", 15, 01212312311, 0110011122);
        pessoas[3] = new Pessoa("Pedro", "Rua 4", 11, 01212312311, 0110011122);
        pessoas[4] = new Pessoa("Paulo", "Rua 5", 22, 01212312311, 0110011122);
        pessoas[5] = new Pessoa("Silva", "Rua 6", 38, 01212312311, 0110011122);
        pessoas[6] = new Pessoa("Pedrito", "Rua 7", 48, 01212312311, 0110011122);
        pessoas[7] = new Pessoa("José Maria", "Rua 8", 58, 01212312311, 0110011122);
        pessoas[8] = new Pessoa("Pedro Paulo", "Rua 9", 19, 01212312311, 0110011122);
        pessoas[9] = new Pessoa("Mariazinha", "Rua 10", 18, 01212312311, 0110011122);

        for (int i = 0; i < pessoas.length; i++){
            boolean maior = pessoas[i].getIdade() >= 18;
            if(maior){
                System.out.println("[MAIOR DE IDADE] " + pessoas[i].toString());
            } else {
                System.out.println("[MENOR DE IDADE] " + pessoas[i].toString());
            }
        }


    }

    public void cadastraPessoa(){

    }

    public Pessoa consultaPessoa(){
        return null;
    }

    public void deletaPessoa(){

    }

}
