class Myclass{
	static {
		System.out.println("테스트테스트");
		Myclass2.hello();
	}
	
	public static int num;
}


class Myclass2{
	static void hello() {
		System.out.println(Myclass.num);
	}
}





public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		Myclass2.hello();
	}

}
