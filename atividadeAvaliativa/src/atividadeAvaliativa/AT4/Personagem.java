package atividadeAvaliativa.AT4;

public class Personagem {
    protected String nome;
    protected int nivel;
    protected int vida;

    @Override
    public String toString() {
        return String.format("Personagem\nNome: %s\nNivel: %d\nVida: %d",getNome(),getNivel(),getVida());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
