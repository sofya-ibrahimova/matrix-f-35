import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 2;
        int[][] array = new int[num][num];
        System.out.println("elementleri daxil edin");
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }

        for (int i =0 ; i< array.length; i++){for (int j =0; j< array[i].length; j++)
        {
            System.out.print(array[i][j] + " ");

        }
            System.out.println();
        }
    }}
