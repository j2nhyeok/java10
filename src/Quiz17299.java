import java.util.Scanner;

public class Quiz17299{

	public static void main(String[] args){
		
		
Scanner sc = new Scanner(System.in);
System.out.println("정수를 입력하세요");
int number = sc.nextInt();

for(int i = 2; i < number ; i++) {
	if(number % i == 0) {
		System.out.println(" 소수가 아닙니다 ");
		break;
	}
	else {
		System.out.println(" 소수 입니다.");
		break;
	}
  }
	}
}
