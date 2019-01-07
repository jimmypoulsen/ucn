
/**
 * Write a description of class Bank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private String name;
    private float balance;
    
    public String getName() {
        return this.name;
    }
    
    public float getBalance() {
        return this.balance;
    }
    
    public BankAccount(String name) {
        this.name = name;
    }
    
    public String toString() {
        return "Name: " + this.name + "\nBalance: " + this.balance;
    }
    
    public void withdraw(float amount) {
        if(this.balance > amount) {
            this.balance = this.balance - amount;
        }
    }
    
    public void deposit(float amount) {
        this.balance += amount;
    }
}
