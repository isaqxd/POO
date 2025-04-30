package atividadeAvaliativa.AT4;

public class Mago extends Personagem{
    protected int mana;
    protected String elemento;

    @Override
    public String toString(){
        return String.format("%s\nMana: %d\nElemento: %s", super.toString(), getMana(), getElemento());
    }

    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getElemento() {
        return elemento;
    }
    public void setElemento(String elemento) {
        this.elemento = elemento;
    }
}
