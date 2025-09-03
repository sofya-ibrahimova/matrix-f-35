import java.util.Scanner;

public class WhileKalkulyator {
    public static void main(String[] args) {

        Scanner calculator = new Scanner(System.in);

        boolean davamEt = true;
        while (davamEt) {
            System.out.println("Emeliyyati secin\n1.toplama\n2.cixma\n3.vurma\n4.bolme\n5.exit");

            int number = calculator.nextInt();
            switch (number) {
                case 1:
                    System.out.println("birinci eded:");
                    int num1 = calculator.nextInt();
                    System.out.println("ikinci eded:");
                    int num2 = calculator.nextInt();
                    System.out.println("cem: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("birinci eded:");
                    int num3 = calculator.nextInt();
                    System.out.println("ikinci eded:");
                    int num4 = calculator.nextInt();
                    System.out.println("ferq: " + (num3 - num4));
                    break;
                case 3:
                    System.out.println("birinci eded:");
                    int num5 = calculator.nextInt();
                    System.out.println("ikinci eded:");
                    int num6 = calculator.nextInt();
                    System.out.println("hasil: " + num5 * num6);
                    break;
                case 4:
                    System.out.println("birinci eded:");
                    int num7 = calculator.nextInt();
                    System.out.println("ikinci eded:");
                    int num8 = calculator.nextInt();
                    System.out.println("nisbet: " + num7 / num8);
                    break;

                case 5:
                    davamEt = false;
                    break;
                default:
                    System.out.println("duzgun secin");
            }


        }
    }}
