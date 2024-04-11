import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ToyManager toyManager = new ToyManager();
        ToyRaffle toyRaffle = new ToyRaffle(toyManager);
        FileReaderWriter fileReaderWriter = new FileReaderWriter("prize_toys.txt");

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            printMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    toyManager.addToy(scanner, toyManager);
                    break;
                case 2:
                    System.out.println("Список всех игрушек:");
                    toyManager.getAllToys().forEach(System.out::println);
                    break;
                case 3:
                    ToyManager.updateToyWeight(scanner, toyManager);
                    break;
                case 4:
                    Toy prizeToy = toyRaffle.getPrizeToy();
                    System.out.println("Получена призовая игрушка: " + prizeToy);
                    fileReaderWriter.writeToFile(prizeToy.toString());
                    break;
                case 5:
                    List<String> raffledToys = fileReaderWriter.readFromFile();
                    System.out.println("Разыгранные игрушки:");
                    raffledToys.forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Некорректный ввод. Попробуйте снова.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\nМеню:");
        System.out.println("1. Добавить новую игрушку");
        System.out.println("2. Вывести список всех игрушек");
        System.out.println("3. Изменить вес (частоту выпадения игрушки)");
        System.out.println("4. Устроить розыгрыш случайной игрушки");
        System.out.println("5. Вывести список разыгранных игрушек");
        System.out.println("6. Выход");
        System.out.print("Выберите действие: ");
    }


}
