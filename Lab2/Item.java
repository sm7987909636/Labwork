package Lab2;

public abstract class Item {
	private int identificationnumber;
	private String title; 
	private int noofcopies;
	
	public Item(int identificationnumber2, String title2, int noofcopies2) {
		this.identificationnumber = identificationnumber2;
		this.title = title2;
		this.noofcopies = noofcopies2;
	}

	public int getIdentificationnumber() {
		return identificationnumber;
	}
	
	public void setIdentificationnumber(int identificationnumber) {
		this.identificationnumber = identificationnumber;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getNoofcopies() {
		return noofcopies;
	}
	
	public void setNoofcopies(int noofcopies) {
		this.noofcopies = noofcopies;
	}
	
}
