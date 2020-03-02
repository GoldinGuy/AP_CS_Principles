import java.text.DecimalFormat;
import java.util.Scanner;


public class Q3Lab9 {


	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		int test=-1;
		
		
		while (test <0 || test >100)
		{
		System.out.println("\nEnter Score: ");
		test=input.nextInt();
		
		if (test < 0 || test > 100)
		{
			System.out.print("\nError. Please Input A Valid Grade.");
		}
		
		}
		computeGrade(test);
		
		
	} // end main
	

	
	public static void computeGrade(int test)
	{
		char prefix = 'A';
		
		
		if (test >= 90 && test <= 100)
		{
			prefix = 'A';
		}
		else if (test >= 80 && test <= 89)
		{
			prefix = 'B';
		}
		else if (test >= 70 && test <= 79)
		{
			prefix = 'C';
		}
		else if (test >= 60 && test <= 69)
		{
			prefix = 'D';
		}
		else if (test >= 0 && test <= 59)
		{
			prefix = 'F';
		}
		
		System.out.print("\nComputed Grade Is " + prefix);
		
	}	
	
} // end class