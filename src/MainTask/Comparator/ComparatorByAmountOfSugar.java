package MainTask.Comparator;

import MainTask.Sweets.Sweet;

import java.util.Comparator;

public class ComparatorByAmountOfSugar implements Comparator<Sweet> {


    @Override
    public int compare(Sweet o1, Sweet o2) {
//        if(o1.getAmountOfSugarInSweet()-o2.getAmountOfSugarInSweet()>0){
//            return 1;
//        } else if(o1.getAmountOfSugarInSweet()-o2.getAmountOfSugarInSweet()>0){
//            return -1;
//        } else {
//            return 0;
//        }
       return (int) (o1.getAmountOfSugarInSweet()-o2.getAmountOfSugarInSweet());
    }
}
