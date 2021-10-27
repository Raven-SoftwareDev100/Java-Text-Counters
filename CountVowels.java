package text_counters;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

// count the number of vowels in a specific text file
public class CountVowels 
{
	private static BufferedReader b;
	public static void main (String args[]) throws Exception 
	{
		// read/scan in from text file
		File f = new File("example.txt");
		Scanner sc = new Scanner(f);
	    FileReader fr = new FileReader ("example.txt");        
	    b = new BufferedReader (fr);     
	       
	    String line = b.readLine ();
	       
	    double count = 241.0;
		while (line != null) 
	       {
	          String []parts = line.split(" ");
	          for (int i = 0; i < parts.length; i++) 
	        {
				count ++;
			}
	          line = b.readLine();
	       }  
	       
		String file = "";

		while(sc.hasNext())
		{
			file += sc.next() + " ";
		}
		sc.close();
		
		char[] c = file.toCharArray();
		file = file.toLowerCase();
		int vc = 0; // sets initial vowel count value
		for (char v : c)
		{
			if(v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')
				vc++; // if a vowel is found, add one to total vowel count
		}
		System.out.println("Total number of vowels in this file is: " + vc); // print result
		
		double avg = vc / count; // get average
		System.out.println("Average number of vowels per word is: " + Math.round(avg)); // round up and print result
    }
}