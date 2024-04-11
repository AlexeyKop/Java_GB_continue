package fabricMethod;
// генератор сундука GemReward
public class GemGen implements ItemGen{
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}
