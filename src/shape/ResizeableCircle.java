package shape;

public class ResizeableCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(4.6);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println(rectangle);

        Square square = new Square(4, 6, 7);
        System.out.println(square);
    }

}
