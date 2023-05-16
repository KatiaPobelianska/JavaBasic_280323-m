package NumericalSystems;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Country: ");
        String country = sc.nextLine();

        System.out.print("name: ");
        String name = sc.nextLine();

        sc.close();

        System.out.println("Persons name is: " + name + ", country is " + country + ", age is " + age);
    }
}
