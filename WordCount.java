package text_counters;
import java.io.FileReader;
import java.io.BufferedReader;

// counts the number of words within a specified text file
public class WordCount 
{
    private static BufferedReader b;
	public static void main (String args[]) throws Exception 
	{
       System.out.println ("Total number of words in this file is: ");       
       FileReader fr = new FileReader ("example.txt"); // read in from text file     
       b = new BufferedReader (fr);     
       
       String line = b.readLine(); // read in lines from BufferedReader as a string
       int count = 0; // initial word count value
       
       while (line != null) 
       {
          String []parts = line.split(" "); // count spaces as a line split
          for (int i = 0; i < parts.length; i++) 
        {
			count++; // for every word between spaces, increase word count by one
		}
          line = b.readLine();
       }    
       System.out.print(count); // print result
    }
}