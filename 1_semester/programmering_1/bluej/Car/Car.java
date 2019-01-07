
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    public String brand;
    public String model;
    public Integer year;
    
    public void setBrand(String value) {
        this.brand = value;
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public void setModel(String value) {
        this.model = value;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public void setYear(Integer value) {
        this.year = value;
    }
    
    public Integer getYear() {
        return this.year;
    }
    
    public Car(String brand, String model, Integer year) {
        this.setBrand(brand);
        this.setModel(model);
        this.setYear(year);
    }
    
    public String toString() {
        return "Brand: " + this.getBrand() + "\nModel: " + this.getModel() + "\nYear: " + this.getYear();
    }
    
    // the car is having a birthday blast
    public void age() {
        this.setYear(this.year+=1);
    }
}
