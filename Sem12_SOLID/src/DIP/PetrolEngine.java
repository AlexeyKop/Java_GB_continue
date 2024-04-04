package DIP;
// реализуют в себе интерфейс для двигателя
public class PetrolEngine implements Engine{

    @Override
    public void srart() {
        System.out.println("Petrol engine start");
    }
}
