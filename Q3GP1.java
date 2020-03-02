import java.util.Scanner;
import java.text.DecimalFormat;

public class Q3GP1 {
	
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		DecimalFormat myformat = new DecimalFormat ("#.00");
		double sum=0, avg=0, grade=0;
		
		System.out.println("\nHow many grades do you wish to enter? ");
		int count=s.nextInt();
		
		for (int i=0; i<count; i++){
			System.out.println("\nEnter a grade: ");
			grade=s.nextDouble();
			
			if(grade>=0)
			{
				sum += grade;
				avg += grade;
			}
			else
			{
				System.out.println("\n" + grade + " is not an acceptable grade");
				i-=1;
			}

		} 

		avg /= count;
		System.out.println("The total is: " + sum);
		System.out.println("The average is: " + myformat.format(avg));
		
	}

}
