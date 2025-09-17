public class Car {

    String model;
    int year;
    int price;

    Car (String model){
        this.model = model;

    }
    Car (String model, int year){
        this.model = model;
        this.year = year;
    }

    Car (String model, int year, int price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void printCarInfo (){
        System.out.println("Model: " + this.model + "\nIl: " + this.year + "\nQiymet: " + this.price);
    }

}
