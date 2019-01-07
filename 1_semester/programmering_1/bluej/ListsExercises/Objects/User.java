import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Car> cars = new ArrayList<>();
    
    public User(String name, Car car) {
        this.name = name;
        this.cars.add(car);
    }
    
    public void addCar(Car car) {
        cars.add(car);
        System.out.println(this.name + " now has " + carsCount() + " cars");
    }
    
    public int carsCount() {
        return cars.size();
    }
    
    public String getCars() {
        String res = "----- Cars -----\n";
        for (Car car : cars) {
            res += car + "\n";
        }
        
        return res;
    }
    
    public String toString() {
        return "Name: " + this.name + "\n" + getCars();
    }
}