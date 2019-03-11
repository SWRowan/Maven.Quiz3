package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for(SomeType someType: array){
            if(getNumberOfOccurrences(someType) % 2 != 0){
                return someType;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(SomeType someType: array){
            if(getNumberOfOccurrences(someType) % 2 == 0){
                return someType;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer counter = 0;
        for(int x = 0; x<= array.length-1; x++){
            if(array[x] == valueToEvaluate){
                counter++;
            }
        }

        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

//        SomeType[] answer = Arrays.stream(array).map(predicate)
//                .collect(Stream.toArray());




        return null;
    }
}
