package helpers;

public class Text {
    private static Text instance = null;
    
    private Text() {
        // nothing needs to be initialized
        // this method is therefore empty
    }
    
    public static Text getInstance() {
        if(instance == null)
            instance = new Text();
        return instance;
    }
    
    public String stringify(String s) {
        return "Stringified: " + s;
    }
}