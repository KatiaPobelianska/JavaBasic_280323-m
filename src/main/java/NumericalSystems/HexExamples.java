package NumericalSystems;

import com.auto.finland.Car;

public class HexExamples {
    public static void main(String[] args) {
        int q = 542;
//        long 10 -> 16
        System.out.println(q / 16);
        System.out.println(q % 16); //14 -> d

        System.out.println(33 / 16);
        System.out.println(33 % 16); //1

        System.out.println(2 / 16);
        System.out.println(2 % 16); // 2

        int q16 = 0x21e;
//        210
        System.out.println(q16);
//       short 10 -> 16
        System.out.println(Integer.toHexString(q));
//        long 16 -> 10
        double result = 2 * Math.pow(16, 2) + 1 * Math.pow(16, 1) + 14 * Math.pow(16, 0);
        System.out.println(result);

//        short 16 -> 10
        System.out.println(q16);

        System.out.println(new Car());
    }
}
