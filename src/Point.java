import java.lang.Math;

public class Point {
    public double x, y;
    public static int count;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
        count += 1;
    }

    public static Point firstCnstr(double x, double y) {
        return new Point(x, y);

    }

    public static Point secondCnstr() {
        return new Point(0, 0);
    }

    public double length(Point another) {
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
    }

    public static Point[] maxLenght(Point[] arr) {
        Point[] result = new Point[2];
        double maxLen = 0d;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                double curlength = arr[i].length(arr[j]);
                if (curlength > maxLen) {
                    maxLen = curlength;
                    result = new Point[]{arr[i], arr[j]};
                }
            }
        }

        System.out.println(maxLen);
        System.out.println(result[0].toString());
        System.out.println(result[1].toString());

        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}' + hashCode();
    }

    public int getCount() {
        return count;
    }
}