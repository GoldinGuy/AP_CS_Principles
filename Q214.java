import java.text.DecimalFormat;
import java.util.Scanner;

public class Q214 {

	public static void main (String[] args){

		computeVolume();
		
	}	
		
		public static double computeArea(){
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("\nPlease enter a radius: ");
			double r=input.nextInt();
			
			r=(3.14)*(Math.pow(r,2));
			
			return r;
		}
		
		
		public static void computeVolume() {	
			
			Scanner input = new Scanner(System.in);
			DecimalFormat myformat = new DecimalFormat ("#.00");
			
			double a = computeArea();
			
			System.out.println("\nPlease enter a height: ");
			double h=input.nextInt();
			
			double v=a*h;
			
			System.out.println("The volume is " + myformat.format(v));
		}
		


}
