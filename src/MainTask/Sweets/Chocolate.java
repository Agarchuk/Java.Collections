package MainTask.Sweets;

import MainTask.Enums.TypeOfChocolate;



public class Chocolate extends Sweet{
    private TypeOfChocolate typeOfChocolate;

    public Chocolate(String nameOfSweet, double weightOfSweet, double amountOfSugarInSweet, double priceOfChocolate, TypeOfChocolate typeOfChocolate) {
        super(nameOfSweet, weightOfSweet, amountOfSugarInSweet, priceOfChocolate);
        this.typeOfChocolate = typeOfChocolate;
    }

    public Chocolate() {
        super();
    }


    public TypeOfChocolate getTypeOfChocolate() {
        return typeOfChocolate;
    }

    public void setTypeOfChocolate(TypeOfChocolate typeOfChocolate) {
        this.typeOfChocolate = typeOfChocolate;
    }

    @Override
    public String toString() {
        return "Chocolate:\n" +
                "firm: " + this.getNameOfSweet()+"; "+
                "weight: "+ this.getWeightOfSweet()+"; "+
                "amount of sugar: " + this.getAmountOfSugarInSweet()+"; "+
                "price of chocolate: "+this.getPriceOfSweet()+"; "+
                "type of chocolate: " + typeOfChocolate+"\n";
    }
}

