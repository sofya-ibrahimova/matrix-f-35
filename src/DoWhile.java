
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

//        Daxil edilen n ededinden 1 ededine qeder cap edir. 5 -> 5 4 3 2 1
        Scanner sc = new Scanner(System.in);

        System.out.println("eded daxil edin");
        int num = sc.nextInt();
        while (num > 1) {
            num--;
            System.out.println(num);
        }

}
}

