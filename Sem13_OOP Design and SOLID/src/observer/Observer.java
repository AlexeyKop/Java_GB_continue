package observer;
// интерфейс Observer (наблюдатель)

public interface Observer {
    // будет 1 метод: ответить на офер
    void receiveOffer(String nameCompany, int salary);
}
