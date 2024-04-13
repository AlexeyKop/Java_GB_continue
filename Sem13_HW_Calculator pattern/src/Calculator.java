public interface Calculator {
    // Метод для выполнения вычислений
    void calculate(double num1, double num2);
    // Метод для добавления нового наблюдателя
    void registerObserver(OperationObserver observer);
    // Метод для удаления наблюдателя
    void removeObserver(OperationObserver observer);
}
