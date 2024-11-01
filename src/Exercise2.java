import models.Product;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        try{
            System.out.println("Introduzca el nombre del producto: ");
            product.setProductName(sc.nextLine());
            System.out.println("Introduzca el precio del producto: ");
            product.setProductPrice(sc.nextDouble());
            System.out.println("Introduzca la cantidad de productos: ");
            product.setProductQuantity(sc.nextInt());
            System.out.println("Información del producto:");
            System.out.println(product.toString());
            System.out.println("Introduzca la cantidad de productos a añadir: ");
            product.updateProductQuantity(sc.nextInt());
            System.out.println("Información del producto:");
            System.out.println(product.toString());
    } catch (Exception e){
        System.out.println("Error: " + e.getMessage());
    }
    }
}
