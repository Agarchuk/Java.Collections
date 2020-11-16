package OptionalTask;

import java.util.Comparator;

public class ComparatorByLength implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = o1.length()-o2.length();
        if(result>0){
            return 1;
        } else if(result<0){
            return -1;
        }
        return result;
    }
}
