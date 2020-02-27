package Lab1;

public class CalculateDiffrence {
	public int calculateDiffrence(int n) {
		int sum = 0;
		int sumofsquare = 0;
		int squareofsum = 0;
		for(int i = 1; i < n; i++) {
			sumofsquare += i*i;
			squareofsum += i;
			sum = sumofsquare - (squareofsum*squareofsum);
		}
		return sum;
		
	}

}
