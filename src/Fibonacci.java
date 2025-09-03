public class Fibonacci {
    public static void main(String[] args) {

        int number1 = 0;
        int number2 = 1;
        int number3 = 0;
//        0 1 1 2 3 5 8 13 21 34
        for (int i = 1; i < 10; i++) {
            System.out.print(number1 + " ");
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;

        }

    }
}
