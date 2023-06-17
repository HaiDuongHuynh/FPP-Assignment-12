public class Main2 {
    public static void main(String[] args) {
        CustomerAccount account = new CustomerAccount("Duong Huynh", 123456789, 500);
        try {
            account.deposit(200);
            //account.deposit(-1); //Minimum Balance Exception called
            System.out.println("Balance after deposit: $" + account.getBalance());

            account.withdraw(400);
            System.out.println("Balance after withdrawal: $" + account.getBalance());

            account.withdraw(500); //Invalid Balance Exception called
            //account.withdraw(290);// Warning Balance Exception called
        } catch (MinimumBalanceException e) {
            System.out.println("Task cannot be done: " + e.getMessage());
        } catch (WarningException e) {
            System.out.println("Warning: " + e.getMessage());
        } catch (InvalidBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}