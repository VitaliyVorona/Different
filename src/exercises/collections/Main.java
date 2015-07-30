package exercises.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vitaliy.vorona on 7/14/2015.
 */
/*��� �������
 1. ����� � ���������� 20 �����, ������� �� � ������ � ����������� �� ��� ������ �������:
 ����� ������� �� 3 (x%3==0), ������� �� 2 (x%2==0) � ��� ���������.
 �����, ������� ������� �� 3 � �� 2 ������������, �������� 6, �������� � ��� ������.
 2. ����� printList ������ �������� �� ����� ��� �������� ������ � ����� ������.
 3. ��������� ����� printList ������ ��� ��� ������ �� �����. ������� ���, ������� ��� x%3, ����� ���, ������� ��� x%2, ����� ���������.
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
