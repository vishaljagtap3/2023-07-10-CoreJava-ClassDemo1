public class BankAccount {
    private int accNo;
    private String name;
    private int bal;

    //user defined default constructor
    public BankAccount() {
        System.out.println("BankAccount()");
        accNo = 1;
        name = "Not Available";
        bal = 100;
    }

    //parameterized constructor
    public BankAccount(int aNo, String nm, int amt) {
        System.out.println("BankAccount(int, String, int)");
        accNo = aNo;
        name = nm;
        bal = amt;
    }

    public boolean deposit(int amt) {
        if(amt <= 0) {
            return false;
        }
        bal = bal + amt;
        return true;
    }
    public int withdraw(int amt) {
        if(amt <= 0 || amt > bal) {
            return 0;
        }
        bal -= amt;
        return amt;
    }

    public void display() {
        System.out.println("Acc No = " + accNo + " name = " + name + " Bal = " + bal);
    }

    public void init(int aNo, String nm, int b) {
        accNo = aNo;
        name = nm;
        bal = b;
    }
}
