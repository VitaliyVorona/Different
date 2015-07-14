package exercises.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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

 public static void intgereSorter(){

 }

}
