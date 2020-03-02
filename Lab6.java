import java.util.Scanner;

public class Lab6
{


	public static void main(String[] args) 
	{

			Scanner input = new Scanner(System.in);
			
			double burger=1.29, fries=0.79, soda=0.65, cost=0;
			

			System.out.println("\n                    MENU");
			System.out.println("\n          BURGERS............$1.29");
			System.out.println("\n          FRIES..............$0.79");
			System.out.println("\n          SODAS..............$0.65");
			System.out.println("\n \n \n \n ");
			
			
			cost=returnCost(burger, fries, soda);
			double a =returnTaxCost(cost);
			double b =returnTipCost(cost);
			double TotalCost = cost + a + b;
			
			System.out.println("\n                   RECIEPT:");
			System.out.println("\n          Cost..............$" + cost);
			System.out.println("\n          Tax...............$" + a);
			System.out.println("\n          Tip...............$" + b);
			System.out.println("\n          Total Cost........$" + TotalCost);
			
			
		
	}
	


public static double returnCost(double burger, double fries, double soda)
{
	Scanner input = new Scanner(System.in);
	double cost=0, x=0, y=0, z=0;
	
	
	System.out.println("\n       How Many Burgers Would You Like?");
	x=input.nextDouble();
	
	System.out.println("\n       How Many Fries Would You Like?");
	y=input.nextDouble();
	
	System.out.println("\n       How Many Sodas Would You Like?");
	z=input.nextDouble();
	
	
		cost = x*(1.29) + y*(0.79) + z*(0.65);
			
	
	return cost;
}


public static double returnTaxCost(double cost)
{
	double taxCost=0;

		taxCost = 0.07*(cost); 	
	
	return taxCost;
}

public static double returnTipCost(double cost)
{
	Scanner input = new Scanner(System.in);
	double tip=0, tipCost=0;

	System.out.println("\n       How Much Would You Like To Tip? ($)");
	tip=input.nextDouble();
	
		tipCost = tip; 	
	
	return tipCost;
}


} // end class

