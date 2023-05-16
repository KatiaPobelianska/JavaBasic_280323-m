package ScannerExamples;

import java.util.Scanner;

public class ScannerExamples2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//  s = PI*r^2
        System.out.print("Enter pls radius: ");
       float radius = sc.nextFloat();
        sc.close();

        double result = Math.PI * Math.pow(radius,2);
        System.out.println("Square is: " + result);


    }
}
