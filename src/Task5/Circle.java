package Task5;

public class Circle extends Shape {

    public Task4.Point center;
    public double r;

    public Circle(int color, Task4.Point center, double r) {
        super(ShapeType.CIRCLE, color);
        this.r = r;
        this.center = center;
    }

    public double getPerimiter() {
        return 2 * Math.PI * this.r;
    }

    public double getSquare() {
        return Math.PI * Math.pow(this.r, 2);
    }
}
