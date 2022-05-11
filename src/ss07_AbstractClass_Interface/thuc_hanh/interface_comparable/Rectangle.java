package ss07_AbstractClass_Interface.thuc_hanh.interface_comparable;

import ss06_Inheritance.thuc_hanh.geometric_objects.Shape;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * this.length;
    }
    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with Width "
                + getWidth()
                + " and Length "
                + getLength()
                + ", which is a Subclass of "
                + super.toString();
    }
}
