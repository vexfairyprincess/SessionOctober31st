import models.Person;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();

        System.out.println("Introduzca el nombre de la persona: ");
        person.setName(sc.nextLine());
        System.out.println("Introduzca la edad de la persona: ");
        person.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Introduzca el género de la persona: ");
        person.setGender(sc.nextLine());
        System.out.println("Información de la persona:");
        person.printInformation();



    }
}