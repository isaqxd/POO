package atividadeAvaliativa.AT2;

public class Gerente extends Empregado {
    protected String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s.\n" +
                "Idade: %d.\n" +
                "Matricula: %s.\n" +
                "Gerencia: %s.\n" +
                "INSS: %.2f.", nome, idade, matricula, nomeGerencia, valorInss());
    }
}
