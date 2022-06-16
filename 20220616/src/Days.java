
public interface Days {
//	 int num = 10; //(public static int)생략 인터페이스로 정적인 상수 가능.
	
}


interface MyInterface{
	default void printHello() {
		System.out.println("hello");    //기본값으로 구현 , 필요 시 오버라이딩.
	};
	
	
	public static void myStaticMethod() { //static 한 메소드 구현 가능
		
	}
	
//	private static int sum(int a , int b) {  //private한  static메소드는 안됨
//		return a + b;						// 자바 9버전 부터는 가능함.
//	}
	
}