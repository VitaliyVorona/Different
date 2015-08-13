package labs_1_5;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by vitaliy.vorona on 8/13/2015.
 */
public class Labs_1_5_2 {
    public void printDigits() {
        System.out.println("Enter a digit: ");
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.next());

        /*if (x <= 9) {
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9");
        }
        else if (x > 9){
            System.out.println("Other");
        }*/

        switch (x){
            case 1:
                System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9");
                break;
            case 2:
                System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9");
                break;
            case 3:
                System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9");
                break;
            case 4:
                System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9");
                break;
            case 5:
                System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9");
                break;
            case 6:
                System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9");
                break;
            case 7:
                System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9");
                break;
            case 8:
                System.out.println(" is 8 1, 2, 3, 4, 5, 6, 7, 8, 9");
                break;
            case 9:
                System.out.println(" is 9 1, 2, 3, 4, 5, 6, 7, 8, 9");
                break;
            default:
                System.out.println("OTHER");
        }
    }
}
