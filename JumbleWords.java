package text_counters;

// program that jumbles up a string of words
public class JumbleWords 
{
	public static void Jumble(String s)
	{
		if(s.length() < 3)
		{
			System.out.print(s); // print string as is if shorter than 3 letters
		}
		else // swap letters in string around
		{
			char [] letters = s.toCharArray();
			
			for(int i = 1; i < letters.length - 3; i++)
			{
				int swapIndex = (int)(Math.random() * (s.length()-3) + 1);
				if (swapIndex != -1)
				{
					swap(letters, i, swapIndex);
				}
			}
			
			for(char letter : letters)
			{
				System.out.print(letter);
			}
			System.out.println(); // print result
		}
	}
	public static void swap(char [] c, int i, int j) // method for swapping letters
	{
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
	
	public static void main (String [] args)
	{
		String words = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		Jumble(words); // jumble the above string
	}
}
