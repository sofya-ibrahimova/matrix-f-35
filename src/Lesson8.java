import java.util.Arrays;

public class Lesson8 {

    public static void main(String[] args) {
//        methods

    }

    static void addTwoNumbers(int a, int b) {
        int res = a + b;
        System.out.println(res);
    }

    static void print (String word){
        System.out.println(word);
    }

    static double averageArray(int[] x) {
        int sum = 0;
        int say = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
            say++;
        }
        double average = (double) sum/say;
        System.out.println(average);
        return (average);
    }

    static void maxOfThree(int a, int b, int c) {
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        String maksNum = "Maksimal eded = " + max;
        print(maksNum);

    }

    static void factorialOfNumber(int a) {
        int eded = a;
        int factorial = 1;
        while (a > 0) {
            factorial *= a--;
        }
        String f = eded + "! = " + factorial;
        print(f);
    }

    static void reverse(long a) {
        long reverse = 0;
        while (a > 0) {
            reverse =reverse * 10 + a % 10;
            a /= 10;
        }
        String r = "Ters eded = " + reverse;
        print(r);
    }
static void sumArray(int[]x){
    int sum = 0;
        for (int i = 0; i<x.length;i++){
            sum+=x[i];
        }
        String cem = "Elementlerin cemi = " + sum;
        print(cem);
}
static boolean isPalindrome (int a) {
    int reverse = 0;
    int number = a;
    for ( ;number>0;  number /= 10) {
        reverse = reverse * 10 + number % 10;
    }
    System.out.println(a==reverse);
       return a == reverse;

}
static void longestNumber (int a, int b){
    int num1 = 0;
    int firstNum = a;
        while(a>0){
             a/=10;
            num1++;
        }int num2 = 0;
        int secondNum = b;
        while (b>0){
            b/=10;
            num2++;
    } if(num1>num2){
        System.out.println(firstNum);
        }else System.out.println(secondNum);
}


}
