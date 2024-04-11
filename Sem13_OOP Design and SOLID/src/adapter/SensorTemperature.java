package adapter;

public interface SensorTemperature {
    int identifire();   // идентификатор датчика
    double temperature ();  // температура датчика
    int year();    // Год
    int day();   // День года
    int second();   // Секунда дня
}
