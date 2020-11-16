package OptionalTask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        //Ввести строки из файла, записать в список ArrayList.
        // Выполнить сортировку строк, используя метод sort() из класса Collections.
        String path = "data/Poem.txt";
        ArrayList<String> text = readFile(path);
        text.sort(((o1, o2) -> o1.length() - o2.length()));
        System.out.println(text );

    }
    public static ArrayList<String> readFile(String path){
        List<String> text = new ArrayList<>();
        try {
            text = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (ArrayList<String>) text;
    }

}
