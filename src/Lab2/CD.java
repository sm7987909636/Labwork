package Lab2;

public class CD extends MediaItem {

	public CD(int identificationnumber2, String title2, int noofcopies2,int runtime,String artist,String genre) {
		super(identificationnumber2, title2, noofcopies2,runtime);
		this.artist=artist;
		this.genre=genre;
	}
	String artist;
	String genre;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	

}
