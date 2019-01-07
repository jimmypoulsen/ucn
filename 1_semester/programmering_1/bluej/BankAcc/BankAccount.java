
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private String name;
    private float balance;
    
    public BankAccount(String name) {
        this.name = name;
    }
    
    public BankAccount(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }
    
    public String toString() {
        return "Name: " + this.name + "\nBalance: " + this.balance + "$";
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public float getBalance() {
        return this.balance;
    }
    
    public void deposit(float amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println("New balance: " + this.balance + "$");
        } else {
            System.out.println("You need to deposit a positive amount...");
        }
    }
    
    public void withdraw(float amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
            System.out.println("You successfully withdrawed: " + amount + "$\nYour balance is now: " + this.balance + "$");
        } else {
            System.out.println("Insufficient funds... You need " + (amount - this.balance) + "$ more..");
        }
    }
}
