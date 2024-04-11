package Decorator;
// абстракция для всех наших будущих Декораторов, которые и будут расширять наш функционал
public abstract class PizzaDecorator implements Pizza{
    // protected переменная
    protected Pizza pizza;
    // конструктор, который принимает эту пиццу
    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

}
