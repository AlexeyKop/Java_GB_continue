import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderWriter {
    private final String filePath;

    public FileReaderWriter(String filePath) {
        this.filePath = filePath;
    }

    // Записывает строку в файл.
    public void writeToFile(String line) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Записывает список строк в файл.
    public void writeToFile(List<String> lines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод записи призовой игрушки в файл prize_toys.txt
    public void writeToFilePrizeToy(String line) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("prize_toys.txt", true))) {
            bw.write(line);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Читает список строк из файла.
    public List<String> readFromFile() {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
