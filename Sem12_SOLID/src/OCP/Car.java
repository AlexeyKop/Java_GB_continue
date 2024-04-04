package OCP;
// класс Car будет наследником класса Vehicle
public class Car extends Vehicle{
    // ч-з конструктор
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    // расширяем реализацию методов и переопределяем их ч-з Override Methods

    @Override
    public double calculateAllowedSpeed() {
        return super.calculateAllowedSpeed() * 0.8;
    }


}
