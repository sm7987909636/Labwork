package Lab3;


public class LabMain {
	
	public static void main (String [] args) {

		SecondSmallest ss = new SecondSmallest();
		int [] ss1 = {9,8,7,4,5,6,3,2,1};
		
		System.out.println("The second smallest value is "+ ss.secondsmallest(ss1));
	
	}
	
}
