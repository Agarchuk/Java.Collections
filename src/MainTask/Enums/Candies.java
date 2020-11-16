package MainTask.Enums;

public enum Candies {
    LINDT(15.0, 7.0, 20.0),
    FERRERO(10.0, 5.0, 25.0),
    KOMMUNARKA(12.0, 6.0, 15.0),
    SPARTAK(13.0, 7.5, 17.5);

    public double weightOfSweet;
    public double amountOfSugarInSweet;
    public double priceOfCandy;

    Candies(double weightOfSweet, double amountOfSugarInSweet, double priceOfCandy) {
        this.weightOfSweet = weightOfSweet;
        this.amountOfSugarInSweet = amountOfSugarInSweet;
        this.priceOfCandy = priceOfCandy;
    }
}
