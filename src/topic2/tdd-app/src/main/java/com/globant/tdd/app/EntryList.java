/**
 * EntryList class serves as a tool of the blog, to visualize and store blog entries.
 *
 * @author Felipe Pérez
 * @version 1.0
 */
package com.globant.tdd.app;

import java.util.ArrayList;
import java.util.List;

public class EntryList {
    private List<Entry> recentList =new ArrayList<Entry>();

    /**
     * Adds an entry to the list, if the list reaches 10 entries and attempts to add a new one
     * It will delete the first entry of the list.
     * @param entry The entry that will be added to the list.
     */
    public void add(Entry entry){
        if (recentList.size()==10){
            recentList.remove(0);
        }
        recentList.add(entry);
    }

    /**
     * Removes an entry from the list.
     * @param index The index of the entry that will be removed from the list.
     */
    public void remove(int index){
        if(index>10){
            System.out.println("The entry doesn't exist.");
            return;
        }
        recentList.remove(index);
    }

    public List<Entry> getRecentList(){
        return recentList;
    }

    /*
     * @return String object containing all the information of the last 10 entries.
     */
    public String getLatestEntries(){
        String latestEntries="";
        for (Entry entry: recentList){
            latestEntries+=(entry.showEntry()+"\n");
        }
        return latestEntries;
    }
    public Entry getRecentEntry(int index){
        Entry entry= recentList.get(index);
        return entry;
    }
}
