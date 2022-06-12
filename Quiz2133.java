import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2133 {
	public static int dp[];
	public static void m ain(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(bf.readLine());
		dp = new int[31];
		
		System.out.println(cnt(N));
		
		
	}
	
	public static int cnt(int N) {

		dp[2] = 3;
		dp[4] = 11;
		if(6 <= N ) {
			
			for(int i = 6 ; i <= N; i += 2) {
				dp[i] = dp[i - 2] * dp[2] +	(dp[i-2] - dp[i-4]) ;  //i = 6일 때, 33 + 
			}
		}
		
		
		
		
		
		return dp[N];
	}
}