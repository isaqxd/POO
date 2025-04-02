package Exercio02;

public class MainLivro {
    public static void main (String[] args){
        String t = "Pequeno Principe";
        String a = "Antoine de Saint-Exupéry";
        int p = 150;

        Livro l = new Livro(t, a, p);
        l.infosLivros();

    }
}
