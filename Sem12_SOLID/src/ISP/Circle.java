package ISP;
// наследник Shape
public class Circle implements Shape {
    // приватная переменная radius
    private int radius;
    // ее также принимаем ч-з конструктор

    public Circle(int radius) {
        this.radius = radius;
    }

    // имплементируем Methods perimetr

    @Override
    public double perimetr() {
        return 2 * 3.14 * radius;
    }
}
