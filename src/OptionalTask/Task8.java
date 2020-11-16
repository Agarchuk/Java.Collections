package OptionalTask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        // Задан файл с текстом на английском языке.
        // Выделить все различные слова.
        // Слова, отличающиеся только регистром букв, считать одинаковыми. Использовать класс HashSet.
        String path = "data/English.txt";
        List<String> text = readFile(path);
        System.out.println(differentWirds(text));

    }

    public static List<String> readFile(String path){
        List<String> text = new ArrayList<>();
        try {
            text = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    public static HashSet<String> differentWirds(List<String> text){
        HashSet<String> differentWords = new HashSet<>();
        for (String line: text){
            String[] wordsInLine = line.split("[ /,;:!.]");
            for (String word: wordsInLine){
                differentWords.add(word.toLowerCase().strip());
            }
        }
        return differentWords;
    }
}
