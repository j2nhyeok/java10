import java.util.Scanner;

public class Quiz17299{

	public static void main(String[] args){
		
		
Scanner sc = new Scanner(System.in);
System.out.println("������ �Է��ϼ���");
int number = sc.nextInt();

for(int i = 2; i < number ; i++) {
	if(number % i == 0) {
		System.out.println(" �Ҽ��� �ƴմϴ� ");
		break;
	}
	else {
		System.out.println(" �Ҽ� �Դϴ�.");
		break;
	}
  }
	}
}
