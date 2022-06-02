import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2193 {
	public static long dp[][];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine());
		dp = new long[N+1][2];
		
		System.out.println(pinary_number(N));
		
	}
	
	public static long pinary_number(int n) {
		dp[1][0] = 0;
		dp[1][1] = 1; // 1

	
		

			for(int i = 2; i <= n; i++) {
				dp[i][1] = dp[i-1][0];
				dp[i][0] = dp[i-1][0] + dp[i-1][1];
			}
		
		
		
		
		
		return dp[n][0]  + dp[n][1];
	}
}
	
