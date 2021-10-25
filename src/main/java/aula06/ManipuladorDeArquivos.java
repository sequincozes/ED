package aula06;

import java.io.*;

public class ManipuladorDeArquivos {

    public File inicializa() {
        File arquivo = new File("C:\\Users\\Silvio\\meusarquivos\\nome_do_arquivo.txt");
        //verifica se o arquivo ou diretório existe
        boolean existe = arquivo.exists();

        if (!existe) {
            //cria um arquivo (vazio)
            try {
                arquivo.createNewFile();
            } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return arquivo;
    }

    public void escreve(File arquivo, String texto, boolean sobrescrever) {
        //construtor que recebe o objeto do tipo arquivo
        try {
            FileWriter fw = new FileWriter(arquivo, !sobrescrever);
            //construtor recebe como argumento o objeto do tipo FileWriter
            BufferedWriter bw = new BufferedWriter(fw);

            //escreve o conteúdo no arquivo
            bw.write(texto);

            //quebra de linha
            bw.newLine();

            //fecha os recursos
            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void leia(File arquivo) {
        //construtor que recebe o objeto do tipo arquivo
        try {
            FileReader fr = new FileReader(arquivo);

            //construtor que recebe o objeto do tipo FileReader
            BufferedReader br = new BufferedReader(fr);

            //enquanto houver mais linhas
            while (br.ready()) { //lê a proxima linha
                String linha = br.readLine();          //faz algo com a linha
                System.out.println("LEU: " + linha);
            }

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void leiaFracao(File arquivo) {
        //construtor que recebe o objeto do tipo arquivo
        try {
            FileReader fr = new FileReader(arquivo);

            //construtor que recebe o objeto do tipo FileReader
            BufferedReader br = new BufferedReader(fr);

            //enquanto houver mais linhas
            while (br.ready()) { //lê a proxima linha
                String linha = br.readLine();          //faz algo com a linha
                String[] pedacosDaLinha = linha.split(",");
                int numerador = Integer.parseInt(pedacosDaLinha[0]);
                int denominador = Integer.parseInt(pedacosDaLinha[1]);
                TADFracao tadFracao = new TADFracao(numerador, denominador);
                System.out.println("Numerador: "+numerador);
                System.out.println("Denominador: "+denominador);
                System.out.println("Divisão: " + tadFracao.getValorReal());
            }

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
