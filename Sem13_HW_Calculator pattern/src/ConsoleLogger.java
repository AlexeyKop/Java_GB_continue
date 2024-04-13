public class ConsoleLogger implements OperationObserver {
    private String lastOperation; // Поле для хранения последней операции

    @Override
    public void update(double result) {
        // Выводим лог в консоль с результатом операции и самой операцией
        System.out.println("Лог: Результат операции " + lastOperation + ": " + result);
    }

    // Метод для установки последней операции
    public void setLastOperation(String operation) {
        this.lastOperation = operation;
    }
}
