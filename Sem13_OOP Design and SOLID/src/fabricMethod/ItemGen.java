package fabricMethod;
// абстракция для наших генераторов
public interface ItemGen {
    // будет всего 1 метод, который будет возвращать наш игровой элемент
    IGameItem createItem();
}
