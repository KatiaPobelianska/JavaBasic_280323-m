package HomeTasks.relationsHT11;

public class Example {
    public static void main(String[] args) {
        Germany g = new Germany();
//        System.out.println(g.people);
        g.work();

        Hessen h = new Hessen();
//        System.out.println(h.people);
        h.work();

        NordRein n = new NordRein();
//        System.out.println(n.people);
        n.work();

        Kassel k = new Kassel();
//        System.out.println(k.people);
            k.work();
        Franfurt f = new Franfurt();
//        System.out.println(f.people);
            f.work();
    }
}

class Germany  implements Working{
    public int people = 83 ;
    public int square = 356;

    @Override
    public void work() {
        System.out.println("Germany working people: 86%");
    }
}
class NordRein extends Germany{
    public int people = 10 ;
    public int square = 15;

    @Override
    public void work() {
        System.out.println("NordRein working people: 93%");
    }
}
class Hessen extends Germany{
    public int people = 6;
    public int square = 24;

    @Override
    public void work() {
        System.out.println("Hessen working people: 88%");
    }
}
class Kassel extends Hessen {
    public int people = 201;
    public int square = 4;

    @Override
    public void work() {
        System.out.println("Kassel working people: 77%");
    }
}

class Franfurt extends Hessen{
    public int people = 1;
    public int square = 6;

    @Override
    public void work() {
        System.out.println("Franfurt working people: 97%");
    }
}

interface Working{
    void work();
}