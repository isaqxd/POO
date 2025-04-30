package atividadeAvaliativa.AT3;

public class Administrador extends Empregado{
    protected double ajudaDeCusto;

    public double getAjudaDeCusto(){
        return this.ajudaDeCusto;
    }
    public void setAjudaDeCusto(double ajudaDeCusto){
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public String toString(){
        return String.format("%s\nAjuda de custo: %.2f", super.toString(), getAjudaDeCusto());
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()+ajudaDeCusto;
    }
}
