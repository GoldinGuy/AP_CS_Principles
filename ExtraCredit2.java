import java.util.Scanner;

public class ExtraCredit2
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int a=0, b=0, x=0, y=0, z=0;
		
		System.out.println("\nFind The GCD! ");
			
		System.out.println("\nEnter A Non-Negative Integer: ");
		a=input.nextInt();
		
		System.out.println("\nEnter A Second Non-Negative Integer: ");
		x=input.nextInt();

		
		for(int i=0; i<150; i++)
		{
			b = a/i;
			y = x/i;
			
			if(b==y)
			{
				if (i>z)
				{
					z=i;
				}
			}
		}
		
		
		System.out.println("\nThe GCD Is "  + z);
	} // end of main
	
} // end of class