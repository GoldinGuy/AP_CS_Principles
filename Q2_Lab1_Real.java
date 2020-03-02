import java.util.Scanner;

	class  Q2_Lab1_Real
	{
		
		public static void main(String[] args)
		{
			sum();
			difference();
			product();
			quotient();
			average();
			modulus();

		} // ends main
		

		static void sum()
		{
			Scanner input = new Scanner(System.in);
			int x, y, z;
			
			System.out.println("\nEnter a number: ");
			x=input.nextInt();
			
			System.out.println("Enter a number: ");
			y=input.nextInt();
			
			z = x + y;
			
			System.out.println("The Sum Of The Two Numbers Is " + z);
		
		} // ends 
		
		
		static void difference()
		{
			Scanner input = new Scanner(System.in);
			int x, y, z;
			
			System.out.println("\nEnter a number: ");
			x=input.nextInt();
			
			System.out.println("Enter a number: ");
			y=input.nextInt();
			
			z = x - y;
			
			System.out.println("The Difference Of The Two Numbers Is " + z);
		
		} // ends 
		
		
		static void product()
		{
			Scanner input = new Scanner(System.in);
			int x, y, z;
			
			System.out.println("\nEnter a number: ");
			x=input.nextInt();
			
			System.out.println("Enter a number: ");
			y=input.nextInt();
			
			z = x * y;
			
			
			System.out.println("The Product Of The Two Numbers Is " + z);
		
		} // ends 
		
		static void quotient()
		{
			Scanner input = new Scanner(System.in);
			int x, y, z;
			
			System.out.println("\nEnter a number: ");
			x=input.nextInt();
			
			System.out.println("Enter a number: ");
			y=input.nextInt();
			
			z = x / y;
			
			System.out.println("The Quotient Of The Two Numbers Is " + z);
		
		} // ends 
		
		static void average()
		{
			Scanner input = new Scanner(System.in);
			int x, y, z;
			
			System.out.println("\nEnter a number: ");
			x=input.nextInt();
			
			System.out.println("Enter a number: ");
			y=input.nextInt();
			
			z = (x + y) / 2;
			
			System.out.println("The Average Of The Two Numbers Is " + z);
		
		} // ends 
		
		
		static void modulus()
		{
			Scanner input = new Scanner(System.in);
			int x, y, z;
			
			System.out.println("\nEnter a number: ");
			x=input.nextInt();
			
			System.out.println("Enter a number: ");
			y=input.nextInt();
			
			z = x % y;
			
			System.out.println("The Modulus Of The Two Numbers Is " + z);
		
		} // ends 
		
	

	} // ends class

