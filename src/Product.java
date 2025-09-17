public class Product {

    int id;
    String name;
    int price;

    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    Product() {

    }

    static void printProductArray(Product[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print("Id: " + x[i].id + " Ad: " + x[i].name + " Qiymet: " + x[i].price + "\n");
        }
    }

    void printProductArray1(Product[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print("Id: " + x[i].id + " Ad: " + x[i].name + " Qiymet: " + x[i].price + "\n");
        }
    }

    static int maxPrice(int[] x) {
        int a = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > a) {
                a = x[i];
            }
        }
        return a;
    }
}

