package calculator_pattern;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        calculator_pattern.ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
