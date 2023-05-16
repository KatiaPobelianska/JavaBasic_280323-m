import com.auto.finland.Car;

public class Second {
    public static void main(String[] args) {
        System.out.println(Car.histYear);
        System.out.println();

     Car finlandCar = new Car();
        System.out.println(finlandCar.year);
        System.out.println(finlandCar.power);
        System.out.println(finlandCar.fabric);
        System.out.println(Car.histYear);
        finlandCar.printParameters();

        Car.histYear = 2003;
        System.out.println(Car.histYear);
        System.out.println();
// car2
        Car finlandCar1 = new Car();
        finlandCar1.printParameters();

        finlandCar1.year = 2022;
        finlandCar1.power = 190.0;
        finlandCar1.fabric = "bmw";
        System.out.println(Car.histYear);
        finlandCar1.printParameters();


        System.out.println(finlandCar1.fabric);
        System.out.println(finlandCar1.power);
        System.out.println(finlandCar1.year);
    }

}
