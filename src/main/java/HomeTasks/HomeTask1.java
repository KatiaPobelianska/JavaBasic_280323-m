package HomeTasks;

public class HomeTask1 {
    public static void main(String[] args) {
        int q = 188;
// степени      210
//  10 с-ма:
        double result1 = 1 * 100 + 8 * 10 + 8 * 1;
        double result2 = 1 * Math.pow(10, 2) + 8 * Math.pow(10, 1) + 8 * Math.pow(10, 0);

        System.out.println(result1);
        System.out.println(result2);

//        10 -> 8
        System.out.println(Integer.toOctalString(q));

//        8 -> 10
        int q8 = 0274;
        System.out.println(q8);

//        10 -> 2
        System.out.println(Integer.toBinaryString(q));

//        2 -> 10
        int q2 = 0b10111100;
        System.out.println(q2);

//        10 -> 16
        System.out.println(Integer.toHexString(q));

//        16 -> 10
        int q16 = 0xbc;
        System.out.println(q16);
    }
}
