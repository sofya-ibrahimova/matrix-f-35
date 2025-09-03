import java.util.Arrays;
import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        //ARRAYS
//виды массивов
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        String [] names = {"sofya", "sevda", "aynur"};

//задаем только длину (размер) массива без содержимого
        int [] num = new int [3];
//        System.out.println(num[1]);
//меняем содержимое
        num[1] = 3; // второй элемент будет равен 3
//        System.out.println(num[1]);

      //чтобы показать содержимое массива
        for (int i =0 ; i< names.length; i++){
//            System.out.print(names[i] + " ");
        }
//        System.out.println();
        for (String n : names){    //for each
//            System.out.print(n + " ");
        }

//        System.out.println(Arrays.toString(names));
;
//        System.out.println(Arrays.toString(arr));
        //если неизвестен номер последнего элемента массива
arr[arr.length-1] = 13;
//        System.out.println(arr[arr.length-1]);

//        ряд фибоначи с помощью массивов
        int fibonachi [] = new int [10];
        fibonachi[0]=0;
        fibonachi[1]=1;
        for (int i = 2; i< fibonachi.length; i++){
            fibonachi[i] = fibonachi[i-1] + fibonachi[i-2];
        }
//        System.out.println(Arrays.toString(fibonachi));

//        ввод элементов массива вручную
        Scanner sc = new Scanner(System.in);
        int say = 5;

        int [] numbers = new int[say];
        for (int i = 0; i< numbers.length; i++ ){
            numbers[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numbers));





    }
}
