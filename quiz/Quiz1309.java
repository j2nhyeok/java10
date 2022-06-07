import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz1309 {
	public static long dp[][];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		int N = Integer.parseInt(bf.readLine());
		dp = new long[N + 1][3];
		
		System.out.println(cnt(N));

		
	}
	}
	
	public static long cnt(int N) {
		
		dp[1][0] = 1;
		dp[1][1] = 1;
		dp[1][2] = 1;
		
		int sum = 0;
		
		if(dp[N][2] == 0) {
			for(int i = 2; i <= N ; i++) {
				dp[i][0] = ( dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2] ) % 9901;
				dp[i][1] = ( dp[i - 1][0] + dp[i - 1][2] ) % 9901;
				dp[i][2] = ( dp[i - 1][0] + dp[i - 1][1] ) % 9901;
			}
		}
		
		for(int i = 0; i <=2 ; i++)
		{		
			sum += dp[N][i];
		}
		return sum % 9901 ;
	}

}
