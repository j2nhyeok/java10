
public class Main4 {

	public static void main(String[] args) {
		try {
			int left = 10;
			int right = 0;
			
			if(right == 0) {
				//0���� �������� �� (�������� ��Ȳ)
				// ���� ��� ��������.
				throw new MyZeroDivideExeption("0���� ������ �������� ��Ȳ�� �߻��߽��ϴ� ~~~~~~~~~~~~");
				
			}
		} catch (MyZeroDivideExeption e) {
			 System.out.println(e.getMessage());
		}
	}

}
