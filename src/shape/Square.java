package shape;

public class Square extends Rectangle {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double length, double width, double side) {
        super(length, width);
        this.side = side;
    }

    public Square(String color, double length, double width, double side) {
        super(color, length, width);
        this.side = side;
    }

    public void Square(double side) {
        setWidth(side);
        setLength(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }


    @Override
    public void setLength(double height) {
        this.setSide(height);
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.side *= percent;
    }
}