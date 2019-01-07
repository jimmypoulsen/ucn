package model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The CD class
 * 
 * @author FEN, KBH, KBH, MARS, KNOL, MHI
 * @version 2003.10.27, 2005.02.23, 2007.09.24, 2008.02.25, 2009.09.29, 2015.11.01, 2018.10.19
 */

public class CD {
    private int number;
    private String title;
    private ArrayList<Track> tracks;

    /**
     * Constructor for objects of class CD
     */
    public CD(int number, String title) {
        this.number= number;
        this.title= title;
        tracks= new ArrayList<Track>();
    }

    public int getNumber() {
        return number;
    }

    public int getTrackCount() {
        return tracks.size();
    }

    public String getTitle() {
        return title;
    }

    public void addTrack(String title, int length) {
        Track track = new Track(title, length);
        tracks.add(track);
    }

    public void addTrack(Track newTrack) {
        tracks.add(newTrack);
    }

    public ArrayList<Track> getTracks() {
        return new ArrayList<>(tracks);
    }
    
  
    public int totalPlaybackTime() {
        Iterator<Track> it= tracks.iterator();
        int totalTime= 0;
        while(it.hasNext()) {
            Track currentTrack = it.next();
            totalTime = totalTime + currentTrack.getLength();
        }
        return totalTime;
    }
    
   
}
