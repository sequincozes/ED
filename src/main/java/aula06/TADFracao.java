package aula06;

public class TADFracao {
    private int numerador;
    private int denominador;

    public TADFracao(int numerador, int denominador) {
        setNumerador(numerador);
        setDenominador(denominador);
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public double getValorReal() {
//        return numerador / denominador;
//        return Double.valueOf(numerador) / Double.valueOf(denominador);
        double numeradorDouble = Double.valueOf(numerador);
        double denominadorDouble = Double.valueOf(denominador);
        return numeradorDouble / denominadorDouble;
    }

    public TADFracao multiplicaFracao(TADFracao f1, TADFracao f2) {
        return new TADFracao(
                f1.getNumerador() * f2.getNumerador(),
                f1.getDenominador() * f2.getDenominador());
    }
}