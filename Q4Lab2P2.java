
public class Q4Lab2P2 {

	public static void main(String[] args) {
		int[] array = {10,5,3,25,35,9,7,13};
		int sum=0;
		
		System.out.println("The size of the array is " + (array.length));
		System.out.println("The last element in the array is " + (array[array.length-1]));
		
		for(int i=0; i<array.length; i++){
			sum=sum+array[i];
			} // end loop	
		System.out.println("The sum of all the elements in the array is " + sum);
		System.out.println("The average of all the elements in the array is " + (sum/array.length));
		
	} // end main
} // end class