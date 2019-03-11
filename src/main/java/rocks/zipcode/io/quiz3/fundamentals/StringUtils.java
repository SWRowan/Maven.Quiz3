package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char cap = str.toUpperCase().charAt(indexToCapitalize);
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(indexToCapitalize, cap);
        return sb.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        StringBuilder sb = new StringBuilder(baseString);
        if(sb.charAt(indexOfString) == characterToCheckFor){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {

        ArrayList<String> strList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                strList.add(string.substring(i,j));

            }
        }
        LinkedHashSet<String> deleteDups = new LinkedHashSet<>();
        deleteDups.addAll(strList);
        strList.clear();
        strList.addAll(deleteDups);
        String[] answer = new String[strList.size()];
        answer = strList.toArray(answer);
        return answer;
    }

    public static Integer getNumberOfSubStrings(String input){

        return  getAllSubStrings(input).length;
    }
}
