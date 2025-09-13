import java.util.Scanner;

public class Person {
    String name;
    String surname;
    int age;
    Scanner sc = new Scanner(System.in);

    public Person (String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person() {

    }


    void setValues (){
        System.out.println("Ad:");
        this.name = sc.next();
        System.out.println("Soyad: ");
        this.surname = sc.next();
        System.out.println("Yas: ");
        this.age = sc.nextInt();
    }
    String getValues (){
        String info = "Ad: " + this.name + "\nSoyad: " + this.surname + "\nAge: " + this.age;
        return info;
    }
        }




