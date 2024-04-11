package fabricMethod;
// добавляем генератор
// реализуем интерфейс по генерации наших элементов
public class GoldGen implements ItemGen{
    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}
