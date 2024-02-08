package Task5;

import Task5.Shape;
import Task5.ShapeType;

public class Triangle extends Shape {

    public double a, b, c;

    public Triangle(int color, double a, double b, double c) {
        super(ShapeType.TRIANGLE, color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimiter() {
        return this.a + this.b + this.c;
    }

    public double getSquare() {
        double halfPerimeter = getPerimiter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.a) * (halfPerimeter - this.b) * halfPerimeter * this.c);
    }
}
