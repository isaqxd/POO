package atividadeAvaliativa.AT1;

public class Animal {
    protected String nome;
    protected double peso;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }


    @Override
    public String toString(){
        return String.format("Nome: %s. Peso: %.2f. ", nome, peso);
    }
}
