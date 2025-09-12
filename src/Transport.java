import java.lang.reflect.Array;
import java.util.Arrays;

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

    public String getValues() {

        String info = "color: " + color + "\nspeed: " + speed + "\nweight: " + weight + "\n";
        String coordinatee = "coordinate: " + "\n";
        for (int i = 0; i < coordinate.length; i++) {
            coordinatee += coordinate[i] + "\n";
        }
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
