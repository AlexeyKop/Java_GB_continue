public class Main {
    public static void main(String[] args) {
        // Создаем калькулятор
        BasicCalculator calculator = new BasicCalculator();
        // Создаем логгер для вывода результатов в консоль
        ConsoleLogger logger = new ConsoleLogger();

        // Регистрируем логгер как наблюдателя калькулятора
        calculator.registerObserver(logger);

        // Примеры использования калькулятора
        calculator.calculate(10, 5); // Сложение, умножение, деление
        calculator.calculate(8, 0); // Попытка деления на ноль

        // Удаляем логгер из наблюдателей калькулятора
        calculator.removeObserver(logger);
    }
}

