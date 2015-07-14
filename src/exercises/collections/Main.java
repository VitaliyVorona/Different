package exercises.collections;

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
    public static void main(String[] args) {
        List list = new ArrayList<Integer>();
        list = (Utilities.getInputListValues("3"));
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
