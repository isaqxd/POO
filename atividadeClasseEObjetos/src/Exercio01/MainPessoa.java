package Exercio01;

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // CADASTRO DO HUMANO
        System.out.println("-------Cadastro do humano-------");
        System.out.printf("Digite o seu nome: ");
        String name = sc.nextLine();
        System.out.printf("Digite a sua idade: ");
        int age = sc.nextInt();
        Pessoa p = new Pessoa(name, age);
        System.out.println("-------Cadastro do humano recebido.-------");
        System.out.println("Nome: " + p.getName());
        System.out.println("Idade: " +p.getAge());
        System.out.println("----------------------------");
    }
}