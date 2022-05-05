import java.util.Scanner;

public class quiz2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		

		// 문자열 reverse
		String reverse = "";
		for (int i = num1.length() - 1; i >= 0; i--) {
		reverse = reverse + num1.charAt(i);
		}
		// 결과 출력
		   int reverse_number1 = Integer.parseInt(reverse); // "EDCBA"
		
		// 문자열 reverse
		String reverse2 = "";
		for (int i = num2.length() - 1; i >= 0; i--) {
		reverse2 = reverse2 + num2.charAt(i);
		}
		// 결과 출력
		int reverse_number2 = Integer.parseInt(reverse2); 
		
		if(reverse_number1 < reverse_number2) {
			System.out.println(reverse_number2);
		} else if(reverse_number1 > reverse_number2) {
			System.out.println(reverse_number1);
		}
		

}
}
