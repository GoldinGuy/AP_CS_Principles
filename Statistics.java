import java.util.Scanner;


public class Statistics 
{
	
	static double data[]; 
	static int numElements;
	
	
	public Statistics()
	{
		double avg=0;
		
		for(int i=0; i<data.length; i++)
		{
		 avg = avg + data[i]; 
		}
		
		avg = avg / 2;
		
		System.out.println("\nThe Average Value Of All The Elements In The Array Is " + avg);
		
	} // ends 
	
	
	
	
	
	
	public void main(String[] args)
	{
		Statistics stat = new Statistics(size);
		stat.runMenu();
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
	

	void getAverage()
	{
		double avg=0;
		
		for(int i=0; i<data.length; i++)
		{
		 avg = avg + data[i]; 
		}
		
		avg = avg / 2;
		
		System.out.println("\nThe Average Value Of All The Elements In The Array Is " + avg);
		
	} // ends 
	
	
	 void runMenu()
	{
		Scanner input = new Scanner(System.in);
		int y;
		
		System.out.println("\n1. ADD AN ELEMENT \n2. AVERAGE \n3. HIGHEST \n4. LOWEST \n5. DISPLAY CONTENTS OF ARRAY \n6. QUIT");
		y=input.nextInt();
		
		input.close();
		
	} // ends 
	

}
