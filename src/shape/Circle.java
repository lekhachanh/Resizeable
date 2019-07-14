package shape;

import resizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * 2 * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "Area: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }

    @Override
    public void resize(double percent) {
        double per = percent / 100 * radius;
        setRadius(getRadius() + per);
    }
}
