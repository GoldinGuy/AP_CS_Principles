import java.util.Scanner;


public class Statistics2 
{
	
	static double data[]; 
	static int numElements;
	
	
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		int x;
		
		System.out.println("\nInput Size of Array: ");
		x=input.nextInt();
		data = new double[x];
		
		runMenu();
		getAverage();
		
		/*
		addtoCollection();
		getAverage();
		getMin();
		getMax();
		getNumElements();
		display();
		*/
		
		runMenu();
		
		
	}
	

	static void getAverage()
	{
		double avg=0;
		
		for(int i=0; i<data.length; i++)
		{
		 avg = avg + data[i]; 
		}
		
		avg = avg / 2;
		
		System.out.println("\nThe Average Value Of All The Elements In The Array Is " + avg);
		
	} // ends 
	
	
	 static void runMenu()
	{
		Scanner input = new Scanner(System.in);
		int y;
		
		System.out.println("\n1. ADD AN ELEMENT \n2. AVERAGE \n3. HIGHEST \n4. LOWEST \n5. DISPLAY CONTENTS OF ARRAY \n6. QUIT");
		y=input.nextInt();
		
		input.close();
		
	} // ends 
	

}
