package HomeTasks;

public class Box {
    public static void main(String[] args) {
        BoxConstructor box1 = new BoxConstructor(4,5,3);

        System.out.println(box1.width);
        System.out.println(box1.height);
        System.out.println(box1.length);

        System.out.println("Box volume is: " + box1.width * box1.height * box1.length);
    }
}

