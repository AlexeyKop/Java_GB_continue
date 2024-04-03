import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Liskov substitution principle
// Принцип подстановки Барборы Лисков
// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель

public class Ex003_2LSP {
    public static void main(String[] args) {
        List<AbstractAnimal> list1 = new ArrayList<>(Arrays.asList(new Dog(), new Python()));

        for (var animal : list1) {
            System.out.println(animal.getType());
        }
        // на этапе написания кода с Legs компилятор нам не даст подставить классы, у которых неимплементирован Legs
        List<Legs> list2 = new ArrayList<>(Arrays.asList(new Dog()/* , new Python() */));
        for (var animal : list2) {
            System.out.println(animal.getLegsCount());

        }
    }
}

abstract class AbstractAnimal {
    public String getType() {
        return "Зверушка";
    }
}
// выделяем отдельный интерфейс, который будет считать кол-во лапок
interface Legs {
    int getLegsCount();
}
// Dog наследник AbstractAnimal, но будет ещё имплементировать интерфейс Legs
class Dog extends AbstractAnimal implements Legs {

    @Override
    public String getType() {
        return "собачка";
    }

    @Override
    public int getLegsCount() {
        return 4;
    }
}
// Python ни к чему имплементация интерфейса Legs
class Python extends AbstractAnimal {
    @Override
    public String getType() {
        return "питончик";
    }
}