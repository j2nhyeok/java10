import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz11055 {
	public static int dp[ ];
	public static int numbers[ ];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		dp = new int[N + 1];
		numbers = new int[N + 1];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		for(int i = 1; i <= N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(max_sum(N));

	}
	
	public static int max_sum(int N) {
		dp[1] = numbers[1];
		
		if(dp[N] == 0) {
			
			int a  = dp[1];
			
			for(int i = 2; i <= N; i++) {
				if(numbers[i -1] < numbers[i]) {
					dp[i] = dp[i-1] + numbers[i]; 
				} else if(numbers[i - 1] > numbers[i]) {
					if(a < numbers[i]) {
					dp[i] = a + numbers[i];
					a = dp[i];}
					else {
						dp[i] = numbers[i];
						a = dp[i];
					}
				} else if(numbers[i - 1] == numbers[i]) {
					dp[i] = dp[i-1];
				}
			}
		}

	Arrays.sort(dp);
		return dp[N];
	}

}
