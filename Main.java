package xdisaq.AulaPoo;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScan  = new Scanner(System.in);

        System.out.println("Insert product name:");
            String productName = myScan.nextLine();

        System.out.println("Insert product label:");
            String productLabel = myScan.nextLine();

        System.out.println("Insert product price:");
            double productPrice = myScan.nextDouble();

        System.out.println("Insert product code:");
            int productCode = myScan.nextInt();

        Product prod = new Product();{
            prod.setName(productName);
            prod.setCode(productCode);
            prod.setLabel(productLabel);
            prod.setPrice(productPrice);

            System.out.println("Name: "+prod.getName() );
            System.out.println("Code: "+prod.getCode() );
            System.out.println("Label: "+prod.getLabel() );
            System.out.println("Price: "+prod.getPrice() );
        }
    }
}
