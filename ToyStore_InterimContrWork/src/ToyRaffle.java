import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ToyRaffle {
    private final ToyManager toyManager;

    public ToyRaffle(ToyManager toyManager) {
        this.toyManager = toyManager;
    }

    public Toy getPrizeToy() {
        List<Toy> allToys = toyManager.getAllToys();

        // Собираем список игрушек с учетом их весов
        List<Toy> weightedToys = collectWeightedToys(allToys);

        // Разыгрываем игрушку
        Random random = new Random();
        int index = random.nextInt(weightedToys.size());
        Toy prizeToy = weightedToys.get(index);

        // Уменьшаем количество игрушек на складе
        toyManager.removeToy(prizeToy.getId());

        // Записываем выигранную игрушку в файл призовых игрушек
        Toy prizeToyWithQuantityOne = new Toy(prizeToy.getId(), prizeToy.getName(), 1, prizeToy.getWeightPercent());
        toyManager.writeToFilePrizeToy(prizeToyWithQuantityOne.toFileString());

        return prizeToyWithQuantityOne;
    }

    private List<Toy> collectWeightedToys(List<Toy> toys) {
        List<Toy> weightedToys = new ArrayList<>();
        for (Toy toy : toys) {
            for (int i = 0; i < toy.getWeightPercent(); i++) {
                weightedToys.add(toy);
            }
        }
        return weightedToys;
    }
}
