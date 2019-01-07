public class Member
{
  private String name;
  private String phone;
  private String email;
  private Dog dog;

  public Member(String name, String phone, String email) {
    this.name = name;
    this.phone = phone;
    this.email = email;
  }

  public void setDog(Dog dog) {
    this.dog = dog;
  }

  public String toString() {
    return "Name: " + this.name + "\nPhone: " + this.phone + "\nE-mail: " + this.email + "\nDog\n" + this.dog;
  }
  
  public boolean hasDog() {
    return this.dog != null;
  }
}