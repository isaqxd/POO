package atividadeAvaliativa.AT2;

public class Vendedor extends Empregado{
    protected double valorVendas;
    protected int qtdVendas;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }


    @Override
    public String toString() {
        return String.format("Nome: %s.\n" +
                "Salário: %.2f.\n" +
                "Valor de Vendas: %.2f.\n" +
                "Quantidade de vendas: %d.", nome, salario, valorVendas, qtdVendas);
    }
}
