package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    VowelUtils vu = new VowelUtils();

    public String translate(String str) {
        String[] arr = str.split(" ");
        String pigLatin = " ";

        if(arr.length == 1) {
            pigLatin = translator(str);
        }else{
            for (String s : arr) {
                pigLatin += translator(s);
            }
        }

        return pigLatin;
    }

    private String translator(String str) {
        StringBuilder sb = new StringBuilder();
        if (vu.hasVowels(str)) {
            if (vu.getIndexOfFirstVowel(str) == 0) {
                sb.append(str);
                sb.append("way");
            } else {
                sb.append(str.substring(vu.getIndexOfFirstVowel(str), str.length()));
                sb.append(str.substring(0, vu.getIndexOfFirstVowel(str)));
                sb.append("ay");
            }
        } else {
            sb.append(str);
            sb.append("ay");
        }
        return sb.toString();
    }
}
