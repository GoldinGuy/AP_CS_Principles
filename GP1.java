import java.util.Scanner;

public class GP1 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int i;
		String date=("");
		
		int hours[] = new int[7];
		
		System.out.println("Enter Number Of Hours For The Following Days: ");
		for (i=0; i<hours.length; i++)
		{
			if(i==0)
			{
				date=("Monday:");
			}
			
			else if(i==1)
			{
				date=("Tuesday:");
			}
			
			else if(i==2)
			{
				date=("Wednesday:");
			}
			
			else if(i==3)
			{
				date=("Thursday:");
			}
			
			else if(i==4)
			{
				date=("Friday:");
			}
			
			else if(i==5)
			{
				date=("Saturday:");
			}
			
			else if(i==6)
			{
				date=("Sunday:");
			}
		
			System.out.println(date);
			hours[i]=input.nextInt();
		}
		
		for (i=0; i<hours.length; i++)
		{
			System.out.println(hours[i]);
		}

	}

}
