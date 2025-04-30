package atividadeAvaliativa.AT3;

public class Operario extends Empregado{
    protected double valorProducao;
    protected double comissao;

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    @Override
    public double calcularSalario() {
        comissao *= valorProducao;
        return super.calcularSalario() + comissao;
    }

    @Override
    public String toString(){
        return String.format("%s\nProdução: %.2f\nComissão: %.2f", super.toString(), valorProducao, comissao);
    }
}
