package Lab2;

public abstract class MediaItem extends Item {

	public MediaItem(int identificationnumber2, String title2, int noofcopies2,int runtime) {
		super(identificationnumber2, title2, noofcopies2);
		this.runtime=runtime;
		
	}
	private int runtime;
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

}
