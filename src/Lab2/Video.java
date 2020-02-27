package Lab2;

public class Video extends MediaItem {

	public Video(int identificationnumber2, String title2, int noofcopies2,int runtime,String director,String genre,int yearreleased) {
		super(identificationnumber2, title2, noofcopies2, runtime);
		this.director=director;
		this.genre=genre;
		this.yearreleased=yearreleased;
	}
	String director;
	String genre;
	int yearreleased;
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearreleased() {
		return yearreleased;
	}
	public void setYearreleased(int yearreleased) {
		this.yearreleased = yearreleased;
	}
	

}
