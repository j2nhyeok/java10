import java.util.Scanner;

public class quiz11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int split_number[] = new int[N];
		String number1 = sc.next();
		int sum = 0;
		
		 
		  String[] digits = number1.split("(?<=.)");

	        for(int i=0; i< digits.length; i++) {
	            split_number[i] = Integer.parseInt(digits[i]);
	        }


		
		for (int j = 0; j < split_number.length; j++) {
			sum += split_number[j];
		}
		
		System.out.println(sum);
		
	}

}
