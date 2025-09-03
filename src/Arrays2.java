import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {

//        arraydeki elementlerin ortalamasin tapir
        Scanner sc = new Scanner(System.in);
        int num = 5;

        int[] array = new int[num];
        int sum = 0;
        System.out.println("array elementleri:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / (double) array.length;
        System.out.println("ortalama = " + average);

    }
}
