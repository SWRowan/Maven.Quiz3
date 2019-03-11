package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) == 'a') ||
                    (word.charAt(i) == 'e') ||
                    (word.charAt(i) == 'i') ||
                    (word.charAt(i) == 'o') ||
                    (word.charAt(i) == 'u')) {
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) == 'a') ||
                    (word.charAt(i) == 'e') ||
                    (word.charAt(i) == 'i') ||
                    (word.charAt(i) == 'o') ||
                    (word.charAt(i) == 'u')) {
                return i;
            }
        }
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        if ((word.charAt(0) == 'A') ||
                (word.charAt(0) == 'E') ||
                (word.charAt(0) == 'I') ||
                (word.charAt(0) == 'O') ||
                (word.charAt(0) == 'U')) {
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        if ((character == 'A' || character == 'a') ||
                (character == 'E' || character == 'e') ||
                (character == 'I' || character == 'i') ||
                (character == 'O' || character == 'o') ||
                (character == 'U' || character == 'u')) {
            return true;
        }
        return false;
    }
}
