import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz2750 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		
		int N = Integer.parseInt(bf.readLine()); //첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
		int input_numbers[] = new int[N];
		int count[] = new int[10001];
		int out_numbers[] = new int[N];
		
		
		for(int k = 0; k <= 10000; k++) {
			count[k] = 0;
		}
		
		
		
		for(int i = 0 ; i < N; i++) {
			input_numbers[i] = Integer.parseInt(bf.readLine());
		}
		
		for(int j = 0; j < N; j++) {
			count[input_numbers[j]]++;
		}
		
		for(int c = 1; c < count.length ; c++) {
			count[c] += count[c-1];
		}
		
		for(int a = input_numbers.length - 1; 0 <= a; a--) {
			 out_numbers[--count[input_numbers[a]]]= input_numbers[a];
		}
		
		for(int b = 0; b <input_numbers.length; b++) {
			System.out.println(out_numbers[b]);
		}
		

	}
}
