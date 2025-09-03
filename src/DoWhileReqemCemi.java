import java.util.Scanner;

public class DoWhileReqemCemi {
    public static void main(String[] args) {

//        Daxil olunan ededin reqemleri cemini gosterir
        Scanner sc = new Scanner(System.in);

        System.out.println("eded daxil edin");
        int num1 = sc.nextInt();
        int sum = 0;
        while(num1>0)
        {
            sum += num1 % 10;
            num1 /= 10;
        }
        System.out.println(sum);














    }
}






