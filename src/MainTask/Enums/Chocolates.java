package MainTask.Enums;

public enum Chocolates {
    LINDT(100, 55.0, 250.0),
    ALPENGOLD(90, 65.0, 75.0),
    MILKA(90, 60.0, 95.0),
    RITTERSPORT(100, 50.5, 150.5);

    public double weightOfSweet;
    public double amountOfSugarInSweet;
    public double priceOfCandy;

    Chocolates(double weightOfSweet, double amountOfSugarInSweet, double priceOfCandy) {
        this.weightOfSweet = weightOfSweet;
        this.amountOfSugarInSweet = amountOfSugarInSweet;
        this.priceOfCandy = priceOfCandy;
    }
}
