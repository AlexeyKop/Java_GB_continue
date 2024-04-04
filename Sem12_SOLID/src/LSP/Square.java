package LSP;
// этот класс будет наследником QuadRangle
public class Square extends QuadRangle{
    // длина ребра, получим ч-з конструктор
    private int edgeLength;

    public Square(int edgeLength) {
        this.edgeLength = edgeLength;
    }
    // переопределяем метод area

    @Override
    double area() {
        return edgeLength * edgeLength;
    }
}
