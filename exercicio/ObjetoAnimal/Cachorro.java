package exercicio.ObjetoAnimal;

public class Cachorro extends Animal {
    protected String raca;

    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getRaca(){
        return this.raca;
    }

    @Override
    public String toString(){
        return String.format("%sRaça: %s", super.toString(), raca);
    }
}
