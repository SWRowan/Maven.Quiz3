package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {



        String[] wave = new String[str.length()];

        for (int i = 0; i < str.length() ; i++) {
            StringBuilder sb = new StringBuilder(str.toLowerCase());
            sb.setCharAt(i, str.toUpperCase().charAt(i));
            wave[i] = sb.toString();
        }
        return wave;
    }
}
