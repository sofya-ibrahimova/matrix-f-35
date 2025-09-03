import java.util.Scanner;
import java.util.Random;
public class TesadufiEded {
    public static void main(String[] args){
//        proqram tesadufi eded secir, duzgun eded daxil olana qeder dovr davam edir
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
     int randomNumber = rand.nextInt(10);

        int number1 = 11;
        int attempts = 0;
        do {
            System.out.println("eded daxil et");
            number1 = sc.nextInt();
            attempts++;
        }
        while (number1 != randomNumber);

        System.out.println("random number is " + randomNumber);
        System.out.println("attempts: " + attempts);










    }
}
