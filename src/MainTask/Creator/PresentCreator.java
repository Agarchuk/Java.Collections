package MainTask.Creator;

import MainTask.Exceptions.*;
import MainTask.Present;
import MainTask.Sweets.Candy;
import MainTask.Sweets.Chocolate;
import MainTask.Sweets.Sweet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static MainTask.Creator.CreatorGeneric.createSweet;

public class PresentCreator extends Creator{

    public static Present createPresent() throws InputException, AmountOfSweetsException, OutOfSweetFirmAmount, OutOfCandyFillingsAmount, OutOfChocolateTypes, OutOfChocolateFirmAmount {
        System.out.print("Do yoy want to create Present? y/n: ");
        String inputFromConsole = Creator.inputFromConsole();
        List<Sweet> sweets = new ArrayList<>();
        try{
            if(inputFromConsole.equals("y")){
                Integer amountOfSweets = inputAmountOfSweets();
                sweets.addAll(createSweets(amountOfSweets));
            } else if(inputFromConsole.equals("n")){
                System.out.println("End of program!");
            } else {
                throw new InputException("Error of choice");
            }
        } catch (InputException e){
            System.out.println(e.getMessage());
        }
        return new Present(sweets);

    }

    public static Integer inputAmountOfSweets() throws AmountOfSweetsException {
        System.out.print("How much sweets do you want to add to present? ");
        Integer amountOfSweets = 0;
        try {
            amountOfSweets = Integer.valueOf(Creator.inputFromConsole());
        } catch (NumberFormatException e){
            System.out.println("Should be a number!");
        }
        return amountOfSweets;
    }

    public static List<Sweet> createSweets(Integer amountOfSweets) throws AmountOfSweetsException, OutOfSweetFirmAmount, OutOfCandyFillingsAmount, OutOfChocolateFirmAmount, OutOfChocolateTypes {
        List<Sweet> sweets = new ArrayList<>();
        System.out.println("Available sweets:\n" +
                "1. Candy;\n" +
                "2. Chocolate");
        System.out.print("How much candies do you want to add to present? ");
        Integer amountOfCandies;
        Integer amountOfChocolates;

        try {
            amountOfCandies = Integer.valueOf(Creator.inputFromConsole());
            if(amountOfCandies > amountOfSweets) throw new AmountOfSweetsException("Excess amount of candies!");
            System.out.print("How much chocolates do you want to add to present? ");
            try {
                amountOfChocolates = Integer.valueOf(Creator.inputFromConsole());
                if((amountOfCandies+amountOfChocolates) > amountOfSweets) throw new AmountOfSweetsException("Excess amount of sweets!");
                List<Candy> candies = createCandies(amountOfCandies);
                sweets.addAll(candies);
                List<Chocolate> chocolates = createChocolates(amountOfChocolates);
                sweets.addAll(chocolates);


            } catch (NumberFormatException e){
                System.out.println("Should be a number!");
            } catch (AmountOfSweetsException e){
                System.out.println(e.getMessage());
            }
        } catch (NumberFormatException e){
            System.out.println("Should be a number!");
        } catch (AmountOfSweetsException e){
            System.out.println(e.getMessage());
        }
        return sweets;
    }

    public static List<Candy> createCandies(Integer amountOfCandies) throws OutOfCandyFillingsAmount {
        List<Candy> candies = new ArrayList<>();
        for (int i = 0; i<amountOfCandies; i++){
            candies.add((Candy) createSweet(i, new Candy()));
        }
        return candies;
    }

    public static List<Chocolate> createChocolates(Integer amountOfChocolates) throws OutOfCandyFillingsAmount {
        List<Chocolate> chocolates = new ArrayList<>();
        for (int i = 0; i<amountOfChocolates; i++){
            chocolates.add((Chocolate) createSweet(i, new Chocolate()));
        }
        return chocolates;
    }


}
