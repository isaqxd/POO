package exercicio.ObjetoAnimal;

public class Animal {
    protected String nome;
    protected double peso;


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso(){
        return this.peso;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s. Peso: %.2f. ", nome, peso);
    }
}
