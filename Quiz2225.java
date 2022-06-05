import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz2225 {
	public static long dp[][];

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		dp = new long[N + 1][K + 1];
		
		System.out.println(cnt(N, K));
	}
	
	public static long cnt(int n , int k) {
		
		for(int i = 1; i <= n ; i++) {
			dp[i][1] = 1l;
		}
		
		for (int i = 1; i <= k; i++) {
			dp[1][i] = i; 
		}
		
		if(dp[n][k] == 0) {
			
		
			
			
			for(int  i = 2; i <= n; i++) {
				for(int j = 2; j <= k; j++) {
					dp[i][j] = (dp[i - 1][j] + dp[i][j - 1])  % 1_000_000_000;
				}
			}
		
		}
		
		
		
		return dp[n][k] ;
	}

}
