package HomeTasks;

import java.util.Scanner;

public class TemperatureConvector {
    public static void main(String[] args) {
        System.out.println("Enter your temperature: ");
        Scanner ss = new Scanner(System.in);
        double cel = ss.nextDouble();
        double far = ss.nextDouble();

        double farRez = celsiusToFarengate(cel);
        double celRez = farengateToCelsius(far);

        System.out.println("Fahrenheit= " + farRez);
        System.out.println("Celsius= " + celRez);

        ss.close();
    }
    public  static double celsiusToFarengate(double cel){
        return (cel * 1.8) + 32;
    }
    public static double farengateToCelsius(double far){
        return (far - 32) / 1.8;
    }


}
