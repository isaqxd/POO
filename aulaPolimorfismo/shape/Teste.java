package exercicio.aulaPolimorfismo.shape;

public class Teste {
    public static void main(String[] args) {
        forma[] formas = {
                new circulo(),
                new retangulo(),
                new triangulo()
        };

        for (forma f : formas) {
            // f.desenhar();

            boolean isAForm = f instanceof forma;
            System.out.println(isAForm);
        }
    }
}
