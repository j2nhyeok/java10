package first.second;

import java.util.Scanner;

public class BookProgram {

	public static Scanner sc = new Scanner(System.in);
	public static Book[] books = new Book[100];
	public static BookCont cont = new BookCont();
	public static int number = -1;
	public static int cnt = 1;
	
	public static void main(String[] args) {
	
		while(true) {
		System.out.println("===========목록==========");
		System.out.println("1. 가격순으로 책 보기 (오름차순, 내림차순 선택가능)");
		System.out.println("2. 해당 장르별로  목록 보기");
		System.out.println("3. 상세보기");
		System.out.println("4. 도서 정보 수정");
		System.out.println("5. 도서 정보 추가");
		System.out.println("6. 종료");
		System.out.println("========================");
		
		System.out.print("목록 번호 입력 하세요 : ");
		 number = sc.nextInt();
	
		
		if(number == 1) {
			cont.insert();
			System.out.println("-----------------------프로그램" + cnt +"번 실행 완료");
		}
		
		else if(number == 2) {
			cont.searchAll();

			System.out.println("-----------------------프로그램" + cnt +"번 실행 완료");
		}
		else if(number == 3) {
			
			cont.avg_per_subject();
			System.out.println("-----------------------프로그램" + cnt +"번 실행 완료");
		}
		else if(number == 4) {
			cont.winner();
			System.out.println("-----------------------프로그램" + cnt +"번 실행 완료");
		}
		else if(number == 5) {
			insert();
			System.out.println("-----------------------프로그램" + cnt +"번 실행 완료");
		}
		else if(number == 6) {
			System.out.println("\n <학생 관리 프로그램을 종료합니다.>");
			break;
		}
		else {
			System.out.println("<범위에 없는 목록 번호를 입력하셨습니다.>");
			System.out.println("<다시 입력해주세요.>");
			System.out.println("-----------------------프로그램" + cnt +"번 실행 완료");
		}
		cnt++;
		}
		


	}



public void insert() {
	System.out.print("몇 개의 책을 입력하시겠습니까?  : ");
	int BookCnt = sc.nextInt();
	System.out.println("\n" + BookCnt +" 개의 책에 대한 정보를 입력하시오.");

	for(int i = 0; i < BookCnt ; i++) {	
    	
		for(int j = 0; j < BookProgram.class.) {
			
		}

		//값 입력 부분
	
	   
	      Title = sc.next();
	     
	      Author = sc.next();
	      Publisher = sc.next();
	      Genre = sc.next();
	      Price = sc.nextInt();
	     
	      Book book[i] = new Book( Title, Author, Publisher, Genre, Price));
}
}
}

