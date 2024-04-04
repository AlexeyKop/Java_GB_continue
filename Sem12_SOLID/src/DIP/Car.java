package DIP;

public class Car {
    // хранит в себе наш двигатель Engine
    private Engine engine;
    // принимаем его ч-з конструктор
    public Car(Engine engine) {
        this.engine = engine;
    }

    // теперь в конструкторе можем принимать либо DieselEngine, либо PetrolEngine, любого нашего наследника Engine
//
//    public Car(DieselEngine engine) {
//        this.engine = engine;
//    }
//
//    public Car(PetrolEngine engine) {
//        this.engine = engine;
//    }

    // также есть метод старт
    public void start(){
        engine.srart();
    }
}
