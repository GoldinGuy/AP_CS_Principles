
import java.util.Scanner;

	public class Income_Calc  
	{
		
			public static void main(String[] args)
			{
		
				int i=0, totalHours=0;
				double totalMoney=0;
				
				System.out.println("\nWelcome To The Income Calculator");
				
				int hours[] = new int[7];
				double money[] = new double[7];
				hours2(hours);
				

				for (i=0; i<hours.length; i++)
				{
					money[i]=hours[i]*10;			
				}
				
				
				for (i=0; i<hours.length; i++)
				{
					if(hours[i]>8)
					{
						money[i]= money[i] + (hours[i]-8)*1.5;
					}
				}
		
				for (int j: hours)
				{
					totalHours = totalHours + j;
				}
				
				
				if (totalHours > 40)
				{
					totalHours-=40;
					totalMoney = totalMoney + 2.5*totalHours;
				}
				
				
				if(hours[0] > 0)
				{
					money[0] *= 1.5; 
				}
				
				if(hours[6] > 0)
				{
					money[6] *= 1.25; 
				}
				
				
				for (double k: money)
				{
					totalMoney = totalMoney + k;
				}
				
				totalMoney *= 100;
				Math.round(totalMoney);
				totalMoney /= 100;
				
				System.out.printf("\n%s%6.2f%s" , "You Made $" , totalMoney , " This Week! ");
				
			} // end of main	
				
				
				
			public static int [] hours2 (int[]hours)
			{
				Scanner input = new Scanner(System.in);
				int i=0;
				String date=("");
				
					System.out.println("\nEnter Number Of Hours For The Following Days: ");
				for (i=0; i<hours.length; i++)
				{
					if(i==1)
					{
						date=("Monday:");
					}
					
					else if(i==2)
					{
						date=("Tuesday:");
					}
					
					else if(i==3)
					{
						date=("Wednesday:");
					}
					
					else if(i==4)
					{
						date=("Thursday:");
					}
					
					else if(i==5)
					{
						date=("Friday:");
					}
					
					else if(i==6)
					{
						date=("Saturday:");
					}
					
					else if(i==0)
					{
						date=("Sunday:");
					}
				
					System.out.println(date);
					hours[i]=input.nextInt();
				}
				
				
					
				/* 			for (int z=0; z<hours.length; z++)
				{
					System.out.println("Enter Number Of Hours For The Following Days: ");
					hours[z]=input.nextInt();
				}
				
				
				for (i=0; i<hours.length; i++)
				{
					System.out.println(hours[i]);
				}
				
				*/
				
				return hours;
				
			}
				
				// end of class
			}


}
