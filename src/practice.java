class Book {
	String title;
	String author;
	
	
	void print() {
		System.out.println("力格 : " + title + "        历磊 : " + author);
	}
}

class Day{
	int year;
	int month;
	int date;
	
	void print() {
		System.out.println("斥/岿/老 : " + year+ " / " + month + " / " +date);
	}
	
}

public class practice{
	public static void main(String[] args) {
		Book myBook = new Book();
		myBook.title = "blue";
		myBook.author = "隔尔";
		
		
		myBook.print();
		
		Day toDay = new Day();
		toDay.year = 2022;
		toDay.month = 05;
		toDay.date = 27;
		
		
		toDay.print();
	}
}