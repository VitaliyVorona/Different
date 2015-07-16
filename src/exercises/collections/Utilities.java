package exercises.collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by vitaliy.vorona on 7/14/2015.
 */
public class Utilities {

    public static List getInputListValues(String value){
     String s = null;
     List list = new ArrayList<Integer>();
         int i = Integer.parseInt(value);
         for (; i > 0; i--){
             try {
                 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                 s = reader.readLine();
                 list.add(Integer.parseInt(s));
             } catch (Exception e){
                 System.out.println(e.toString());
             }
     }
     return list;
 }

    public static void integerSorter(List<Integer> unsortedList, List<Integer> listOdd, List<Integer> listEven, List<Integer> listAll){
     List listOfOdd = listOdd;
     List listOfEven = listEven;
     List listOfOddEven= listAll;

     for (int i = 0; i < unsortedList.size(); i++){
         if (unsortedList.get(i) % 3 == 0 && unsortedList.get(i) % 2 == 0){listOfEven.add(unsortedList.get(i)); listOfOdd.add(unsortedList.get(i));}
         else if (unsortedList.get(i) % 2 == 0){listOfEven.add(unsortedList.get(i));}
         else if (unsortedList.get(i) % 3 == 0){listOfOdd.add(unsortedList.get(i));}
         else {listOfOddEven.add(unsortedList.get(i));}
     }
 }

    public static void printList(List<Integer> listOdd, List<Integer> listEven, List<Integer> listAll){
     for(int i : listOdd){
         System.out.println("Odd is: " + i);
     }
     for (int i : listEven){
         System.out.println("Even is: " + i);
     }
     for (int i : listAll){
         System.out.println("Rest is: " + i);
     }
 }

    public void reverseCount() throws InterruptedException {
        Date initTime = new Date();
        System.out.println(initTime);
        for (int i = 30; i >= 0; i--){
            System.out.println(i);
            Thread.sleep(100);
        }
        Date currentTime = new Date();
        System.out.println("Bum! " + ((currentTime.getTime() - initTime.getTime())/1000));
    }
}
