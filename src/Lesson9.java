import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.StructureViolationException;

public class Lesson9 {
    static Person[] student = new Person[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean davam = true;
        while (davam) {
            System.out.println("Menu: \n1.Qeydiyyat \n2.Hamisini goster \n3.Update \n4.Delete" +
                    " \n5.Search \n6.Exit");
            int number = sc.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Qeydiyyt kecenlerin sayi:");
                    int count = sc.nextInt();
                    student = new Person[count];
                    for (int i = 0; i < count; i++) {
                        System.out.println(i + 1 + "ci telebenin adi: ");
                        String name = sc.next();
                        System.out.println("soyadi: ");
                        String surname = sc.next();
                        System.out.println("yasi: ");
                        int age = sc.nextInt();
                        student[i] = new Person(name, surname, age);
                    }
                    break;
                case 2:
                    for (int i = 0; i < student.length; i++)
                        if (student != null) {
                            if (student[i] != null) {
                                System.out.print(i + 1 + "ci telebe: " + student[i].name + " "
                                        + student[i].surname + " " + student[i].age + "\n");
                            }
                        }
                    System.out.println(" ilk once qeydiyyatdan kecin");
                    break;
                case 3:
                    System.out.println("update in novunu secin: \ntam \nqismen");
                    String updateType = sc.next();
                    if (updateType.equals("tam")) {

                        for (int i = 0; i < student.length; i++) {
                            System.out.println("necenci telebi update etmek isteyirsiz: ");
                            int updateCount = sc.nextInt();
                            student[updateCount - 1].name = sc.next();
                            student[updateCount - 1].surname = sc.next();
                            student[updateCount - 1].age = sc.nextInt();
                        }

                    } else if (updateType.equals("qismen"))
                        System.out.println("necenci telebi update etmek isteyirsiz: ");
                        int updateCount = sc.nextInt();
                        System.out.println(updateCount + "nomreli telebenin hansi datasini deyismek isteyirsiz?");
                        String updateData = sc.next();
                        String[] names = new String[student.length];
                        if (updateData.equals("ad")) {
                            for (int i = 0; i < student.length; i++) {
                                names[i] = student[i].name;
                                student[updateCount - 1].changeArrayElement(names);
                            }
                        } else if (updateData.equals("soyad")) {
                            System.out.println("daxil edin");
                            for (int i = 0; i < student.length; i++) {
                                student[updateCount - 1].surname = sc.next();
                            }
                        } else if (updateData.equals("yas")) {
                            System.out.println("daxil edin");
                            for (int i = 0; i < student.length; i++) {
                                student[updateCount - 1].age = sc.nextInt();
                            }
                        } else System.out.println("melumati duzgun daxil edin");
                        break;
                case 4:
                    System.out.println("hansi telebenin melumatlarini silmek isteyirsiz?");
                    String deleteData = sc.next();
                    String[] names1 = new String[student.length];
                        for (int i = 0; i < student.length; i++) {
                            names1[i] = student[i].name;}
                            for (int i =0; i< student.length; i++)
                            if (deleteData.equals(names1[i])){
                                student[i].name = null;
                                student[i].surname = null;
                                student[i].age = 0;}
                    break;
                        case 5:
                            

//                case 5:
//                    break;
//                case 6:
//                    davam = false;

                    }
            }


        }
    }
