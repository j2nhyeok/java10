
public class Main5 {
	public static int divide(int left, int right) throws MyZeroDivideExeption { //ȣ���� �޼���� ��������.
		if(right == 0) {
			throw new MyZeroDivideExeption("divide �� �� ����");
		
		}else {
			return left / right;
		}
	}
	
	public static int myFunction() {
		throw new UnsupportedOperationException("���� ���� ����");
		
	}
	

	public static void main(String[] args) throws MyZeroDivideExeption {
	
		myFunction();
			
		
	}

}
