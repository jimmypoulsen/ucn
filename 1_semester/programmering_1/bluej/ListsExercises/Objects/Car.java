public class Car {
    private String brand;
    private String reg;
    
    public Car(String brand, String reg) {
        this.brand = brand;
        this.reg = reg;
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public String toString() {
        return "Brand: " + this.brand + "\nReg nr.: " + this.reg;
    }
}
