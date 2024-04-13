import java.util.ArrayList;
import java.util.List;

public class BasicCalculator implements Calculator {
    private List<OperationObserver> observers = new ArrayList<>();

    @Override
    public void calculate(double num1, double num2) {
        double result;

        // Сложение
        result = num1 + num2;
        // Устанавливаем последнюю операцию в логгере
        notifyObservers("Сложение", result);

        // Умножение
        result = num1 * num2;
        // Устанавливаем последнюю операцию в логгере
        notifyObservers("Умножение", result);

        if (num2 != 0) {
            // Деление (если делитель не равен нулю)
            result = num1 / num2;
            // Устанавливаем последнюю операцию в логгере
            notifyObservers("Деление", result);
        } else {
            System.out.println("Деление на ноль!");
        }
    }

    @Override
    public void registerObserver(OperationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OperationObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String operation, double result) {
        // Устанавливаем последнюю операцию в логгере перед уведомлением наблюдателей
        for (OperationObserver observer : observers) {
            if (observer instanceof ConsoleLogger) {
                ((ConsoleLogger) observer).setLastOperation(operation);
            }
            observer.update(result);
        }
    }
}
