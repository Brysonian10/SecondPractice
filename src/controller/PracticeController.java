package controller;

import java.util.Scanner;

public class PracticeController 
{
	
	public void start()
	{
		
		//moreInput();
		
		//System.out.println("This is pretty neat");
		moreInputScanners();
		
		//questions();
		
	}
	
	private void questions()
	{
		System.out.print("What is your favorite color");
		Scanner inputScanner = new Scanner(System.in);
	
		String answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.println("But why tho");
		answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.println("that doesn't make much sense, explain it again");
		answer = inputScanner.nextLine();
		System.out.println(answer);
		
		inputScanner.close();
	}

	private void moreInput()


	{
		Scanner anotherInputScanner;
		
		anotherInputScanner = new Scanner(System.in);
		
		System.out.println("What is the meaning of Life, the universe and everything?");
		int answer = anotherInputScanner.nextInt();
		
		System.out.println("You typed: " + answer);
		anotherInputScanner.nextLine(); //Used to consume the enter key press, ignoring the returned String value.
		System.out.println("Words - why the error? Guess.");
		String secondResponse =  anotherInputScanner.nextLine();
		System.out.println(secondResponse);
		
		//double holds real numbers AKA numbers with a decimal point!
		double magicNumber;
		
		System.out.println("Type in your favorite fractional number AKA use a decimal");
		magicNumber = anotherInputScanner.nextDouble();
		
		System.out.println(magicNumber);
		
//		anotherInputScanner.close();
		
	}
	private void moreInputScanners()
	{
		Scanner moreInputScanners;
		
		moreInputScanners = new Scanner(System.in);
		
		System.out.println("How many pages of homework still needs to be completed?");
		int answer = moreInputScanners.nextInt();
		System.out.println(answer);
		if (answer > 0 ) {
			System.out.println("Why haven't you finished your homework yet?");
		String secondResponse = moreInputScanners.nextLine();
		System.out.println(secondResponse);
		} else {
			System.out.println("Good job for getting your homework done!");
		}
		
		
		double randomNumber;
		
		System.out.println("give me a random number with a decimal point!");
		randomNumber = moreInputScanners.nextDouble();
		
		System.out.println(randomNumber);
	}

	
	public boolean validInt(String example)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(example);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Type in a valid int value human!");
		}
		
		
		return isValid;
		
	}
	
	public boolean validDouble(String example)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Only floating point values allowed for input");
		}
		
		return isValid;
	}
	
}