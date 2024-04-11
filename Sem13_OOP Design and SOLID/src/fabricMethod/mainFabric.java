package fabricMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// создадим список с нашими генераторами
public class mainFabric {
    public static void main(String[] args) {
        List<ItemGen> gens = new ArrayList<>();
        gens.add(new GoldGen());
        gens.add(new GemGen());
        Random rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            // IGameItem item = gens.get(Math.abs(rnd.nextInt() % gens.size())).createItem();
            // item.open();

            // при создании метода test, верхние 2 строки можно переписать:
            test(gens.get(Math.abs(rnd.nextInt() % gens.size())));
        }
    }
    // сделаем метод test
    public static void test(ItemGen gen){
        gen.createItem().open();
    }
}
