package OptionalTask;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        //1.   Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
        String path = "data/File.txt";
        List<String> lines = readFile(path);
        List<String> reverseLines = reverse(lines);
        writeFile(reverseLines);
    }

    public static List<String> readFile(String path){
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static List<String> reverse(List<String> lines){
        List<String> reverseLines = new ArrayList<>();
        for (int i = lines.size()-1; i>=0; i--){
            reverseLines.add(lines.get(i));
        }
        return reverseLines;
    }

    public static void writeFile(List<String> text){
        try(FileWriter writer = new FileWriter("data/reversedText.txt")) {

            for (String line: text){
                writer.write(line+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
