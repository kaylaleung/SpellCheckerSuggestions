/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayla
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;
import static java.util.Objects.hash;

public class SpellingChecker {
    
    String[] words = new String[90000];
    Map<Integer, String> hashtable = new HashMap<Integer, String>();

    public SpellingChecker(){

        Scanner fileIn = null;
        try{
            fileIn = new Scanner(
            new FileInputStream("src/words.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
            System.exit(0);
        }
        
        int i;
        while(fileIn.hasNext())
        {
            String w;
            w = fileIn.nextLine();
            i = hashCode(w);
            hashtable.put(i, w);
            
        }
/*
        for (Object o: hashtable.entrySet()) 
        {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
*/
    }
    
    public boolean search(String s)
    {
        Integer key = hashCode(s);
        if(hashtable.containsKey(key))
        {
            //System.out.println("Found");
            return true;
        }
        //System.out.println("Not Found");
        return false;
    }
    
    public boolean initialSearch(String s)
    {
        Integer key = hashCode(s);
        if(hashtable.containsKey(key))
        {
            System.out.println("*No mistakes found*");
            return true;
        }
        System.out.println("*Mistakes found*");
        return false;
    }
    
    public void checkPossible(String s, boolean found)
    {
        if(found == true)
        {
            return;
        }
        
        System.out.println("Possible Words:");

        int l = s.length() - 1;
 
        
        if(search(s.substring(1, l + 1))) //Remove one character to the begining
        {
            System.out.println(s.substring(1, l + 1));
        
        }
        
        if(search(s.substring(0, l ))) // Remove one character from the end
        {
            System.out.println(s.substring(0, l));
        
        }
        
        for(int c = 97; c < 123; c++)
        {
            char charC = (char) c;
            String stringCEnd = s + Character.toString(charC);
            
            if(search(stringCEnd)) //search character added at end
            {
                System.out.println(stringCEnd);
        
            }
            
            String stringCFront = Character.toString(charC) + s;

            if(search(stringCFront)) //search character added at front
            {
                System.out.println(stringCFront);
        
            }
            
        }
        
        for(int i = 0; i+2 < l+1; i++)
        {
            String exchanged = s.substring(0,i) + s.substring(i+1,i+2) + s.substring(i,i+1) + s.substring(i+2, l+1);
            if(search(exchanged)) //search string with exchanged adjecent characters
            {
                System.out.println(exchanged);
        
            }
        }
        
        
    }
    public Integer hashCode(String s)
    {
        s.toLowerCase();
        int h = hash(s);

        if(h < 0)
        {
            h = (-1) * h;
        }

        Integer hashInteger = new Integer(h);
        return hashInteger;
    }
}

