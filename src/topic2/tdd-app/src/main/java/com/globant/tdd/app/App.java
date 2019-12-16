/**
 * App class serves as an application to run the blog creation software.
 *
 * @author Felipe Pérez
 * @version 1.0
 */
package com.globant.tdd.app;
import java.util.Scanner;
public class App
{
    public static void main( String[] args ) {
        Blog myBlog=new Blog();
        String answer="";
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("Create an entry:");
            System.out.println("Content: ");
            String content=sc.nextLine();
            System.out.println("Author: ");
            String author=sc.nextLine();
            Entry entry=new Entry();
            entry.setContent(content);
            entry.setMonth();
            entry.setYear();
            entry.setAuthor(author);
            myBlog.postEntry(entry);
            do{
                System.out.println("Would you like to add another entry? yes/no");
                answer=sc.next();
                if(!("no".equalsIgnoreCase(answer)) && !("yes".equalsIgnoreCase(answer))){
                    System.out.println("Invalid answer.");
                }else{
                    break;
                }
            }while (true);
        }while ("yes".equalsIgnoreCase(answer));
        System.out.println("Showing the last 10 entries...");
        System.out.println(myBlog.getLatestEntries());
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("Would you like to remove an entry? yes/no");
            answer=sc.next();
            if(!("no".equalsIgnoreCase(answer)) && !("yes".equalsIgnoreCase(answer))){
                System.out.println("Invalid answer.");
            }else{
                break;
            }
        }while (true);
        if ("yes".equalsIgnoreCase(answer)){
            Scanner sc=new Scanner(System.in);
            System.out.println("Insert the number of the post that you want to delete: (1 to "+myBlog.getMostRecentEntries().getRecentList().size()+")");
            int postDelete=sc.nextInt();
            myBlog.deleteEntry(postDelete-1);
        }
        System.out.println("Showing the last 10 entries...");
        System.out.println(myBlog.getLatestEntries());
    }
}
