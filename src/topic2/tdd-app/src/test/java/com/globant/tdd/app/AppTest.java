package com.globant.tdd.app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


/**
 * Unit test for blog App.
 */
public class AppTest 
{
    private Blog blog;
    private Entry e1,e2,e3,e4;
    @Before
    public void setUp(){
        e1=new Entry();
        e1.setAuthor("Gonzalo Alvarez");
        e1.setYear();
        e1.setMonth();
        e1.setContent("Amazing facts about vipers!");

        e2=new Entry();
        e2.setAuthor("Rosalita Calico");
        e2.setYear();
        e2.setMonth();
        e2.setContent("Why you shouldn't let your cat do this thing!");

        e3=new Entry();
        e3.setAuthor("Chad Twinkles");
        e3.setYear();
        e3.setMonth();
        e3.setContent("How i made ten thousand dollars by gambling");

        e4=new Entry();
        e4.setAuthor("Erika Artworks");
        e4.setYear();
        e4.setMonth();
        e4.setContent("The problem: Season two is not available at my patreon!");

        blog=new Blog();
    }

    @Test
    public void canCreateAnEntry()
    {
        Entry entry=new Entry();
        entry.setAuthor("Carlos Gomez");
        entry.setContent("Welcome to my blog.");
        entry.setMonth();
        entry.setYear();
        //Asserting that the entry has been created as intented.
        assertEquals(entry.showEntry(), "Welcome to my blog.\nAuthor: Carlos Gomez\nDate: dec, 2019");
    }

    @Test
    public void canCreateABlog(){
        Blog blog=new Blog();
        blog.postEntry(e1);
        blog.postEntry(e2);
        blog.getLatestEntries();
        blog.deleteEntry(1);
        blog.postEntry(e3);
        blog.getLatestEntries();
        String Entries=e1.showEntry()+"\n"+e3.showEntry()+"\n";
        //Asserting that the blog has the entries e1 and e3, and e2 was deleted.
        assertEquals(blog.getLatestEntries(),Entries);
    }

    @Test
    public void whenListReachesTenEntriesThenTheFirstOneIsRemoved(){
        blog.postEntry(e1);
        blog.postEntry(e2);
        blog.postEntry(e3);
        blog.postEntry(e4);
        blog.postEntry(e1);
        blog.postEntry(e2);
        blog.postEntry(e3);
        blog.postEntry(e4);
        blog.postEntry(e1);
        blog.postEntry(e2);
        blog.postEntry(e3);
        EntryList mostRecentEntries=blog.getMostRecentEntries();

        //The entries order should be, 2,3,4,1,2,3,4,1,2,3
        //Asserting that the first entry on the list, is the second one published, since the first one got deleted.
        assertEquals(mostRecentEntries.getRecentEntry(0),e2);
    }




}
