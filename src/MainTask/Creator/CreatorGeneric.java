package MainTask.Creator;

import MainTask.Enums.Candies;
import MainTask.Enums.Chocolates;
import MainTask.Enums.FillingOfCandy;
import MainTask.Enums.TypeOfChocolate;
import MainTask.Exceptions.OutOfSweetFirmAmount;
import MainTask.Exceptions.OutOfCandyFillingsAmount;
import MainTask.Sweets.Candy;
import MainTask.Sweets.Chocolate;
import MainTask.Sweets.Sweet;

public class CreatorGeneric<T> extends Creator{

    public static  <T extends Sweet> T createSweet(int numberOfSweet, T T) {
        String nameOfSweet = "sweet";
        int numberOfFirm = 0;
        int numberOfSweetKind = 0;
        System.out.println(T.getClass());
        if(T instanceof Candy){
            nameOfSweet = "candy";
            numberOfFirm = inputNumberOfFirm(numberOfSweet, Candies.values(),  nameOfSweet);
            numberOfSweetKind = chooseKindOfSweet(numberOfSweet, FillingOfCandy.values(), nameOfSweet);
            return (T) new Candy(String.valueOf(Candies.values()[numberOfFirm]),
                    Candies.values()[numberOfFirm].weightOfSweet,
                    Candies.values()[numberOfFirm].amountOfSugarInSweet,
                    Candies.values()[numberOfFirm].priceOfCandy,
                    FillingOfCandy.values()[numberOfSweetKind]);
        } else {
            nameOfSweet = "chocolate";
            numberOfFirm = inputNumberOfFirm(numberOfSweet,Chocolates.values(), nameOfSweet);
            numberOfSweetKind = chooseKindOfSweet(numberOfSweet, TypeOfChocolate.values(), nameOfSweet);
            return (T) new Chocolate(String.valueOf(Chocolates.values()[numberOfFirm]),
                    Chocolates.values()[numberOfFirm].weightOfSweet,
                    Chocolates.values()[numberOfFirm].amountOfSugarInSweet,
                    Chocolates.values()[numberOfFirm].priceOfCandy,
                    TypeOfChocolate.values()[numberOfSweetKind]);
        }

    }

    public static <T extends Enum>  int inputNumberOfFirm(int numberOfSweet, T[] arrayOfFirmsSweet, String nameOfSweet) {
        int chosenFirmOfSweet = 0;
        boolean flagCorrectInput = false;
        do {
            System.out.println("Choose firm of " + numberOfSweet + 1 + " " + nameOfSweet + ": ");
            for (T firm : arrayOfFirmsSweet) {
                System.out.println(firm.ordinal() + 1 + ". " + firm);
            }
            System.out.print("Chosen firm: ");
            chosenFirmOfSweet = Integer.parseInt(inputFromConsole());
            try {
                if (!(chosenFirmOfSweet > 0 & chosenFirmOfSweet <= Candies.values().length))
                    throw new OutOfSweetFirmAmount("Wrong number of " + nameOfSweet + "'s firm!");
                flagCorrectInput = true;
            } catch (OutOfSweetFirmAmount e) {
                System.out.println(e.getMessage());
            }
        } while (!flagCorrectInput);
        return chosenFirmOfSweet-1;
    }

    public static <T extends Enum> int chooseKindOfSweet(int numberOfSweet, T[] arrayOfKindSweet, String nameOfSweet) {

        int chosenFillingOfCandy = 0;
        boolean flagCorrectInput = false;

        do {
            System.out.println("Choose filling of "+numberOfSweet+1+" "+nameOfSweet+": ");
            for (T fillings: arrayOfKindSweet){
                System.out.println(fillings.ordinal()+1 + ". " + fillings);
            }
            System.out.print("Chosen fillings: ");
            chosenFillingOfCandy = Integer.parseInt(inputFromConsole());
            try {
                if(!(chosenFillingOfCandy > 0 & chosenFillingOfCandy <= FillingOfCandy.values().length)) throw new OutOfCandyFillingsAmount("Wrong number of Candy's fillings!");
                flagCorrectInput = true;
            } catch (OutOfCandyFillingsAmount e){
                System.out.println(e.getMessage());
            }
        } while (!flagCorrectInput);
        return chosenFillingOfCandy-1;
    }

}
