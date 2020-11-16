package OptionalTask;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4{
    public static void main(String[] args) {
        //Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
        String path = "data/Poem.txt";
        List<String> poem = readFile(path);
        poem.sort(new ComparatorByLength());

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


}
