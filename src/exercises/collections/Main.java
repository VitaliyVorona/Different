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
    public static void main(String[] args) {
        List list = new ArrayList<Integer>();
        list = (Utilities.getInputListValues("3"));
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
