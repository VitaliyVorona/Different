package exercises.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vitaliy.vorona on 7/20/2015.
 * <p>
 * //http://info.javarush.ru/page/lectures/beta_lecture_7/
 */
public class Arrays {

    public static int[] getArrayFrom1to10() {
        int[] numbers = new int[10];
        for (int i = 1; i <= numbers.length; i++) {
            numbers[i - 1] = i;
        }
        return numbers;
    }

    public static int[] getArrayFrom10to1() {
        int[] numbers = new int[10];
        int ii = 0;
        for (int i = 10; i > 0; i--) {
            numbers[ii] = i;
            ii++;
        }
        return numbers;
    }

    public static int[] getArrayFrom0to9() {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
        return numbers;
    }

    public static int[] getArrayFrom9to0() {
        int[] numbers = new int[10];
        int ii = 0;
        for (int i = 9; i >= 0; i--){
            numbers[ii] = i;
            ii++;
        }
        return numbers;
    }

    public static String[] getArrayWith10WordsFromKeyboard() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = new String[10];
        for (int i = 0; i < 10; i++){
            words[i] = reader.readLine();
        }
        return words;
    }
}
