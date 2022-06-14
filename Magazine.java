

class Book{
	protected String title;
	protected int pageCnt;
	protected String author;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageCnt() {
		return pageCnt;
	}

	public void setPageCnt(int pageCnt) {
		this.pageCnt = pageCnt;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book() {
		
	}
	
	public Book(String title, int pageCnt, String author) {
		this.title = title;
		this.pageCnt = pageCnt;
		this.author = author;

	}
	
	public String tostring() {
		return "力格 : " + title + "其捞瘤 荐 : " + pageCnt + "历磊 : " + author;
	}
}




public class Magazine extends Book  {
	private int releaseDate;
	
	public static void main(String[] args) {
		Magazine M1 = new Magazine();
		

	}

}
