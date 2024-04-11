import java.util.*;

public class ToyManager {
    private List<Toy> toys = new ArrayList<>();
    private final String FILE_PATH = "all_toys.txt";
    private final FileReaderWriter fileReaderWriter = new FileReaderWriter(FILE_PATH);

    public ToyManager()  {
        readToysFromFile();
    }

    public static void addToy(Scanner scanner, ToyManager toyManager) {
        System.out.println("Введите данные новой игрушки:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Чтобы считать символ новой строки после nextInt()

        if (toyManager.toyExists(id)) {
            System.out.println("Игрушка с таким ID уже существует. Пожалуйста, введите другой ID.");
            return;
        }

        System.out.print("Название: ");
        String name = scanner.nextLine();
        System.out.print("Количество: ");
        int quantity = scanner.nextInt();
        System.out.print("Вес (частота выпадения в % от 0 до 100): ");
        double weightPercent = scanner.nextDouble();
        Toy newToy = new Toy(id, name, quantity, weightPercent);
        toyManager.addToy(newToy);
        System.out.println("Новая игрушка добавлена.");
    }

    public static void updateToyWeight(Scanner scanner, ToyManager toyManager) {
        System.out.print("Введите ID игрушки, чей вес хотите изменить: ");
        int toyId = scanner.nextInt();
        System.out.print("Введите новый вес (частоту выпадения в %): ");
        double newWeightPercent = scanner.nextDouble();
        toyManager.updateToyWeight(toyId, newWeightPercent);
        System.out.println("Вес игрушки обновлен.");
    }

    public void addToy(Toy toy) {
        if (toyExists(toy.getId())) {
            System.out.println("Игрушка с таким ID уже существует. Пожалуйста, введите другой ID.");
            return;
        }

        toys.add(toy);
        fileReaderWriter.writeToFile(toy.toFileString());
    }

    private boolean toyExists(int toyId) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                return true;
            }
        }
        return false;
    }

    public void updateToyWeight(int toyId, double newWeightPercent) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeightPercent(newWeightPercent);
                break;
            }
        }
    }

    public Toy getPrizeToy() {
        double totalWeight = toys.stream().mapToDouble(Toy::getWeightPercent).sum();
        double randomWeight = new Random().nextDouble() * totalWeight;
        double currentWeight = 0;
        for (Toy toy : toys) {
            currentWeight += toy.getWeightPercent();
            if (randomWeight < currentWeight) {
                Toy prizeToy = new Toy(toy.getId(), toy.getName(), 1, toy.getWeightPercent());
                removeToy(toy.getId());
                return prizeToy;
            }
        }
        return null;
    }

    public void removeToy(int toyId) {
        Iterator<Toy> iterator = toys.iterator();
        while (iterator.hasNext()) {
            Toy toy = iterator.next();
            if (toy.getId() == toyId && toy.getQuantity() > 0) {
                toy.setQuantity(toy.getQuantity() - 1);
                if (toy.getQuantity() == 0) {
                    iterator.remove();
                }
                updateFile();
                break;
            }
        }
    }

    private void readToysFromFile() {
        List<String> lines = fileReaderWriter.readFromFile();
        for (String line : lines) {
            String[] parts = line.split(",");
            if (parts.length == 4) {
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                int quantity = Integer.parseInt(parts[2]);
                double weightPercent = Double.parseDouble(parts[3]);
                toys.add(new Toy(id, name, quantity, weightPercent));
            }
        }
    }

    private void updateFile() {
        List<String> lines = new ArrayList<>();
        for (Toy toy : toys) {
            lines.add(toy.toFileString());
        }
        fileReaderWriter.writeToFile(lines);
    }

    // Добавим метод для записи призовой игрушки в файл
    public void writeToFilePrizeToy(String line) {
        fileReaderWriter.writeToFilePrizeToy(line);
    }

    public List<Toy> getAllToys() {
        return toys;
    }
}
