package Exercio03;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidadeComprado;
    private double precoPorItem;

    public Fatura(String numero, String descricao, int quantidadeComprado, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidadeComprado = quantidadeComprado;
        this.precoPorItem = precoPorItem;
    }


//DECLARACOES
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return this.numero;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }

    public void setQuantidadeComprado(int quantidadeComprado){
        this.quantidadeComprado = quantidadeComprado;
    }
    public int getQuantidadeComprado(){
        return this.quantidadeComprado;
    }

    public void setPrecoPorItem(double precoPorItem){
        this.precoPorItem = precoPorItem;
    }
    public double getPrecoPorItem(){
        return this.precoPorItem;
    }

    public double getTotalFatura(){
        double total = this.precoPorItem * this.quantidadeComprado;
        if (total <= 0.00){
            total = 0.00;
        }
        return total;
    }


}
