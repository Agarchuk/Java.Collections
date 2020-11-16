package MainTask.Sweets;

import MainTask.Enums.FillingOfCandy;

public class Candy extends Sweet{
    private FillingOfCandy fillingOfCandy;

    public Candy(String nameOfSweet, double weightOfSweet, double amountOfSugarInSweet,
                 double priceOfCandy, FillingOfCandy fillingOfCandy) {
        super(nameOfSweet, weightOfSweet, amountOfSugarInSweet, priceOfCandy);
        this.fillingOfCandy = fillingOfCandy;
    }

    public Candy() {
        super();
    }

    public FillingOfCandy getFillingOfCandy() {
        return fillingOfCandy;
    }

    public void setFillingOfCandy(FillingOfCandy fillingOfCandy) {
        this.fillingOfCandy = fillingOfCandy;
    }

    @Override
    public String toString() {
        return "Candy:\n" +
                "firm: " + this.getNameOfSweet()+"; "+
                "weight: "+ this.getWeightOfSweet()+"; "+
                "amount of sugar: " + this.getAmountOfSugarInSweet()+"; "+
                "price of candy: "+this.getPriceOfSweet()+"; "+
                "filling Of Candy: " + fillingOfCandy+"\n";
    }
}
