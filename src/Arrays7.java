import java.util.Arrays;
import java.util.Scanner;

public class Arrays7 {
    public static void main(String[] args) {
//        carpazdan asagi 0, yuxari 1

        Scanner sc = new Scanner(System.in);

        int[][] square = new int[4][4];


        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if (i < j) {
                    square[i][j] = 1;
                } else if (i > j) {
                    square[i][j] = 0;
                } else {
                    square[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[0].length; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}