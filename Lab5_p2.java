import java.util.Scanner;

public class Lab5_p2
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double i = 0,m = 0;
			
		System.out.println("\nEnter A Value In Inches: ");
		i=input.nextDouble();

		m=(i)*(0.0254);
		
		System.out.println("\n" + i + " Inch(es) Is Equal To " + m + " Meter(s).");
		
		
	}

}
