package atividadeAvaliativa.AT4;

public class Teste {
    public static void main(String[] args) {
        Arqueiro a = new Arqueiro();
        a.setNome("Albert Bloom");
        a.setNivel(20);
        a.setVida(100);
        a.setDestreza(22);
        a.setTipoFlecha("Flecha de fogo");
        Guerreiro g = new Guerreiro();
        g.setNome("Anabel Magno");
        g.setNivel(20);
        g.setVida(200);
        g.setForca(42);
        g.setArma("Espada");
        Mago m = new Mago();
        m.setNome("Damian");
        m.setNivel(40);
        m.setVida(80);
        m.setMana(200);
        m.setElemento("Fogo");

        System.out.println(a.toString()+"\n");
        System.out.println(g.toString()+"\n");
        System.out.println(m.toString());
    }
}
