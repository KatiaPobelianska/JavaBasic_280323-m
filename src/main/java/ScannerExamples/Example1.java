package ScannerExamples;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter pls 3 numbers (day, month, year)");

      System.out.println("Day: ");
      int day = sc.nextInt();
//      System.out.println();

      System.out.println("Month: ");
      int month = sc.nextInt();
//      System.out.println();

      System.out.println("Year: ");
      int year = sc.nextInt();
//      System.out.println();

      sc.close();

        System.out.println("The date is: " + day + "." + month + "." + year);
    }
}
