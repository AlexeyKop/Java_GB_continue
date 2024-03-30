package Ex003Math.Mathematics.Shapes;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public static Rectangle create(double width, double height, String name) {
        // ???...
        var instance = new Rectangle();
        instance.name = name;

        instance.width = width;
        instance.height = height;
        return instance;
    }

    // скрытый конструктор
    private Rectangle() {
    }

    // вычисление площади
    @Override
    public double getArea() {
        return this.width * this.height;
    }

    // печать прямоугольника
    @Override
    public String toString() {
        // ???...
        return String.format("Name: %s  width: %d  height: %d", name, width, height);
    }
}
