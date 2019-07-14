package shape;
import resizeable.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double length = 1.0;
    private double width = 1.0;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea () {
        return this.length * this.width;
    }

    public double getPerimeter () {
        return (this.length + this.width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}' + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }

    @Override
    public void resize(double percent) {

    }

}
