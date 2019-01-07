import java.util.ArrayList;

class Order {
  private int id;
  private int price;
  private String name;

  public Order(int id, int price, String name) {
    this.id = id;
    this.price = price;
    this.name = name;
  }

  public int getId() {
    return this.id;
  }

  public int getPrice() {
    return this.price;
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    return "\nID: " + this.id + "\nPrice: " + this.price + "\nName: " + this.name;
  }
}