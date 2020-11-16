package MainTask;

import MainTask.Creator.PresentCreator;
import MainTask.Exceptions.*;

/**
 * Created by Harchuk Hanna on 15.11.2020.
 *
 * Main class
 *
 * @author Harchuk Hanna
 **/

public class ConsoleApp {
    public static void main(String[] args) throws AmountOfSweetsException, InputException, OutOfSweetFirmAmount, OutOfCandyFillingsAmount, OutOfChocolateFirmAmount, OutOfChocolateTypes {
        //Новогодний подарок. Определить иерархию конфет и прочих сладостей.
        // Создать несколько объектов-конфет. Собрать детский подарок с определением его веса.
        // Провести сортировку конфет в подарке на основе одного из параметров.
        // Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.
        Present present = PresentCreator.createPresent();
        System.out.println(present);
        present.sortByAmountOfSugar();
        System.out.println("########################################");
        System.out.println("Sorted:\n" +present);
        System.out.println("########################################");
        System.out.println("Sweets from sugar range:\n"+present.showSweetsInSugarRange(6.0, 55.0));


    }
}
