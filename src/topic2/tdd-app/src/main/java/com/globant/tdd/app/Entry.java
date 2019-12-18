/**
 * Entry class is an entity used to simulate an entry on a blog.
 *
 * @author Felipe Pérez
 * @version 1.0
 */package com.globant.tdd.app;

public class Entry {
    private String content;
    private String author;
    private String month;
    private int year;

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setMonth() {
        this.month = "dec";
    }

    public void setYear() {
        this.year = 2019;
    }

    /**
     * @return String object with the content, author, month and year of the entry.
     */
    public String showEntry(){
        return content+"\nAuthor: "+author+"\nDate: "+month+", "+year;
    }


}
