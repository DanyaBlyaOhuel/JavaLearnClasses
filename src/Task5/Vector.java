package Task5;

public class Vector extends Line {


    private Task4.Point pos2;

    public Vector(Task4.Point pos1, Task4.Point pos2) {
        super(pos1, pos2);

    }

    public Vector(Line line) {
        super(line.pos1, line.pos2);
    }


    public Vector startFrom(Task4.Point pos1) {
        Task4.Point pos2 = new Task4.Point();
        pos2.x = pos1.x + (this.pos2.x - this.pos1.x);
        pos2.y = pos1.y + (this.pos2.y - this.pos1.y);
        return new Vector(pos1, pos2);
    }


    public Vector scalarSum(Vector another) {
        // берем исходный вектор и стартуем его с пос2
        Vector newVec = startFrom(another.pos2);
        // вектор с началом в another и конце в startfrom с конца another - исходная сумма этих двух векторов
        return new Vector(another.pos1, newVec.pos2);
    }

    public double scalarMult(Vector another) {
        //зададим координаты векторов. для этого достаточно воспользоваться StartFrom, который строит вектор от 0.0.0
        // по сути вторая точка в таком случае и будет координатами вектора в ортнормированном базисе
        Vector cordVector = startFrom(new Task4.Point(0, 0));
        // аналогично для another
        another.pos2.x -= another.pos1.x;
        another.pos2.y -= another.pos1.x;

        return cordVector.pos2.x * another.pos2.x + cordVector.pos2.y * another.pos2.y;
    }

}
