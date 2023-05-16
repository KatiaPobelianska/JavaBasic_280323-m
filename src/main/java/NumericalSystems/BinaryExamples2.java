package NumericalSystems;

public class BinaryExamples2 {
    public static void main(String[] args) {
//        byte is in [-128; 127] or [0; 255]
        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
// 1 byte = 8 bits
         int test1 = 0b00000000;
         int test2 = 0b11111111;

        System.out.println(test1);
        System.out.println(test2);
    }
}
