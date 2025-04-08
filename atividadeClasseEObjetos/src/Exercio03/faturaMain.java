package Exercio03;

public class faturaMain {
    public static void main(String[] args) {
    int t = 10;
    String d = "Computador";
    String n = "1";
    double preco = 1200.21;

    Fatura f = new Fatura(n, d, t, preco);
        System.out.println("|nº"+n+"|Produto: "+ d+ "|Valor Unitario: R$"+preco);
        System.out.println("Preco total: R$"+f.getTotalFatura());
    }
}
