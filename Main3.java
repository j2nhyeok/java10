import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("try ��� ��");
			Object o = new Object();
			String s = (String) o;
		} catch(Exception e) {
			System.out.println("catch ��� ��");
			System.out.println(e.getMessage());
		} finally { //finally ����� try catch��Ͼȿ��� ���ܰ� �߻��ϵ� ���ϵ� ������ �����ϴ� ���
			System.out.println("finally ��� ��");
		}
		
		System.out.println("���� ����");

	}

}
