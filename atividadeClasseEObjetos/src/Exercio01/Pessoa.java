package Exercio01;

public class Pessoa {
    private String name;
    private int age;

    // DEFINIÇÃO DO CONSTRUTOR PADRÃO DA CLASSE:
    public Pessoa(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setAge (byte age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
