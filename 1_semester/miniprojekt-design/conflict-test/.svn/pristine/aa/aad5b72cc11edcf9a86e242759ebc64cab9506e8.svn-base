package control;

import model.*;
/**
 * Write a description of class CDTrackController here.
 * 
 * @author KNOL, MHI 
 * @version 2018.10.19
 */
public class CDTrackController {

    private CDCollection cdContainer;

    /**
     * Constructor for objects of class CDTrackController
     */
    public CDTrackController() {
        // initialise instance variables
        cdContainer = CDCollection.getInstance();

    }
    
    public CD findCDByTitle(String title) {
        return cdContainer.findByTitle(title);
    }

    public void createCD(int nr, String title) {
        CD cdObj = new CD(nr, title);
        cdContainer.addCD(cdObj);
    }

    public boolean addTrack(String cdTitle, String track, int length) {
        boolean res = false;
        CD cdObj = cdContainer.findByTitle(cdTitle);
        if(cdObj != null) {
            cdObj.addTrack(track, length);
            res = true;
        }
        return res;
    }
}
