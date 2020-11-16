//package MainTask.Creator;
//import MainTask.Enums.Candies;
//import MainTask.Enums.FillingOfCandy;
//import MainTask.Exceptions.OutOfSweetFirmAmount;
//import MainTask.Exceptions.OutOfCandyFillingsAmount;
//import MainTask.Sweets.Candy;
//
//public class CandiesCreator extends Creator{
//    public static Candy createCandy(int numberOfCandy) throws OutOfSweetFirmAmount, OutOfCandyFillingsAmount {
//        int numberOfFirm = chooseFirmOfCandy(numberOfCandy);
//        int numberOfFillingOfCandy = chooseFillingOfCandy(numberOfCandy);
//
//        return new Candy(String.valueOf(Candies.values()[numberOfFirm]),
//                Candies.values()[numberOfFirm].weightOfSweet,
//                Candies.values()[numberOfFirm].amountOfSugarInSweet,
//                Candies.values()[numberOfFirm].priceOfCandy,
//                FillingOfCandy.values()[numberOfFillingOfCandy]);
//    }
//
//    public static int chooseFirmOfCandy(int numberOfCandy) throws OutOfSweetFirmAmount {
//
//        int chosenFirmOfCandy = 0;
//        boolean flagCorrectInput = false;
//        do{
//            System.out.println("Choose firm of "+numberOfCandy+1+" candy: ");
//            for (Candies firm: Candies.values()){
//                System.out.println(firm.ordinal()+1 + ". " + firm);
//            }
//            System.out.print("Chosen firm: ");
//            chosenFirmOfCandy = Integer.parseInt(inputFromConsole());
//            try{
//                if(!(chosenFirmOfCandy > 0 & chosenFirmOfCandy <= Candies.values().length)) throw new OutOfSweetFirmAmount("Wrong number of Candy's firm!");
//                flagCorrectInput = true;
//            } catch (OutOfSweetFirmAmount e){
//                System.out.println(e.getMessage());
//            }
//        } while (!flagCorrectInput);
//
//        return chosenFirmOfCandy-1;
//    }
//
//    public static int chooseFillingOfCandy(int numberOfCandy) throws OutOfCandyFillingsAmount {
//
//        int chosenFillingOfCandy = 0;
//        boolean flagCorrectInput = false;
//
//        do {
//            System.out.println("Choose filling of "+numberOfCandy+1+" candy: ");
//            for (FillingOfCandy fillings: FillingOfCandy.values()){
//                System.out.println(fillings.ordinal()+1 + ". " + fillings);
//            }
//            System.out.print("Chosen fillings: ");
//            chosenFillingOfCandy = Integer.parseInt(inputFromConsole());
//            try {
//                if(!(chosenFillingOfCandy > 0 & chosenFillingOfCandy <= FillingOfCandy.values().length)) throw new OutOfCandyFillingsAmount("Wrong number of Candy's fillings!");
//                flagCorrectInput = true;
//            } catch (OutOfCandyFillingsAmount e){
//                System.out.println(e.getMessage());
//            }
//        } while (!flagCorrectInput);
//        return chosenFillingOfCandy-1;
//    }
//}
