package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        ArrayList<Integer> newList = new ArrayList<>();
        for(Integer num : input){
            num*=num;
            newList.add(num);
        }
        ArrayList<Integer> sqValueList = new ArrayList<>();
        for(Integer num2 : squaredValues){
            sqValueList.add(num2);
        }
            if(newList.containsAll(sqValueList)){
                return true;
            }
        return false;
    }
}
