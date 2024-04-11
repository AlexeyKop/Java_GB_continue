package Decorator;

public interface Pizza {
    // Будет 2 метода, которые мы будем расширять нашими Декораторами
    // Описание пиццы - содержит 2 компонента
    // Получить описание пиццы
    String getDescription();
    // Получить цену
    double getCost();
}
