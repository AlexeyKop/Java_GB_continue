import java.util.Locale;

public class Toy {
    private int id;
    private String name;
    private int quantity;   // кол-во
    private double weightPercent; // Вес в процентах от 0 до 100

    public Toy(int id, String name, int quantity, double weightPercent) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weightPercent = weightPercent;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeightPercent() {
        return weightPercent;
    }

    public void setWeightPercent(double weightPercent) {
        if (weightPercent < 0 || weightPercent > 100) {
            throw new IllegalArgumentException("Weight percent must be between 0 and 100.");
        }
        this.weightPercent = weightPercent;
    }

    // Метод для строкового представления игрушки
    public String toFileString() {
        return String.format(Locale.US, "%d,%s,%d,%.2f",
                id, name, quantity, weightPercent);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", weightPercent=" + weightPercent +
                '}';
    }
}
