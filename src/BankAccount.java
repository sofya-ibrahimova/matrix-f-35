public class BankAccount {
    int accountNumber;
    int balance;
    static int COUNT;

    BankAccount(int accountNumber, int balance) {
        this.balance = (balance < 0) ? 0 : balance;  //if ile yaza bilmedim
        this.accountNumber = accountNumber;
        COUNT++;
    }

    BankAccount() {
        COUNT++;
    }

    public String toString() { //?
        return "Hesab nomresi: " + accountNumber + " " + "Balans: " + balance;
    }

    double deposit() {
        return this.balance * ((double) 16 / 100) * ((double) 182 / 365);

    }

    double withdraw(double amount) {
        return this.balance - amount;

    }

    static void printOrderCount() {
        System.out.println("obyekt sayi: " + COUNT);
    }
}
