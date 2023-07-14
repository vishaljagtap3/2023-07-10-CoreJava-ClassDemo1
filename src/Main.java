public class Main {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        //b1.init(101, "AA", 100);
        b1.display();

        BankAccount b2 = new BankAccount(202, "Vishal", 2000);
        b2.display();
        b2.init(202, "BB", 100);
        b2.init(202, "BB", 100);

        /*BankAccount b1, b2;

        b1 = new BankAccount();
        b1.init(101, "AA", 1000);
        b1.display();

        b2 = new BankAccount();
        b2.init(202, "BB", 2000);
        b2.display();

        System.out.println();
        BankAccount b3 = b1;
        b3.display();

        b3.init(101, "aa", 1100);
        b1.display();

        //b1.bal = -100000;
        b1.display();*/

    }
}
