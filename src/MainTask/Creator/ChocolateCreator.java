//package MainTask.Creator;
//
//import MainTask.Enums.Chocolates;
//import MainTask.Enums.TypeOfChocolate;
//import MainTask.Exceptions.OutOfCandyFillingsAmount;
//import MainTask.Exceptions.OutOfChocolateFirmAmount;
//import MainTask.Exceptions.OutOfChocolateTypes;
//import MainTask.Sweets.Chocolate;
//
//public class ChocolateCreator extends Creator{
//    public static Chocolate createChocolate(int numberOfChocolate) throws OutOfChocolateFirmAmount, OutOfChocolateTypes {
//        int numberOfFirm = chooseFirmOfChocolate(numberOfChocolate);
//        int numberOfTypeOfChocolate = chooseTypeOfChocolate(numberOfChocolate);
//
//        return new Chocolate(String.valueOf(Chocolates.values()[numberOfFirm]),
//                Chocolates.values()[numberOfFirm].weightOfSweet,
//                Chocolates.values()[numberOfFirm].amountOfSugarInSweet,
//                Chocolates.values()[numberOfFirm].priceOfCandy,
//                TypeOfChocolate.values()[numberOfTypeOfChocolate]);
//    }
//
//    public static int chooseFirmOfChocolate(int numberOfChocolate) throws OutOfChocolateFirmAmount {
//        int chosenFirmOfChocolate = 0;
//        boolean flagCorrectInput = false;
//        do {
//            System.out.println("Choose firm of "+numberOfChocolate+1+" chocolate: ");
//            for (Chocolates firm: Chocolates.values()) {
//                System.out.println(firm.ordinal() + 1 + ". " + firm);
//            }
//            System.out.print("Chosen firm: ");
//            chosenFirmOfChocolate = Integer.valueOf(inputFromConsole());
//            try{
//                if(!(chosenFirmOfChocolate > 0 & chosenFirmOfChocolate <= Chocolates.values().length)) throw new OutOfChocolateFirmAmount("Wrong number of Chocolate's firm!");
//                flagCorrectInput = true;
//            } catch (OutOfChocolateFirmAmount e){
//                System.out.println(e.getMessage());
//            }
//
//        } while (!flagCorrectInput);
//
//        return chosenFirmOfChocolate-1;
//    }
//
//    public static int chooseTypeOfChocolate(int numberOfChocolate) throws OutOfChocolateTypes {
//        int chosenTypeOfChocolate = 0;
//        boolean flagCorrectInput = false;
//        do {
//            System.out.println("Choose type of chocolate of "+numberOfChocolate+1+" chocolate: ");
//            for (TypeOfChocolate typeOfChocolate: TypeOfChocolate.values()){
//                System.out.println(typeOfChocolate.ordinal()+1 + ". " + typeOfChocolate);
//            }
//            System.out.print("Chosen type of chocolate: ");
//            chosenTypeOfChocolate = Integer.valueOf(inputFromConsole());
//            try {
//                if(!(chosenTypeOfChocolate > 0 & chosenTypeOfChocolate <= TypeOfChocolate.values().length)) throw new OutOfChocolateTypes("Wrong number of Chocolate's fillings!");
//                flagCorrectInput = true;
//            } catch (OutOfChocolateTypes e){
//                System.out.println(e.getMessage());
//            }
//        }while (!flagCorrectInput);
//
//        return chosenTypeOfChocolate-1;
//    }
//}
