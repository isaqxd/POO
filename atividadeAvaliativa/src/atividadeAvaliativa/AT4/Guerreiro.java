package atividadeAvaliativa.AT4;

public class Guerreiro extends Personagem {
    protected int forca;
    protected String arma;

    @Override
    public String toString() {
        return String.format("%s\nForça: %d\nArma: %s",super.toString(), getForca(), getArma()) ;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
}
