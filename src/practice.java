class Book {
	String title;
	String author;
	
	
	void print() {
		System.out.println("���� : " + title + "        ���� : " + author);
	}
}

class Day{
	int year;
	int month;
	int date;
	
	void print() {
		System.out.println("��/��/�� : " + year+ " / " + month + " / " +date);
	}
	
}

public class practice{
	public static void main(String[] args) {
		Book myBook = new Book();
		myBook.title = "blue";
		myBook.author = "����";
		
		
		myBook.print();
		
		Day toDay = new Day();
		toDay.year = 2022;
		toDay.month = 05;
		toDay.date = 27;
		
		
		toDay.print();
	}
}