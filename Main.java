import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("���α׷� ����");
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("���� �� �Է�?");
			int left = sc.nextInt();
			System.out.println("������ �� �Է�?");
			int right = sc.nextInt();
			
		} catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է��ؾ��մϴ�.");
			System.out.println(e.getMessage()); 
			e.printStackTrace(); //���ܰ� �߻��Ǿ��� ��θ� �ܼ�â�� ���
		}
		System.out.println("���α׷� ���� ����");

	}

}
