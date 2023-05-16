package ScannerExamples;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();

        System.out.println("Hello: " + name);
    }
}
