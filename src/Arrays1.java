import java.util.Arrays;
import java.util.Scanner;

//arrays'lerin ortaq elementlerin gosterir
public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int num1 = 5;
        int[] array1 = new int[num1];
        int[] array2 = new int[num1];

        System.out.println("array1 elementleri:");
        for (int i = 0; i < 5; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("array2 elementleri:");
        for (int i = 0; i < 5; i++) {
            array2[i] = sc.nextInt();
        }
        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                }
            }
        }
    }
}