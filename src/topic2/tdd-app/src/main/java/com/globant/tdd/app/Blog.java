/**
 * Blog class is an entity that the software operates.
 * it contains a list of all entries that are posted on it.
 *
 * @author Felipe Pérez
 * @version 1.0
 */
package com.globant.tdd.app;

public class Blog {
    private EntryList mostRecentEntries=new EntryList();

    /**
     * @param en The entry that will be posted.
     */
    public void postEntry(Entry en){
        mostRecentEntries.add(en);
    }

    /**
     * @param index The index that refers to the entry that will be deleted
     */
    public void deleteEntry(int index){
        mostRecentEntries.remove(index);
    }

    /**
     * @return String variable that contains all the information of the last 10 entries
     */
    public String getLatestEntries(){
        return mostRecentEntries.getLatestEntries();
    }

    /**
     * @return A list of entries.
     */
    public EntryList getMostRecentEntries(){
        return mostRecentEntries;
    }


}
