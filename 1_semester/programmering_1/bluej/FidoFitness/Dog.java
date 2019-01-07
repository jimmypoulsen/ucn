public class Dog
{
  private String name;
  private int feePaid;
  
  public Dog(String name, int feePaid) {
    this.name = name;
    this.feePaid = feePaid;
  }

  public Dog() {
    
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setFeePaid(int feePaid) {
    this.feePaid = feePaid;
  }

  public String getName() {
    return this.name;
  }

  public int getFeePaid() {
    return this.feePaid;
  }

  public String toString() {
    return "Name: " + this.name + "\nFee Paid: " + this.feePaid;
  }
}