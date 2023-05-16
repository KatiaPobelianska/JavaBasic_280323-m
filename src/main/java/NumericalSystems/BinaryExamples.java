package NumericalSystems;

public class BinaryExamples {
    public static void main(String[] args) {
        int q = 542;
//        long 10 -> 2
        System.out.println(q / 2);
        System.out.println(q % 2);

        System.out.println(271 / 2);
        System.out.println(271 % 2); // 0

        System.out.println(135 / 2);
        System.out.println(135 % 2); // 1

        System.out.println(67 / 2);
        System.out.println(67 % 2); //1

        System.out.println(33 / 2);
        System.out.println(33 % 2); //1

        System.out.println(16 / 2);
        System.out.println(16 % 2); // 0

        System.out.println(8 / 2);
        System.out.println(8 % 2); //0

        System.out.println(4 / 2);
        System.out.println(4 % 2); // 0

        System.out.println(2 / 2);
        System.out.println(2 % 2); //0

        System.out.println(1 / 2);
        System.out.println(1 % 2); //1

        int q2 = 0b1000011110;
        System.out.println(q2);
//       result = 1000011110
//                9876543210
//        short 10 -> 2
        System.out.println(Integer.toBinaryString(q));
//        long 8 -> 2
        double result7 = 1*Math.pow(2,9) + 1*Math.pow(2,4) + 1*Math.pow(2,3) + 1*Math.pow(2,2) + 1*Math.pow(2,1);
        System.out.println(result7);
//        short 8 -> 2
    }
}
