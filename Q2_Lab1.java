import java.util.Scanner;

	class  Q2_Lab1
	{
		
		static int z=0;
		
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			int x=0;
			int y=0;
			
			System.out.println("Enter a number: ");
			x=input.nextInt();
			
			System.out.println("Enter a number: ");
			y=input.nextInt();
			
			sum(x,y);
			difference(x,y);
			product(x,y);
			quotient(x,y);
			average(x,y);
			modulus(x,y);

		} // ends main

		static void sum(int x,int y)
		{
			z = x + y;
			
			System.out.println("The Sum Of The Two Numbers Is " + z);
		
		} // ends 
		
		static void difference(int x,int y)
		{
			z = x - y;
			
			System.out.println("The Difference Of The Two Numbers Is " + z);
		
		} // ends 
		
		
		static void product (int x,int y)
		{
			z = x * y;
			
			System.out.println("The Product Of The Two Numbers Is " + z);
		
		} // ends 
		
		static void quotient (int x,int y)
		{
			z = x / y;
			
			System.out.println("The Quotient Of The Two Numbers Is " + z);
		
		} // ends 
		
		static void average (int x,int y)
		{
			z = (x + y)/ 2;
			
			System.out.println("The Average Of The Two Numbers Is " + z);
		
		} // ends 
		
		static void modulus(int x,int y)
		{
			z = x % y;
			
			System.out.println("The Modulus Of The Two Numbers Is " + z);
		
		} // ends 


	} // ends class

