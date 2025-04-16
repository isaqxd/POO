package Atividade_heranca.Calc;

public class CalcCientifica extends Calc {
    public CalcCientifica(double numOne, double numTwo, char operador) {
        super(numOne, numTwo, operador);
    }

    public CalcCientifica(double numOne, char operador) {
        super(numOne, operador);
    }

    public double operacao(char operador) {
        super.operacao(operador);
        System.out.println(numOne);
        switch (operador) {
            case 'a':
                return Math.sqrt(numOne);
            default:
                return 10;
        }
    }

}
