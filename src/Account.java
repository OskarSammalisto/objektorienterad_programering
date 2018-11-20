public class Account {
    //private String client;
    private double balance;
    public static int nrAccounts = 0;

    public Account(){
        //this.client = "";
        this.balance = 0;
        nrAccounts++;
    }

    public Account(double startBalance){
        this.balance = startBalance;
        nrAccounts++;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double ammount){
        if(ammount > 0) {
            this.balance += ammount;
        }
    }

    public double  withdraw(double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
            return amount;
        }
        return 0;
    }

}
