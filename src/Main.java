import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a = 1; 
		int b = 0; 
		int c = 0; 

		Scanner scnr = new Scanner(System.in);
		
		String input = scnr.nextLine(); 
		
		for (int i = 0; i < input.length(); i++)
		{
			if (input.charAt(i) == 'A')
			{
				int temp = a; 
				a = b; 
				b = temp; 
			}
			if (input.charAt(i) == 'B')
			{
				int temp = b; 
				b = c; 
				c = temp; 
			}
			if (input.charAt(i) == 'C')
			{
				int temp = a; 
				a = c; 
				c = temp; 
				
			}
			
			
		}
		
		if (a == 1)
		{
			System.out.println("1"); 
		}
		if (b == 1)
		{
			System.out.println("2"); 
		}
		if (c == 1)
		{
			System.out.println("3"); 
		}
	}

}
