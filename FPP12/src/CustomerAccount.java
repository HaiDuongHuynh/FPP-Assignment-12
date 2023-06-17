class MinimumBalanceException extends Exception{
    public MinimumBalanceException(String message){
        super(message);
    }
}

class InvalidBalanceException extends Exception{
    public InvalidBalanceException(String message){
        super(message);
    }
}

class WarningException extends Exception{
    public WarningException(String message){
        super(message);
    }
}
public class CustomerAccount {
    private String Cus_name;
    private int Acc_No;
    private double Balance;

    public CustomerAccount(String Cus_name, int Acc_No, double Balance){
        this.Cus_name = Cus_name;
        this.Acc_No = Acc_No;
        this.Balance = Balance;
    }
    public boolean deposit(double amount) throws MinimumBalanceException {
        if(amount < 0){
            throw new MinimumBalanceException("Cannot deposit under 0$");
           // return false;
        }
        Balance += amount;
        return true;
    }

    public boolean withdraw(double amount) throws MinimumBalanceException, InvalidBalanceException, WarningException {
        if(amount <0){
            throw new MinimumBalanceException("The minimum withdraw is 0.01$");
            //return false;
        }
        if(amount>Balance){
            throw new InvalidBalanceException("Withdraw amount more than balance");
        }
        if(Balance - amount <100){
            throw new WarningException("Balance will go below $100");
        }
        Balance -= amount;
        return true;
    }

    public double getBalance(){return Balance;}
}
