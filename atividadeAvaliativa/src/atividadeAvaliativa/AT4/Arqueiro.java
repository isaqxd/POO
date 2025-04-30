package atividadeAvaliativa.AT4;

public class Arqueiro extends Personagem{
    protected int destreza;
    protected String tipoFlecha;

    @Override
    public String toString(){
        return String.format("%s\nDestreza: %d\nFlecha: %s", super.toString(), getDestreza(), getTipoFlecha());
    }

    public int getDestreza() {
        return destreza;
    }
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public String getTipoFlecha() {
        return tipoFlecha;
    }
    public void setTipoFlecha(String tipoFlecha) {
        this.tipoFlecha = tipoFlecha;
    }
}
