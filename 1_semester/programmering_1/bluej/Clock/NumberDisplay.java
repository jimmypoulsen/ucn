
/**
 * Write a description of class NumberDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    private int value;
    private int limit;
    
    public NumberDisplay(int limit, int value) {
        this.limit = limit;
        this.value = value;
    }
    
    public void increment() {
        this.value = (this.value + 1) % this.limit;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public String getDisplayValue() {
        if(this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }
}
