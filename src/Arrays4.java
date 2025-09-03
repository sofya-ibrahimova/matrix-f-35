import java.util.Arrays;
import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
//        menfi olmayan elementlerin 2 vahid artirir

        Scanner sc = new Scanner(System.in);
        int num = 5;
        int[] array = new int[num];
        System.out.println("array elemenlerini daxil edin: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                array[i] += 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }


}

