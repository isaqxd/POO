package atividadeAvaliativa.AT3;

public class Fornecedor extends Pessoa {
    protected double valorCredito;
    protected double valorDivida;

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    @Override
    public String toString() {
        return "Fornecedor \n" +
                "Nome: " + nome + '\n' +
                "Endereco " + endereco + '\n' +
                "Telefone: " + telefone + '\n' +
                "Valor de credito: " + valorCredito + '\n' +
                "Valor de divida: " + valorDivida + '\n' +
                "Credito: " + obterSaldo();
    }
}