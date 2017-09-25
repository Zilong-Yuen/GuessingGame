import java.util.Scanner;
import java.util.InputMismatchException;
public class GuessingGame 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String s = input.next();
		System.out.println("Nice to meet you " + s + ".");
		int Guess = 0;
		int age = (int)(Math.random() * 10 + 1);
		while(Guess != age)
		{
			boolean isNumber= false;
			while(!isNumber)
			{
				try
				{
					System.out.println("Try and guess my age!");
					int x = input.nextInt();
					Guess = x;
					isNumber = true; 
				}
				catch(InputMismatchException e)
				{
					System.out.println("Try and guess my age!");
				}
			}
		}
		System.out.println("Great job " + s + "!");
	}
}
