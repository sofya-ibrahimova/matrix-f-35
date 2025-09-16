import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Transport {

    public float speed;
    public float weight;
    public String color;
    public int[] coordinate;

    public void setValues(float speed, float weight, String color, int[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }
    Transport(){

    }

   public Transport (float speed, float weight, String color, int [] coordinate){
        this.speed = speed;
        this.weight = weight;
        this.coordinate = coordinate;
        this.color = color;

        System.out.println(getValues());

    }

    public String getValues() {

        String info = "color: " + color + "\nspeed: " + speed + "\nweight: " + weight + "\n";
        String coordinatee = "coordinate: " + "\n";
        for (int i = 0; i < coordinate.length; i++) {
            coordinatee += coordinate[i] + "\n";
        }
        System.out.println(info + coordinatee);
        return info + coordinatee;
    }

    boolean equals(Transport other) {
        return this.weight == other.weight && this.color.equals(other.color) &&
                this.speed == other.speed && isEqual(this.coordinate, other.coordinate);
    }
    static boolean isEqual (int[]x,int[]y) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i])
                return false;
        }
        return true;
}}
