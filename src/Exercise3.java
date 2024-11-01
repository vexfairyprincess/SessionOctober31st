import models.Address;
import models.Company;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Address address = new Address();
        Company company = new Company();
        try{
            System.out.println("Introduzca la calle: ");
            address.setStreet(sc.nextLine());
            System.out.println("Introduzca la ciudad: ");
            address.setCity(sc.nextLine());
            System.out.println("Introduzca el código postal: ");
            address.setPostalCode(sc.nextInt());
            sc.nextLine();
            System.out.println("Introduzca el nombre de la empresa: ");
            company.setCompanyName(sc.nextLine());
            company.setAddress(address);
            System.out.println("Información de la empresa:");
            System.out.println(company.toString());
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
