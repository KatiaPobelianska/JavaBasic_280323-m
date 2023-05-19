package HomeTasks;
//реализовать 2 алгоритма, которые переводили бы значение типа char (равен '4') в целочисленный тип (например в int).
//Первый с помощью String.valueOf, второй - с помощью Character.getNumericValue. Для проверки используйте арифметическую операцию result + 6, чтоб в итоге получить 10
public class HomeTask2 {
    public static void main(String[] args) {
        char q = '4';
        //        2. String.valueOf()
        int result = Integer.parseInt(String.valueOf(q));
        System.out.println(result + 6);

//      3. Character.getNumericValue() => only int
        int res = Character.getNumericValue(q);
        System.out.println(res + 6);
    }
}
