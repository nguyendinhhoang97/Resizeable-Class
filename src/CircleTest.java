public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(10);
        System.out.println(circle);

        circle = new Circle(10, "yellow", false);
        System.out.println(circle);

        System.out.println("Increment 10%");
        circle.resize(10);
        System.out.println(circle);
    }
}
