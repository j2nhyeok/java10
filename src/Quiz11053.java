import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz11053 {
	public static int dp[];
	public static int numbers[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		dp = new int[N];
		numbers = new int[N];
		
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		for(int i  = 0; i < N ; i++) {
			numbers[i] = Integer.parseInt(st.nextToken()); 
		}
		
		System.out.println(length(N));
		

	}
	
	public static int length(int n) {
	for(int i = 0; i < n; i++) {
		dp[i] = 1;
		
		for(int j = 0; j < i; j++) {
			if(numbers[j] < numbers[i] && dp[i] < dp[j] + 1) {
				dp[i] = dp[j] + 1;
			}
		}
			
		}
	int max = -1;

	for(int i = 0; i < n; i++) {
		if(dp[i] > max) {
			max = dp[i];
		}	
	
	}
	return max;	
	}
}
