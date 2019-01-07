
/**
 * Write a description of class ClockDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.text.*;

public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;
    
    public ClockDisplay() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        int hour = Integer.parseInt(dateFormat.format(date).substring(0, 2));
        int minute = Integer.parseInt(dateFormat.format(date).substring(3, 5));
        this.hours = new NumberDisplay(24, hour);
        this.minutes = new NumberDisplay(60, minute);
        updateDisplay();
    }
    
    public void timeTick() {
        minutes.increment();
        if(minutes.getValue() == 0) {
            hours.increment();
        }
        updateDisplay();
    }
    
    public void updateDisplay() {
        this.displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
        System.out.println(this);
    }
    
    public String toString() {
        return displayString;
    }
}
