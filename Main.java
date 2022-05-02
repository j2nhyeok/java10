import java.util.Arrays;
import java.util.List;

public class Main {


	public static void main(String[] args) {
		//숫자 범위는 1 ~ 10,000까지.

		boolean[] SN = new boolean[10001];
		
		for(int i = 1; i < 10001; i++) {		
			int n = d(i);
			if(n<10001) {
				SN[n] = true;
				
			}
		}
		for(int j = 1; j < 10001; j++) {
			if(SN[j] == false) {
				System.out.println(j);
			}
		}
			
}
		

	
	public static int d(int num) {
		int sum = num;

		while(num != 0) {
			sum += num % 10;
			num = num / 10;
			
		}

		return  sum;
	
	
}
}