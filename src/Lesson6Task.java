import java.util.Scanner;

public class Lesson6Task {
    public static void main(String[] args) {
//        intervalda olan tek ededlerin cemini hesablayir

        Scanner sc = new Scanner(System.in);
        System.out.println("intervalin 1ci ededi: ");
        int left = sc.nextInt();
        System.out.println("sonuncu ededi: ");
        int right = sc.nextInt();
        int sum = 0;
        for (int i = left; i <= right; i++) {
            if (i % 2 != 0 ) {
                sum += i;
            }
        }
        System.out.println("cem = " + sum);


    }
}
