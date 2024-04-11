package adapter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface MeteoSensor {
    int getId();    // идентификтор датчика
    Float getTemperature();   // температура датчика
    Float getHumidity();    // влажность
    Float getPressure();    // давление
    LocalDateTime getDateTime();    // время чтения данных датчика
}
