package adapter;

import java.time.LocalDateTime;

public class AdapterSensorTemperature implements MeteoSensor{
    SensorTemperature sensor;

    public AdapterSensorTemperature(SensorTemperature sensor) {
        this.sensor = sensor;
    }

    @Override
    public int getId() {
        return sensor.identifire();
    }

    @Override
    public Float getTemperature() {
        // делаем приведение типов в виде (float), т.к.
        // Float getTemperature() - температура датчика; double temperature () - температура датчика
        return (float)sensor.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(sensor.year(), 1, 1, 0, 0, 0);
        dateTime = dateTime.plusDays(sensor.day() - 1);
        dateTime = dateTime.plusSeconds(sensor.second());
        return dateTime;
    }
}
