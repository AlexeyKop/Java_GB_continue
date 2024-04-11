package fabricMethod;
// создадим сундук Gold
// реализем интерфейс для всех наших продуктов
public class GoldReward implements IGameItem{
    // реализуем метод open
    @Override
    public void open() {
        System.out.println("Открыли сундук с золотом");
    }


}
