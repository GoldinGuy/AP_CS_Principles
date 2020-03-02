import java.util.Scanner;

public class Lab5_p1
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double f = 0,c = 0;
			
		System.out.println("\nEnter The Temperature In Degrees Fahrenheit: ");
		f=input.nextDouble();

		c=(f-32)*(0.5556);
		
		System.out.println("\n" + f + " Degrees Fahrenheit Is Equal To " + c + " Degrees Celsius.");
		
		
	}

}
