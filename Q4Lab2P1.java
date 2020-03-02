
public class Q4Lab2P1 {

	public static void main(String[] args) {
		String[] Members = {"Jackson Riche", "Chardly Riche", "Zulmie Delva", "Stanly Mathurin"};
		
		System.out.println("The first element in the array is " + Members[0]);
		System.out.println("The last element in the array is " + Members[Members.length-1]);
		
		for(int i=0; i<Members.length; i++){
			System.out.println(Members[i]);
			} // end loop	
		for(int j=Members.length-1;j>0; j--){
			System.out.println(Members[j]);
			} // end loop
	} // end main
} // end class