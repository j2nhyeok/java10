import java.util.Arrays;
import java.util.Scanner;

public class quiz1065{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N은 1~1000
		int a = hansu(N);
		
		System.out.println(a);
		
	}

	public static int hansu(int number) {
	
	int c =  0;
	int cnt = 0;
	if(number <= 99) {
		c = number;
	}

	else if(100 <= number && number <= 999) {
		
	for(int j = 100; j <= number ; j++) {
		  String number1 = String.valueOf(j);
	      String[] digits = number1.split("");
	      int[] nums = Arrays.stream(digits).mapToInt(Integer::parseInt).toArray();
		 
	      if(nums[1] - nums[0] == nums[2] - nums[1] ) {
			  cnt++;
		  
	}
		 
	   
	   }
	c = 99 + cnt;
	}
		else if(number == 1000) {
		c = 144;
	}
	return c;
}
}
