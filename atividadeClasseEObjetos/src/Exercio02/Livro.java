package Exercio02;

public class Livro {
    private String titulo;
    private String autor;
    private int totalPag;

    public Livro (String titulo, String autor, int totalPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
    }

    public void infosLivros(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(totalPag);
    }
}
