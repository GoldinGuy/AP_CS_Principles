import java.util.Scanner;
	
		public class Q3QuarterProject {
			
		public static Scanner s = new Scanner(System.in); // scanner

		public static void main(String[] args) {
			while (true){
				System.out.println("\nPress 1 to compute the Sum of 2 numbers ");
				System.out.println("Press 2 to compute the Product of 2 numbers ");
				System.out.println("Press 3 to compute the Difference of 2 numbers ");
				System.out.println("Press 4 to compute the Average of 2 numbers ");
				System.out.println("Press 5 to compute the Modulus of 2 numbers ");
				System.out.println("Press -1 to Exit the program ");
				System.out.println("\nEnter Your Selection: ");
				double select=s.nextDouble();
				
				if (select == 1){computeSum();}
				else if (select == 2){computeProduct();	}
				else if (select == 3){computeDifference();}
				else if (select == 4){computeAverage();}
				else if (select == 5){computeModulus();}
				else if (select == -1){System.out.println("\nThank you for using my calculator program. Goodbye! "); break;}
			} // end loop
		} // end main
		
		public static void computeSum(){	
			System.out.println("\nEnter the first number: ");
			double num1=s.nextDouble();
			System.out.println("\nEnter the second number: ");
			double num2=s.nextDouble();
			
			double sum = num1 + num2;
			System.out.println("\nThe Sum of the two numbers is " + sum);
		} // end add
		
		public static void computeProduct(){
			System.out.println("\nEnter the first number: ");
			double num1=s.nextDouble();
			System.out.println("\nEnter the second number: ");
			double num2=s.nextDouble();
			
			double pro = num1 * num2;
			System.out.println("\nThe Product of the two numbers is " + pro);
		} // end multiply
		
		
		public static void computeDifference(){
			System.out.println("\nEnter the first number: ");
			double num1=s.nextDouble();
			System.out.println("\nEnter the second number: ");
			double num2=s.nextDouble();
			
			double dif = num1 - num2;
			System.out.println("\nThe Difference of the two numbers is " + dif);
		} // end subtract
		
		
		public static void computeAverage(){
			System.out.println("\nEnter the first number: ");
			double num1=s.nextDouble();
			System.out.println("\nEnter the second number: ");
			double num2=s.nextDouble();
			
			double avg = (num1 + num2)/2;
			System.out.println("\nThe Average of the two numbers is " + avg);
		} // end average
		
		public static void computeModulus(){
			System.out.println("\nEnter the first number: ");
			double num1=s.nextDouble();
			System.out.println("\nEnter the second number: ");
			double num2=s.nextDouble();
			
			double mod = num1 % num2;
			System.out.println("\nThe Modulus of the two numbers is " + mod);
		} // end modulus

	} // end class
