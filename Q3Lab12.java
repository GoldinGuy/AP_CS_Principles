import java.util.Scanner;

public class Q3Lab12 {
	
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		double sum=0, avg=0, count=0;
		
		do {
			System.out.println("\nEnter Score: ");
			double grade=s.nextDouble();
			
			if(grade==-1) {break;}
			
			sum += grade;
			avg += grade;
			count+=1;
		

		}  while (true);

		avg /= count;
		System.out.println("Sum of all grades: " + sum);
		System.out.println("Average of all grades: " + avg);
		
	}

}
