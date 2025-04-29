package exercicio.ObjetoAnimal;

public class Peixe extends Animal {
    protected String tipoHabitat;

    public String getTipoHabitat() {
        return this.tipoHabitat;
    }
    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    @Override
    public String toString(){
        return String.format("%sHabitat: %s",super.toString(), tipoHabitat);
    }
}
