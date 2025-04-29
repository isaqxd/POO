package exercicio.aulaPolimorfismo.jogoRPG;

public class Teste {
    public static void main(String[] args) {
        personagemBase[] peronagens = {
                new Ares(),
                new Victoria(),
                new Albert()
        };

        for (personagemBase P : peronagens){
            P.personagem();
        }
    }
}
