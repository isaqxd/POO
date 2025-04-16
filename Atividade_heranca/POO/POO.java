package Atividade_heranca.POO;

public class POO {
    private String nome;
    private int numero;

    public POO(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public POO(String nome) {
        this.nome = nome;
    }

//DECLARACOES
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return this.numero;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
