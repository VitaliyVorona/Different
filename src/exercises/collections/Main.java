package exercises.collections;

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
    public static void main(String[] args) throws InterruptedException {
        /*List list = new ArrayList<Integer>();
        List listOdd = new ArrayList<Integer>();
        List listEven = new ArrayList<Integer>();
        List listAll = new ArrayList<Integer>();
        list = (Utilities.getInputListValues("5"));

        Utilities.integerSorter(list, listOdd, listEven, listAll);
        Utilities.printList(listOdd, listEven, listAll);*/
        Utilities utilities = new Utilities();
        utilities.reverseCount();

    }
}
