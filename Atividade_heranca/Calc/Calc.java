package Atividade_heranca.Calc;

public class Calc {
    protected double numOne;
    protected double numTwo;
    protected char operador;

    public Calc(double numOne, double numTwo, char operador) {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.operador = operador;
    }
    public Calc(double numOne, char operador) {
        this.numOne = numOne;
        this.operador = operador;
    }

    public double operacao(char operador) {
        this.operador = operador;
        switch (this.operador) {
            case '+':
                return numOne + numTwo;
            case '-':
                return numOne * numTwo;
            case '/':
                return numOne / numTwo;
            case '*':
                return numOne * numTwo;
            default:
                return 0;
        }
    }

    public double getNumOne() {
        return numOne;
    }

    public void setNumOne(double numOne) {
        this.numOne = numOne;
    }
}