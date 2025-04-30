package atividadeAvaliativa.AT2;

public class Cliente extends Pessoa {
    protected double valorDivida;
    protected int anoNascim;

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }

    public double getValorDivida() {
        return this.valorDivida;
    }

    public int getAnoNascim() {
        return this.anoNascim;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s.\n" +
                "Idade: %d.\n" +
                "Valor da divida: %.2f.\n" +
                "Ano de Nascimento: %s.", nome, idade, valorDivida, anoNascim);
    }
}
