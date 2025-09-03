import java.util.Scanner;

public class Lesson6Task2 {
    public static void main(String[] args) {
//        1 alinana qeder ededi bolur sonda deyismelerin sayini tapir

        Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil et:");
        int number = sc.nextInt();
        int num = 0;
        while (number > 1) {
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number += 1;
            }
            num++;
        }
        System.out.println("say = " + num);

    }
}
