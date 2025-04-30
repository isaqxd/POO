package atividadeAvaliativa.AT1;

public class Peixe extends Animal{
    protected String tipoHabitat;

    public void setTipoHabitat(String tipoHabitat){
        this.tipoHabitat = tipoHabitat;
    }
    public String getTipoHabitat(){
        return this.tipoHabitat;
    }

    @Override
    public String toString(){
        return String.format("%stipoHabitat: %s", super.toString(), tipoHabitat);
    }
}
