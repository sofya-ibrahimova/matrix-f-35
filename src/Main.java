import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Transport kia = new Transport(112, 4556, "Black", new int[]{0,0,0} );

        Scanner sc = new Scanner(System.in);
        Transport bmw = new Transport();
        System.out.print("Color: ");
        bmw.color = sc.next();
        System.out.print("Speed: ");
        bmw.speed = sc.nextFloat();
        System.out.print("Weight: ");
        bmw.weight = sc.nextFloat();
        System.out.print("Coordinate: ");
        bmw.coordinate = new int[3];
        for (int i = 0; i < bmw.coordinate.length; i++) {
            bmw.coordinate[i] = sc.nextInt();
        }
        bmw.getValues();

        Transport truck = new Transport();
        truck.setValues(150, 230, "White", new int[]{0, 1, 3});
        System.out.println("Truck color: " + truck.color + "\nTruck weight:" + truck.weight + "\nTruck speed: " + truck.speed
                + "\nTruck coordinate: " + Arrays.toString(truck.coordinate));
        Transport mersedec = new Transport();
        mersedec.setValues(250, 150, "Black", new int[]{0, 0, 0});

        System.out.println(mersedec.equals(bmw));

        System.out.println(bmw.equals(truck));


        Person[] persons = new Person[2];
        for (int i = 0; i < persons.length; i++){
            System.out.println(i+1 + "ad");
            String name =  sc.next();
            System.out.println("soyad ");
            String surname = sc.next();
            System.out.println("yas");
            int age = sc.nextInt();
            persons[i] = new Person(name, surname, age);
        }

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].name + " " + persons[i].surname + " " + persons[i].age);
        }

        }
    }


