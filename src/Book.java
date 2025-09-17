public class Book {
    String title;
    Author author;
    int price;

    Book(String title, Author author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void printDetails() {
        System.out.println("Kitabin adi: " + this.title + "\nKitabin muellifi: " +
                author.name + "\nQiymeti (azn):  " + this.price);
    }

}
