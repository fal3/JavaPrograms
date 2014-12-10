
public class Library {
	private String title;
	private String id;
	private String author;
	public Library(String title, String id,String author){
		this.title = title;
		this.id = id;
		this.author= author;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String newTitle){
		title = newTitle;
	}
	public String getId(){
		return id;
	}
	public void setId(String newId){
		id=newId;
	}
	public String getAuthor(){
		return author;
	}
	public void setauthor(String newAuthor){
		author = newAuthor;
	}
	
}
