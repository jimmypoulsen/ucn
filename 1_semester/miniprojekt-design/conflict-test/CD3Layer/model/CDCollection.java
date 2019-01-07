package model;

import java.util.ArrayList;    
import java.util.Iterator;
/**
 * Collection of CDs
 * 
 * @author FEN, KBH, MARS, KBHA, KNOL, MHI 
 * @version 2003.10.27, 2005.02.23, 2005.09.20, 2009.09.29, 2012.04.10, 2015.11.01, 2018.10.19
 */

public class CDCollection {
    
    private ArrayList<CD> myCDCollection;
    private static CDCollection instance;
    
    
    /**
     * Constructor for objects of class CDCollection
     * implemented as a singelton
     */
    private CDCollection() {
        myCDCollection = new ArrayList<>();

    }
    
    // Singleton 
    public static CDCollection getInstance() {
        if(instance == null) {
            instance = new CDCollection();
        }
        return instance;
    }

    public void addCD(CD cd) {
        myCDCollection.add(cd);
    }
    
    //print all cd's in the collection
    public void printCD() {
        System.out.println("!!!List of CD titles");
        for (CD cd : myCDCollection) {
            System.out.println("!!!"+cd.getTitle());
        }

    }
    
    //opgave 10
    public void removeByTitle(String title) {
        CD cd = findByTitle(title); 
        if(cd != null) {
            boolean ok = myCDCollection.remove(cd); //remove an object
            if(ok) {
                System.out.println("!!!Cd with title " + title + "has been removed");
            }
            else {
                System.out.println("!!!Removal failed");
            }
        }
        else { 
            System.out.println("!!!No CD called" + title + " within the collection");
        }
    }

    public CD findByTitle(String title) {
        CD currentCd = null;      //initalisering
        CD res = null;
        int index = 0;     //initialisering
        boolean found = false; //initialisering
        int size = myCDCollection.size();
        while(index < size && !found) {//as long as there are more unvisited elements and we din't find the element  
            currentCd = myCDCollection.get(index); //get the next element
            if(currentCd.getTitle().equals(title)) {// is it the rigth one?
                found = true;
            }
            else {
                index++;  //remove from unvisited
            }
        } // end while
        if (found) {
            res = myCDCollection.get(index);
        }
        return res;

    }
    
  
    

}
