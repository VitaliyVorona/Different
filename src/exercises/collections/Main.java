package exercises.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vitaliy.vorona on 7/14/2015.
 */
/*“ри массива
 1. ¬веди с клавиатуры 20 чисел, сохрани их в список и рассортируй по трЄм другим спискам:
 „исло делитс€ на 3 (x%3==0), делитс€ на 2 (x%2==0) и все остальные.
 „исла, которые дел€тс€ на 3 и на 2 одновременно, например 6, попадают в оба списка.
 2. ћетод printList должен выводить на экран все элементы списка с новой строки.
 3. »спользу€ метод printList выведи эти три списка на экран. —начала тот, который дл€ x%3, потом тот, который дл€ x%2, потом последний.
*/

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {

        int[] array = Arrays.getArrayFrom1to10();
        int[] array2 = Arrays.getArrayFrom1to10();
        int[] array3 = Arrays.getArrayFrom0to9();
        int[] array4 = Arrays.getArrayFrom9to0();
        String[] words = Arrays.getArrayWith10WordsFromKeyboard();
        for (int i = 0; i < array.length; i++){
//            System.out.println(array[i] + " array from 1 to 10");
//            System.out.println(array2[i] + " array from 10 to 1");
            System.out.println(words[i] + " array words");
        }
    }
}
