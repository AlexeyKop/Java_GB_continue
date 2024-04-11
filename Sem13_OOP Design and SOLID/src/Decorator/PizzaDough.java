package Decorator;
// Тесто - компонент от которого будут  отталкиваться все наши будущие экземпляры
// наследуется от интерфейса Pizza
public class PizzaDough implements Pizza{
    // переопределяем 2 метода

    @Override
    public String getDescription() {
        return "Тесто";
    }

    @Override
    public double getCost() {
        return 150;
    }
}
