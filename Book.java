
public class Book {
	private String Title;
	private String Author;
	private String Publisher;
	private String Genre;
	private int Price;


	public Book (String Title, String Author, String Publisher, String Genre, int Price) {
		this.Title = Title;
		this.Author = Author;
		this.Publisher = Publisher;
		this.Genre = Genre;
		this.Price = Price;
	}
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String Title) {
		this.Title = Title;
	}
	
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String Author) {
		this.Author = Author;
	}
	
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String Publisher) {
		this.Publisher = Publisher;
	}
	
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String Genre) {
		this.Genre = Genre;
	}
	
	public int getPrice() {
		return Price;
	}
	public void setPrice(int Price) {
		this.Price = Price;
	}
	
	public String toString(){
	    return "[제목 : "+ this.Title +"] [저자 : "+ this.Author+"] [출판사 : " + this.Publisher + "] [장르 : " + this.Genre + "] [가격 : " + this.Price + "]";
	}
}


