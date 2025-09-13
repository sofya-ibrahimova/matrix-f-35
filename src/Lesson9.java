import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qeydiyyt kecenlerin sayi:");
        int count = sc.nextInt();
        Person[] student = new Person[count];
        boolean davam =true;
        while (davam) {
            System.out.println("Menu: \n1.Qeydiyyat \n2.Hamisini goster \n3.Exit");
            int number = sc.nextInt();

            switch (number) {
                case 1:
                    for (int i = 0; i < count; i++) {
                        System.out.println(i+1 + "ci telebenin adi: ");
                        String  name = sc.next();
                        System.out.println("soyadi: ");
                        String surname = sc.next();
                        System.out.println( "yasi: ");
                        int age = sc.nextInt();
                        student[i] = new Person(name, surname, age);
                    }
                    break;
                case 2:
                   for (int i = 0; i<count; i++){
                       System.out.print(i+1 + "ci telebe: " + student[i].name + " "
                               + student[i].surname + " " + student[i].age + "\n");
                   }
                    break;
                case 3:
                    davam = false;
            }
        }}}