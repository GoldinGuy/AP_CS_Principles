import java.util.Scanner;


public class Q3Lab11 {


	public static void main (String[] args){

		Scanner input = new Scanner(System.in);
		
		int start=0, end=0;
		
		System.out.println("\nEnter the starting number: ");
		start=input.nextInt();
		
		System.out.println("\nEnter the end number: ");
		end=input.nextInt();
		
		forLoop(start, end);
		
		System.out.println("\nEnter the starting number: ");
		start=input.nextInt();
		
		System.out.println("\nEnter the end number: ");
		end=input.nextInt();
		
		whileLoop(start,end);
		
		System.out.println("\nEnter the starting number: ");
		start=input.nextInt();
		
		System.out.println("\nEnter the end number: ");
		end=input.nextInt();
		
		doWhileLoop(start,end);
		
		
	}	
		
		public static void  forLoop(int start, int end){
			int num=0;
			
			for (int i=start; i<=end; i++)
			{
				num += i;
			}
			
			System.out.println("The sum of all the numbers from the starting and the end numbers (inclusive) is " + num);
		}
		
		
		public static void whileLoop(int start, int end) {	
			int num=0, i=start;
			
			while (i <= end){
				num += i;
				i+=1;
			}
			
			System.out.println("The sum of all the numbers from the starting and the end numbers (inclusive) is " + num);
		}
		
		public static void doWhileLoop(int start, int end) {	
			int num=0, i=start;
			
			do {
				num += i;
				i+=1;
			} while(i<=end);
			
			System.out.println("The sum of all the numbers from the starting and the end numbers (inclusive) is " + num);
		}
		
		

}
