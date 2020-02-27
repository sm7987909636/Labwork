package Lab1;

public class Calculate {
	public static void main(String[] args) {
		CalculateSum cal = new CalculateSum();
		
		System.out.println("The sum of multiple of 3 and 5 are " + cal.calculateSum(20));
		
		CalculateDiffrence cdiff = new CalculateDiffrence();
		
		System.out.println("The diffrence between sum of square and square of sum is " + cdiff.calculateDiffrence(5));
		
		CheckNumber cno = new CheckNumber();
		
		System.out.println("Number is " + cno.checkNumber(146) + " increasing number");
		
		CheckNumber2 cno1 = new CheckNumber2();
		
		System.out.println(cno1.checknumber2(511));
		
    }
}
