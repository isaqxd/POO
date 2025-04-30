package atividadeAvaliativa.AT3;

public class Vendedor extends Empregado {
    protected double valorVendas;
    protected double comissao;

    @Override
    public double calcularSalario(){
        comissao *= getValorVendas();
        return super.calcularSalario() + getComissao();
    }

    @Override
    public String toString(){
        return String.format("%s\nValor das vendas: %.2f\nComissao: %.2f", super.toString(), getValorVendas(), getComissao());
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
