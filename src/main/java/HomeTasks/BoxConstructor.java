package HomeTasks;

public class BoxConstructor {
    public double width;

    public double height;

    public double length;
    public BoxConstructor(double width, double height, double length){

        this(width, height);
        this.length = length;
        System.out.println("Completed 3 args");
    }

    public BoxConstructor(double width, double height) {
        this(width);
        this.height = height;
        length = 2.5;
        System.out.println("completed 2 args");
    }

    public BoxConstructor(double width) {
        this.width = width;
        height = 1.5;
        length = 2.5;
        System.out.println("completed 1 args");
    }

    public BoxConstructor() {
        width = 1.8;
        height = 1.5;
        length = 2.5;
        System.out.println("completed 0 args");
    }
}
