package Lab2;


public class MainClass {
	public static void main(String[] args) {
		
		MainClass mainclass = new MainClass();
		Item[] item = new Item[4];
		Book b1 = new Book(101, "Who will cry", 5, "Robin Sharma");		
				
		Journal j1 = new Journal(201,"Always",8,"Sharma ji",1998);	
		
		Video v1 = new Video(301,"Satisfy",15,5,"satisfy","Dont know",2002);
		
		CD c1 = new CD(401,"TATTO",2,8,"Nawab","Dont know");
				
		item[0]=b1;
		item[1]=j1;
		item[2]=v1;
		item[3]=c1;
		
		for(int i=0;i<item.length ;i++) {
			if(item[i] instanceof Book) {
				Book book=(Book)item[i];
				mainclass.display(book);
			}
			else if(item[i] instanceof Journal) {
				Journal journal=(Journal)item[i];
				mainclass.display(journal);
			}
			else if(item[i] instanceof Video) {
				Video video=(Video)item[i];
				mainclass.display(video);
			}
			else if(item[i] instanceof CD) {
				CD cd=(CD)item[i];
				mainclass.display(cd);
			}
		}		
	}
	public void display(Book b1) {
		System.out.println(b1.getIdentificationnumber());
		System.out.println(b1.getTitle());
		System.out.println(b1.getNoofcopies());
		System.out.println(b1.getAuthor());
		System.out.println("/n");
		
		
	}
	public void display(Journal j1) {
		System.out.println(j1.getIdentificationnumber());
		System.out.println(j1.getTitle());
		System.out.println(j1.getNoofcopies());
		System.out.println(j1.getAuthor());
		System.out.println(j1.getYearofpublish());
		System.out.println("/n");
		
	}
	public void display(Video v1) {
		System.out.println(v1.getIdentificationnumber());
		System.out.println(v1.getTitle());
		System.out.println(v1.getNoofcopies());
		System.out.println(v1.getRuntime());
		System.out.println(v1.getDirector());
		System.out.println(v1.getGenre());
		System.out.println(v1.getYearreleased());
		System.out.println("/n");
	}
	public void display(CD c1) {
		System.out.println(c1.getIdentificationnumber());
		System.out.println(c1.getTitle());
		System.out.println(c1.getNoofcopies());
		System.out.println(c1.getRuntime());
		System.out.println(c1.getArtist());
		System.out.println(c1.getGenre());
		System.out.println("/n");
	}

}
