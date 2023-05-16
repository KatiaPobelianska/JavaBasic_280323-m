package NumericalSystems;

public class OctaExamples {
    public static void main(String[] args) {
        int q = 542;
//        долгий путь 10 -> 8
        System.out.println(q/8); //67
        System.out.println(q%8);        //6

        System.out.println(67/8); //8
        System.out.println(67%8);       //3

        System.out.println(8/8); // 1
        System.out.println(8%8);        //0

        System.out.println(1/8); //0
        System.out.println(1%8);        //1

//        короткий путь 10 -> 8
        System.out.println( Integer.toOctalString(542));

//        самый простой способ конвертации 8 -> 10
        int q8 = 01036;
//        степени 3210
        System.out.println(q8);

//        более длинный способ перевода 8 -> 10
        double result1 = 1 * Math.pow(8,3) + 0 * Math.pow(8,2) + 3 * Math.pow(8,1) + 6 * Math.pow(8,0);
        System.out.println(result1);
    }
}
