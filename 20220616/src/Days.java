
public interface Days {
//	 int num = 10; //(public static int)���� �������̽��� ������ ��� ����.
	
}


interface MyInterface{
	default void printHello() {
		System.out.println("hello");    //�⺻������ ���� , �ʿ� �� �������̵�.
	};
	
	
	public static void myStaticMethod() { //static �� �޼ҵ� ���� ����
		
	}
	
//	private static int sum(int a , int b) {  //private��  static�޼ҵ�� �ȵ�
//		return a + b;						// �ڹ� 9���� ���ʹ� ������.
//	}
	
}