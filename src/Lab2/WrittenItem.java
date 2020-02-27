package Lab2;

public abstract class WrittenItem extends Item {
	public WrittenItem(int identificationnumber, String title, int noofcopies,String author) {
		super(identificationnumber, title, noofcopies);
		this.author = author;
	}
	
	
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}	
	

}