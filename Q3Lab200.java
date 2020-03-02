
	import java.util.Scanner;
	import java.util.ArrayList;

	public class Q3Lab200 {

		ArrayList<Double> gr = new ArrayList<Double>();
		public static Scanner s = new Scanner(System.in);

		public static void main(String[] args) {
			
			double sum=0, avg=0, grade=0;
			
			do {
				System.out.println("\nEnter Score: ");
				double value=s.nextDouble();
				
				if(score==-1)	{break;}
				gr.add(value);
				
				for (grade : gr) {
					sum +=grade;
				}
			
			}  while (true);

			System.out.println("Sum of all grades: " + avg);
			avg = avg/gr;
			System.out.println("Average of all grades: " + avg);
			
		}

	}
