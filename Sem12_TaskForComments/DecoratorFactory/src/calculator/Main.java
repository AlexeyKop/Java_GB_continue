package calculator;

import calculator_pattern.CalculableFactory;
import calculator_pattern.ICalculableFactory;
import calculator_pattern.ViewCalculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        calculator_pattern.ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
