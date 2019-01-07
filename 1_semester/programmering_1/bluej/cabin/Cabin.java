
/**
 * Write a description of class Cabin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cabin
{
    private int id;
    private String address;
    private int postalCode;
    private String city;
    private int buildinYear;
    private int noOfBeds;
    private float squareMeter;
    private int pricePrDay;
    private int noOfRooms;
    
    public Cabin(int id, String address, int postalCode, String city) {
        this.id = id;
        this.address = address;
        this.postalCode = postalCode; 
        this.city = city;
        this.buildinYear = 2018;
        this.noOfBeds = 0;
        this.squareMeter = 0;
        this.pricePrDay = 200;
        this.noOfRooms = 0;
    }
    
    public void setNoOfBeds(int noOfBeds) {
        this.noOfBeds = noOfBeds;
    }
    
    public void setBuildinYear(int buildinYear) {
        this.buildinYear = buildinYear;
    }
    
    public int calculatePrice(int numberOfPersons, int numberOfDays) {
        // if there isn't room for all the persons the rent pr day will increase
        if(numberOfPersons > this.noOfBeds) {
            this.pricePrDay += (50 * (numberOfPersons - this.noOfBeds));
        }

        if(this.buildinYear < 1950) {
            this.pricePrDay -= 200;
        }
        
        // if the number of days is bigger than 7 there will be a discount
        // of 100 in the total rent
        if(numberOfDays > 7) {
            return this.pricePrDay * numberOfDays - 100;
        }
        
        return this.pricePrDay * numberOfDays;
    }
}
