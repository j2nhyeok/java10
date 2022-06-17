import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("try 블록 안");
			Object o = new Object();
			String s = (String) o;
		} catch(Exception e) {
			System.out.println("catch 블록 안");
			System.out.println(e.getMessage());
		} finally { //finally 블록은 try catch블록안에서 예외가 발생하든 안하든 무조건 실행하는 블록
			System.out.println("finally 블록 안");
		}
		
		System.out.println("정상 종료");

	}

}
