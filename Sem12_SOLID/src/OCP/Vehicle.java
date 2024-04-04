package OCP;

public class Vehicle {
    private int maxSpeed;
    private String type;
    // эти поля принимаем ч-з конструктор

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // добавим метод расчета допустимой скорости
    public double calculateAllowedSpeed(){
//        // выведем Car в отдельный класс
//        if (type.equals("Car"))
//            return maxSpeed * 0.8;
        return maxSpeed;
    }
    // переопределим этот метод для корректного вывода на экран с помощью toString()

    @Override
    public String toString() {
        return "Vehicle{" +
                "maxSpeed=" + calculateAllowedSpeed() +
                ", type='" + type + '\'' +
                '}';
    }
}
