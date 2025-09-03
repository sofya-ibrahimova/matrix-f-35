import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
//        ilk elementle son elementin yerini deyisdirir
        Scanner sc = new Scanner(System.in);

        int num = 5;
        int[] array = new int[num];
        System.out.println("array elementlerin daxil et:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[num];
        for (int i = 0; i < array.length-2; i++) {

                array2[i + 1] = array[i + 1];
                array2[0] = array[array.length - 1];
                array2[array2.length - 1] = array[0];

            }
        System.out.println("yerleri deyismis hali");
            System.out.println(Arrays.toString(array2));

        }
    }

