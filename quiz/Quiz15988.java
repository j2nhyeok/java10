import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz15988 {
	public static long dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(bf.readLine());
			
			dp = new long[1_000_001];
			
			sb.append(cnt(n)).append("\n");
		}
		
		System.out.println(sb);
	}
	public static long cnt(int n) {
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		if(dp[n] == 0) {
			for(int i = 4; i <= n ; i++){
				dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000009;
			}
		}
			
		return dp[n] % 1000000009;
	}

}
