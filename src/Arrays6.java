import java.util.Scanner;

public class Arrays6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//butun elementlerin, setirlerin sutunlarin cemini tapir

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8,},
                {9, 10, 11, 12}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("butun elementlerin cemi = " + sum);
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            int sum1 = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum1 += matrix[i][j];
            }
            System.out.println("setir: " + i + " = " + sum1);
        }
        System.out.println();

        for (int j = 0; j < matrix[0].length; j++) {
            int sum2 = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum2 += matrix[i][j];
            }
            System.out.println("sutun: " + j + " = " + sum2);
        }

    }
}
