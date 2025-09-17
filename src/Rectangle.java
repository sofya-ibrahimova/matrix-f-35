public class Rectangle {

    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    String rectangleArea() {
        return "Sahe: " + width * height;
    }

    String rectanglePerimeter() {
        return "Perimetr: " + 2 * (width + height);
    }
}
