import java.util.Arrays;

public class Lesson10 {
    public static void main(String[] args) {

        Student student1 = new Student("Aysel", 19);
        student1.printStudentInfo();

        System.out.println("========");

        Rectangle rectangle1 = new Rectangle(2, 5);
        System.out.println(rectangle1.rectangleArea());
        System.out.println(rectangle1.rectanglePerimeter());

        System.out.println("==========");

        Author a1 = new Author("Orwell");
        Book b1 = new Book("1984", a1, 7);
        b1.printDetails();

        System.out.println("========");

        BankAccount bankAccount1 = new BankAccount(567, -200);

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.accountNumber = 345;
        bankAccount2.balance = 1000;

        System.out.println(bankAccount1);

        System.out.println(bankAccount2);

        System.out.println(bankAccount2.deposit());

        System.out.println(bankAccount2.withdraw(10));

        BankAccount.printOrderCount();

        System.out.println("========");

        Car car1 = new Car("bmw");
        Car car2 = new Car("kia", 2018);
        Car car3 = new Car("mercedes", 2015, 15000);
        car1.printCarInfo();
        System.out.println();
        car2.printCarInfo();
        System.out.println();
        car3.printCarInfo();

        System.out.println("===========");

        Employee employee1 = new Employee("Aynur", 2000);
        Employee employee2 = new Employee();
        System.out.println("Employee1: \n" + employee1.printInfo());
        System.out.println("Employee2: \n" + employee2.printInfo());

        System.out.println("=============");

        Product product1 = new Product(123, "stol", 200);
        Product product2 = new Product(122, "stul", 100);
        Product product3 = new Product(223, "divan", 300);
        Product product4 = new Product(225, "skaf", 350);
        Product product5 = new Product(226, "kreslo", 160);

        Product[] product = {product1, product2, product3, product4, product5};


        Product.printProductArray(product);
        System.out.println();

        Product u = new Product();
        u.printProductArray1(product);

        int[] priceArr = new int[product.length];
        for (int i = 0; i < priceArr.length; i++) {
            priceArr[i] = product[i].price;
        }
          System.out.println("Maksimal qiymet: " +  Product.maxPrice(priceArr));


    }
}
