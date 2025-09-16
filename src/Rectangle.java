public class Rectangle {

    double width;
    double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    double rectangleArea (){
        return width * height;
    }
    double rectanglePerimeter (){
        return 2*(width + height);

    }



}
