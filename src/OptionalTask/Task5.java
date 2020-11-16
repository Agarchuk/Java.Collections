package OptionalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        //Не используя вспомогательных объектов,
        // переставить отрицательные элементы данного списка в конец,
        // а положительные — в начало списка.
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(2);
        list.add(-27);
        list.add(-13);
        list.add(15);
        list.add(45);
        list.add(-55);
        list.sort(((o1, o2) -> o2-o1));
        System.out.println(list);

    }
}
