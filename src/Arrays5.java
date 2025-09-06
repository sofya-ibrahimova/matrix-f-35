import java.util.Arrays;
import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {
//        6ya bolunen elementlerin cemini ve sayini tapir
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        System.out.println("elementleri daxil edin:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int sum = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 6 == 0) {
                sum += array[i];
                num++;
            }
        }
        System.out.println("cem = " + sum + "\nsay = " + num);

    }
}