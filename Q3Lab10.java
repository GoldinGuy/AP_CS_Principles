
public class Q3Lab10 {

	public static void main (String[] args){

		forLoop();
		whileLoop();
		doWhileLoop();
				
		
	}	
		
		public static void  forLoop(){
			int num=0;
			
			for (int i=0; i<=100; i++)
			{
				num += i;
			}
			
			System.out.println("The sum of all the numbers from the starting and the end numbers (inclusive) is " + num);
		}
		
		
		public static void whileLoop() {	
			int num=0, i=0;
			
			while (i <= 100){
				num += i;
				i+=1;
			}
			
			System.out.println("The sum of all the numbers from the starting and the end numbers (inclusive) is " + num);
		}
		
		public static void doWhileLoop() {	
			int num=0, i=0;
			
			do {
				num += i;
				i+=1;
			} while(i<=100);
			
			System.out.println("The sum of all the numbers from the starting and the end numbers (inclusive) is " + num);
		}
		
		
	
} // end class
