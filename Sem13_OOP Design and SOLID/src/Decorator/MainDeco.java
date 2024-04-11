package Decorator;

public class MainDeco {
    // в main булем создавать пиццу
    public static void main(String[] args) {
        Pizza pizza = new CheeseDecorator(new PeperoniDecorator(new CheeseDecorator(new PizzaDough())));
        printPizza(pizza);
    }
    // сделаем метод
    public static void printPizza(Pizza pizza){
        System.out.println(pizza.getDescription() + " " + pizza.getCost());
    }
}
