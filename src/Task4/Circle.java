package Task4;

public class Circle {
    public Point center;
    public double r;

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public double getSquare() {
        return Math.PI * Math.pow(r, 2);
    }


}

