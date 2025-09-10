import java.lang.reflect.Array;
import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//      int b =  linearSearch(x, 11);
//        System.out.println(b);

        long startBin = System.nanoTime();
        int find = Arrays.binarySearch(x, 5);
        long endBin = System.nanoTime();

        System.out.println(endBin - startBin);
        System.out.println("=======");

        long startLin = System.nanoTime();
        int find2 = linearSearch(x, 5);
        long endLin = System.nanoTime();

        System.out.println(endLin - startLin);
    }

    public static int linearSearch(int[] x, int key) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == key) {
                return i;
            }
        }
        return -1;
    }
//работает в больших массивах
}



