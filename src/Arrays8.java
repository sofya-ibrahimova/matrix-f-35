import java.util.Scanner;

public class Arrays8 {
    public static void main(String[] args) {
//        ededin simmetriya derecesi
        Scanner sc = new Scanner(System.in);

        System.out.println("ededi daxil edin:");
        int number = sc.nextInt();

        int temp = number;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }


        int[] arr = new int[digits];
        temp = number;
        for (int i = digits - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        int degree = 0;
        if (digits % 2 == 0) {
            for (int i = 0; i < digits / 2; i++)
                if (arr[i] == arr[digits - 1 - i]) {
                    degree++;
                }
        } else {
            for (int i = 0; i < digits / 2 + 1; i++)
                if (arr[i] == arr[digits - 1 - i]) {
                    degree++;
                }
        }
        System.out.print("simmetriya derecesi = " + degree);

    }
}