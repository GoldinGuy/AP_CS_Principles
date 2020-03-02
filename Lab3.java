
public class Lab3 {

	public static void main(String[] args) {
	
		double result[] = new double[6];
		double x = 105,y = 5;
		String name = ("");
		
		result[0] = x + y;
		result[1] = x - y;
		result[2] = x / y;
		result[3] = (x + y) / 2;
		result[4] = x * y;
		result[5] = x % y;

		
		for (int i=0; i<result.length; i++)
		{
		
			if (i==0)
			{
				name = ("sum");
			}
			
			if (i==1)
			{
				name = ("difference");
			}
			
			if (i==2)
			{
				name = ("quotient");
			}
			
			if (i==3)
			{
				name = ("average");
			}
			
			if (i==4)
			{
				name = ("product");
			}
			
			if (i==5)
			{
				name = ("modulus");
			}
		
		System.out.println("The " + name + " of the two numbers is: " + result[i]);
		
		}

	}

}
