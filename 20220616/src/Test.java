class Myclass{
	static {
		System.out.println("�׽�Ʈ�׽�Ʈ");
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
		System.out.println("����");
		Myclass2.hello();
	}

}
