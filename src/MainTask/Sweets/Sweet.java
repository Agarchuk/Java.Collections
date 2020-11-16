package MainTask.Sweets;

public abstract class Sweet {
    private String nameOfSweet;
    private double weightOfSweet;
    private double amountOfSugarInSweet;
    private double priceOfSweet;

    public Sweet(String nameOfSweet, double weightOfSweet, double amountOfSugarInSweet, double priceOfSweet) {
        this.nameOfSweet = nameOfSweet;
        this.weightOfSweet = weightOfSweet;
        this.amountOfSugarInSweet = amountOfSugarInSweet;
        this.priceOfSweet = priceOfSweet;
    }

    public Sweet() {

    }

    public String getNameOfSweet() {
        return nameOfSweet;
    }

    public void setNameOfSweet(String nameOfSweet) {
        this.nameOfSweet = nameOfSweet;
    }

    public double getWeightOfSweet() {
        return weightOfSweet;
    }

    public void setWeightOfSweet(double weightOfSweet) {
        this.weightOfSweet = weightOfSweet;
    }

    public double getAmountOfSugarInSweet() {
        return amountOfSugarInSweet;
    }

    public void setAmountOfSugarInSweet(double amountOfSugarInSweet) {
        this.amountOfSugarInSweet = amountOfSugarInSweet;
    }

    public double getPriceOfSweet() {
        return priceOfSweet;
    }

    public void setPriceOfSweet(double priceOfSweet) {
        this.priceOfSweet = priceOfSweet;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "nameOfSweet='" + nameOfSweet + '\'' +
                ", weightOfSweet=" + weightOfSweet +
                ", amountOfSugarInSweet=" + amountOfSugarInSweet +
                ", priceOfCandy=" + priceOfSweet +
                '}';
    }
}
