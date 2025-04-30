package atividadeAvaliativa.AT1;

public class Cachorro extends Animal{
    protected String raca;

    public String getRaca(){
        return this.raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString(){
        return String.format("%sRaca: %s", super.toString(), raca);
    }
}
