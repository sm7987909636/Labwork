package Lab2;

public class Journal extends WrittenItem {

	public Journal(int identificationnumber, String title, int noofcopies, String author, int yearofpublish) {
		super(identificationnumber, title, noofcopies, author);
		this.yearofpublish = yearofpublish;
	
	}
	private int yearofpublish;

	public int getYearofpublish() {
		return yearofpublish;
	}

	public void setYearofpublish(int yearofpublish) {
		this.yearofpublish = yearofpublish;
	}
	

	
}
