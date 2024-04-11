package Decorator;
// наследуется от PizzaDecorator
public class CheeseDecorator extends PizzaDecorator{
    // конструктор
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }
    // переопределяем 2 метода и расширяем их
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", сыр";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20;
    }
}
