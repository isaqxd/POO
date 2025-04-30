package atividadeAvaliativa.AT3;

public class Empregado extends Pessoa {
    protected int codigoSetor;
    protected double salarioBase;
    protected double imposto;

    public double calcularSalario() {
        imposto *= salarioBase;
        return salarioBase - imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return String.format("Empregado\nNome: %s\nEndereço: %s\nTelefone: %s\nSetor: %d\nSalario Base: %.2f\nImposto sobre o salario: %.2f\nSalario: %.2f",
                nome, endereco, telefone, getCodigoSetor(), getSalarioBase(), getImposto(), calcularSalario());
    }
}
