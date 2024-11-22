public class Bank {
    
   
    public double deposit(double amount, double balance) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
        System.out.println("New Balance: " + balance);
        return balance;
    }

    public double withdraw(double amount, double balance) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
            return 0;
        }
        System.out.println("New Balance: " + balance);
        return balance;
    }

   
    public static void main(String[] args) {
        Bank bank = new Bank();

        double balance = 1000.0; 
        System.out.println("Initial Balance: " + balance);

       
        balance = bank.deposit(500.0, balance); 

        
        balance = bank.withdraw(200.0, balance); 
        
        balance = bank.withdraw(1500.0, balance); 
    }
}
