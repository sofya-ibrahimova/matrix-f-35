import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Transport bmw = new Transport();
        bmw.color = "Black";
        bmw.speed = 250;
        bmw.weight = 150;
        bmw.coordinate = new int[]{0, 0, 0};

//        System.out.println(bmw.getValues());

//        System.out.println("color: " + bmw.color + "\nspeed: " + bmw.speed + "\nweight: " + bmw.weight + "\ncoordinate: " + bmw.coordinate );
        Transport truck = new Transport();
        truck.setValues(150, 230, "White", new int[]{0, 1, 3});
//        System.out.println("Truck color: " + truck.color + "\nTruck weight:" + truck.weight + "\nTruck speed: " + truck.speed
//                + "\nTruck coordinate: " + Arrays.toString(truck.coordinate));
        Transport mersedec = new Transport();
        mersedec.setValues(250, 150, "Black", new int[]{0, 0, 0});

        System.out.println(mersedec.equals(bmw));

        System.out.println(bmw.equals(truck));

    }}


