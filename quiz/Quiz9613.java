import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz9613 {
	public static int[] number;
	public static StringTokenizer st;
	
	public static Long sum;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		
		int t = Integer.parseInt(bf.readLine()); //첫째 줄에 테스트 케이스의 개수 t (1 ≤ t ≤ 100)
		
		
		for(int i = 0; i < t; i++) {
			
			sum = 0l;
			st = new StringTokenizer(bf.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());  //각 테스트 케이스는 수의 개수 n (1 < n ≤ 100)
			
			sb.append(GCD(n)).append("\n");
		}
		System.out.println(sb);
	}



public static Long GCD(int n) {
	
	int number[] = new int[n];
	
	for(int j = 0; j < n; j++) {
		number[j] = Integer.parseInt(st.nextToken());
	}
	
	for(int k = 0 ; k < number.length - 1; k++) {

		int bigger_number = 0;
		int smaller_number = 0;
		for(int m = k + 1; m < number.length; m++) {
			int moduler = 1;
			
			while(moduler != 0) {
			bigger_number = Math.max(number[k], number[m]);
			smaller_number = Math.min(number[k], number[m]);
			moduler = bigger_number % smaller_number;
			
			if(moduler != 0) {
				bigger_number = smaller_number;
				smaller_number = moduler;
			}
			
			sum += smaller_number;
		}
}
	}
	return sum;
}
}



