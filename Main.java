import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("왼쪽 수 입력?");
			int left = sc.nextInt();
			System.out.println("오른쪽 수 입력?");
			int right = sc.nextInt();
			
		} catch(InputMismatchException e) {
			System.out.println("숫자를 입력해야합니다.");
			System.out.println(e.getMessage()); 
			e.printStackTrace(); //예외가 발생되었던 경로를 콘솔창에 출력
		}
		System.out.println("프로그램 정상 종료");

	}

}
