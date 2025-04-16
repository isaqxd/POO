package Atividade_heranca.Calc;
import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Qual é a operação deseja realizar?");
        System.out.println("[+] ADIÇÃO");
        System.out.println("[-] SUBTRAÇÃO");
        System.out.println("[/] DIVISÃO");
        System.out.println("[*] MULTIPLICAÇÃO");
        System.out.println("[#] RAIZ QUADRADA");
        char op = scn.next().charAt(0);

        if (op != '#'){
            double n1 = scn.nextDouble();
            double n2 = scn.nextDouble();
            Calc c = new Calc(n1, n2, op);
            System.out.println(c.operacao(op));
        }else {
            double n1 = scn.nextDouble();
            CalcCientifica c = new CalcCientifica(n1, op);
            System.out.println(c.operacao(op));
        }

        System.out.println();
    }
}
