import java.util.Scanner;

public class DoWhileSoz {
    public static void main(String[] args){

//        Java sozu daxil olunana qeder soz daxil etmeyi teleb edir
       Scanner sc = new Scanner(System.in);
        String word;
        do {
            System.out.println("soz daxil edin:");
            word = sc.next();

        }
        while (!word.equalsIgnoreCase("Java"));
        System.out.println("duzgun soz daxil etdiniz");




    }}
