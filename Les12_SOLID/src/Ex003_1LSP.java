import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Liskov substitution principle
// Принцип подстановки Лисков
// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель
public class Ex003_1LSP {
    public static void main(String[] args) throws Exception {
        List<Animal> list = 
        new ArrayList<>(Arrays.asList(new Cat(), new Fish() ));
        for (var animal : list) {
            System.out.println(animal.getType());
            System.out.println(animal.getLegsCount());
        }
    }
}
// Есть абстрактный класс Animal
abstract class Animal {
    public String getType() {
        return "Зверушка";
    }

// количество лапок
    public int getLegsCount() throws Exception {
        return 0;
    }
}
// простраиваем иерархию и возникают Cat и Fish
class Cat extends Animal {

    @Override
    public String getType() {
        return "кошечка";
    }

    @Override
    public int getLegsCount() {
        return 4;
    }
}
// но у Fish лапок нет
// поведение не должно быть поломано каким то производным классом
class Fish extends Animal
{
     @Override
     public String getType() {
        return "Рыбка";
     }
     public int getLegsCount() throws Exception {
        throw new Exception("я же рыбка...");
     }
}