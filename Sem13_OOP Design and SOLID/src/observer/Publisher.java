package observer;

public interface Publisher {
    // регистрация нового обсервера
    void registerObserver(Observer observer);
    // удаление обсервера
    void removeObserver(Observer observer);
    // разослать оффер
    void sendOffer(String nameCompany, int salary);
}
