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
		System.out.println("===========���==========");
		System.out.println("1. ���ݼ����� å ���� (��������, �������� ���ð���)");
		System.out.println("2. �ش� �帣����  ��� ����");
		System.out.println("3. �󼼺���");
		System.out.println("4. ���� ���� ����");
		System.out.println("5. ���� ���� �߰�");
		System.out.println("6. ����");
		System.out.println("========================");
		
		System.out.print("��� ��ȣ �Է� �ϼ��� : ");
		 number = sc.nextInt();
	
		
		if(number == 1) {
			cont.insert();
			System.out.println("-----------------------���α׷�" + cnt +"�� ���� �Ϸ�");
		}
		
		else if(number == 2) {
			cont.searchAll();

			System.out.println("-----------------------���α׷�" + cnt +"�� ���� �Ϸ�");
		}
		else if(number == 3) {
			
			cont.avg_per_subject();
			System.out.println("-----------------------���α׷�" + cnt +"�� ���� �Ϸ�");
		}
		else if(number == 4) {
			cont.winner();
			System.out.println("-----------------------���α׷�" + cnt +"�� ���� �Ϸ�");
		}
		else if(number == 5) {
			insert();
			System.out.println("-----------------------���α׷�" + cnt +"�� ���� �Ϸ�");
		}
		else if(number == 6) {
			System.out.println("\n <�л� ���� ���α׷��� �����մϴ�.>");
			break;
		}
		else {
			System.out.println("<������ ���� ��� ��ȣ�� �Է��ϼ̽��ϴ�.>");
			System.out.println("<�ٽ� �Է����ּ���.>");
			System.out.println("-----------------------���α׷�" + cnt +"�� ���� �Ϸ�");
		}
		cnt++;
		}
		


	}



public void insert() {
	System.out.print("�� ���� å�� �Է��Ͻðڽ��ϱ�?  : ");
	int BookCnt = sc.nextInt();
	System.out.println("\n" + BookCnt +" ���� å�� ���� ������ �Է��Ͻÿ�.");

	for(int i = 0; i < BookCnt ; i++) {	
    	
		for(int j = 0; j < BookProgram.class.) {
			
		}

		//�� �Է� �κ�
	
	   
	      Title = sc.next();
	     
	      Author = sc.next();
	      Publisher = sc.next();
	      Genre = sc.next();
	      Price = sc.nextInt();
	     
	      Book book[i] = new Book( Title, Author, Publisher, Genre, Price));
}
}
}

