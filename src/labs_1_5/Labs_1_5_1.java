package labs_1_5;

/**
 * Created by vitaliy.vorona on 8/13/2015.
 */
public class Labs_1_5_1 {

    public void printDigits() {
        for (int i = 1; i < 9; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
