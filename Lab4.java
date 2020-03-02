import java.util.Scanner;

public class Lab4 
{


	public static void main(String[] args) 
	{

			Scanner input = new Scanner(System.in);
			
			double result[] = new double[6];
			double x = 0,y = 0;
			String name = (""), pname = ("");
			
			System.out.println("Enter Your Name: ");
			pname=input.next();
			pname=UpperCase(pname);
			
			System.out.println("Enter A Number: ");
			x=input.nextDouble();
			
			System.out.println("Enter A Second Number: ");
			y=input.nextDouble();
			
			
			result[0] = x + y;
			result[1] = x - y;
			result[2] = x / y;
			result[3] = (x + y) / 2;
			result[4] = x * y;
			result[5] = x % y;
			
			System.out.println("Your Name Is " + pname);
	
			
				for (int i=0; i<result.length; i++)
				{
				
					if (i==0)
					{
						name = ("Sum");
					}
					
					if (i==1)
					{
						name = ("Difference");
					}
					
					if (i==2)
					{
						name = ("Quotient");
					}
					
					if (i==3)
					{
						name = ("Average");
					}
					
					if (i==4)
					{
						name = ("Product");
					}
					
					if (i==5)
					{
						name = ("Modulus");
					}
				
				System.out.println("The " + name + " Of The Two Numbers Is: " + result[i]);
				
				} // end of for
	}
	




public static String UpperCase(String pname)
{
	String whatever=("");
	
	for (int i = 0; i < pname.length(); i++)
	{
		char c = Character.toUpperCase(pname.charAt(i));
		
		whatever += c;
		
	}
	
	return whatever;
}

}

