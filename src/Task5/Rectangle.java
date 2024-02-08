package Task5;

import Task5.Shape;
import Task5.ShapeType;

public class Rectangle extends Shape {

    public double a, b;

    public Rectangle(int color, double a, double b) {
        super(ShapeType.RECTANGLE, color);
        this.a = a;
        this.b = b;
    }

    public double getPerimiter() {
        return (this.a + this.b) * 2;
    }

    public double getSquare() {
        return this.a * this.b;
    }


}
