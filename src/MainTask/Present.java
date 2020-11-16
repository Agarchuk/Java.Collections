package MainTask;

import MainTask.Comparator.ComparatorByAmountOfSugar;
import MainTask.Sweets.Sweet;

import java.util.ArrayList;
import java.util.List;

public class Present{
    List<Sweet> sweets;
    private double totalPriceOfPresent;
    private int amountOfCandiesInPresent;
    private double weightOfPresent;

    public Present(List<Sweet> sweets) {
        this.sweets = sweets;
        getAmountOfCandiesInPresent(sweets);
        getTotalPriceOfPresent(sweets);
        getWeightOfPresent(sweets);
    }

    public List<Sweet> getSweets() {
        return sweets;
    }

    public double getTotalPriceOfPresent(List<Sweet> sweets) {
        for (Sweet sweet: sweets){
            this.totalPriceOfPresent+= sweet.getPriceOfSweet();
        }
        return totalPriceOfPresent;
    }

    public int getAmountOfCandiesInPresent(List<Sweet> sweets) {
        for (Sweet sweet: sweets){
            this.amountOfCandiesInPresent++;
        }
        return amountOfCandiesInPresent;
    }

    public double getWeightOfPresent(List<Sweet> sweets) {
        for (Sweet sweet: sweets){
            this.weightOfPresent += sweet.getWeightOfSweet();
        }
        return weightOfPresent;
    }

    public void sortByAmountOfSugar(){
        this.sweets.sort(new ComparatorByAmountOfSugar());
    }

    public List<Sweet> showSweetsInSugarRange(double from, double to){
        List<Sweet> sweets = new ArrayList<>();
        for (Sweet sweet:this.sweets){
            if(sweet.getAmountOfSugarInSweet()>from &sweet.getAmountOfSugarInSweet()<to){
                sweets.add(sweet);
            }
        }
        return sweets;
    }

    @Override
    public String toString() {
        return "Present consist of:\n" +
                sweets + "\n" +
                "Total Price Of Present: " + totalPriceOfPresent + "; " +
                "Amount Of Candies In Present: " + amountOfCandiesInPresent + "; " +
                "Weight Of Present: " + weightOfPresent + "; " + "\n";
    }
}
