package exercicio.ObjetoAnimal;

public class Main {
    public static void main(String[] args) {
        Cachorro C = new Cachorro();
        C.setNome("Fred");
        C.setPeso(22.2);
        C.setRaca("Vira-Lata");

        System.out.println("Objeto - Cachorro:");
        System.out.println(C.toString());
        System.out.println("");

        Peixe P = new Peixe();
        P.setNome("Peixonauta");
        P.setPeso(0.5);
        P.setTipoHabitat("Disney XD");

        System.out.println("Objeto - Peixe:");
        System.out.println(P.toString());


    }
}
