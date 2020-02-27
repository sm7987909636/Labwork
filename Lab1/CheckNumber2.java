package Lab1;

public class CheckNumber2 {
	public boolean checknumber2(int n) {
		{ 
		    if(n==0) 
		    return false; 
		  
		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==  
		       (int)(Math.floor(((Math.log(n) / Math.log(2))))); 
		} 
	}

}
