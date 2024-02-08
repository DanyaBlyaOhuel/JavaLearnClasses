package Task5;

public class Line {

    public Task4.Point pos1, pos2;

    public Line(Task4.Point pos1, Task4.Point pos2) {
        this.pos1 = pos1;
        this.pos2 = pos2;
    }


    public double length(Task4.Point pos1, Task4.Point pos2) {
        return Math.sqrt(Math.pow(Math.abs(pos2.x - pos1.x), 2) + Math.pow(Math.abs(pos2.y - pos1.y), 2));
    }

    // метод который возвращает коэф. наклона. нужен для определения параллельности прямых
    public double getSlopeFactor(Task4.Point pos1, Task4.Point pos2) {
        return (pos2.y - pos1.y) / (pos2.x - pos1.x);
    }

    public boolean isCross(Line line1, Line line2) {

        return getSlopeFactor(line1.pos1, line1.pos2) != getSlopeFactor(line2.pos1, line2.pos2);
    }

    public boolean isParallel(Line line1, Line line2) {

        return !isCross(line1, line2);
    }

}
