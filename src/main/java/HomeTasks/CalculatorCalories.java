package HomeTasks;

public class CalculatorCalories {
    public static void main(String[] args) {
        final float PI = 3.14F;
        int caloriesRates = 40;
        System.out.println(calculateCalories(28,24, PI, caloriesRates));

    }
    public static double calculateCalories(int a, int b, float pi, int calories){
        return pi * (a*a - b*b) * calories / 4;
    }
}
