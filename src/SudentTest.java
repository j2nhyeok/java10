import java.util.Scanner;

public class SudentTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StuCont cont = new StuCont();
		int number = -1;
		int cnt = 1;
	
		while(true) {
		System.out.println("===========���==========");
		System.out.println("1. �ű� �л���� (�ִ� 3����� ����)");
		System.out.println("2. �л� ��� ����");
		System.out.println("3. �� ����� ��� ����");
		System.out.println("4. ��� 1�� �л��� ����");
		System.out.println("5. ����");
		System.out.println("========================");
		
		System.out.print("��� ��ȣ �Է� �ϼ��� : ");
		 number = sc.nextInt();
	
		
		if(number == 1) { // 3�� �ű� �л� �߰� ��� ����.  
			cont.insert();
			System.out.println("-----------------------���α׷�" + cnt +"�� ���� �Ϸ�");
		}
		
		else if(number == 2) { // ��ϵǾ��ִ� �л����� ��� ���� 
			cont.searchAll();

			System.out.println("-----------------------���α׷�" + cnt +"�� ���� �Ϸ�");
		}
		else if(number == 3) { // �� ����� ��� ����
			
			cont.avg_per_subject();
			System.out.println("-----------------------���α׷�" + cnt +"�� ���� �Ϸ�");
		}
		else if(number == 4) { //��� 1�� �л��� �̸��� ���
			cont.winner();
			System.out.println("-----------------------���α׷�" + cnt +"�� ���� �Ϸ�");
		}
		else if(number == 5) {
			System.out.println("\n <�л� ���� ���α׷��� �����մϴ�.>");
			break;
		}
		else {
			System.out.println("\n<������ ���� ��� ��ȣ�� �Է��ϼ̽��ϴ�.>");
			System.out.println("<�ٽ� �Է����ּ���.>");
			System.out.println("-----------------------���α׷�" + cnt +"�� ���� �Ϸ�");
		}
		cnt++;
		}
		
	}

}
