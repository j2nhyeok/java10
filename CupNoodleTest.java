
public class CupNoodleTest {

	public static void main(String[] args) {
		CupNoodle R1 = new CupNoodle("���", "������", 3000);
		CupNoodle R2 = new CupNoodle("���", "������", 4000);
		
		
		if(R1.equals(R2)) {
			System.out.println(R1.toString());
			System.out.println(R2.toString());
			System.out.println("���� ����Դϴ�");
		}else {
			System.out.println("������ ȸ��� ���� �ƴմϴ�.");
		}

	}

}
