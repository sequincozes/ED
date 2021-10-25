package aula06;

public class Principal {
    public static void main(String[] args) {

        TADFracao f1 = new TADFracao(4,2);
        TADFracao f2 = new TADFracao(12,7);

        System.out.println(f1.getValorReal());
        System.out.println(f2.getValorReal());

        TADFracao f3 = f1.multiplicaFracao(f1, f2);

        System.out.println(f3.getNumerador() +
                "/" + f3.getDenominador() +
                "=" + f3.getValorReal());



    }
}
