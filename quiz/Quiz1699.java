import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Quiz1699 {
	public static int dp[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine()); //첫째 줄에 자연수 N이 주어진다. (1 ≤ N ≤ 100,000)
		
		dp = new int[N + 1];

		
		System.out.println(minCnt(N));
	}
		
	
	
	public static int minCnt(int n) {

		dp[0] = 0;
		dp[1] = 1;
	 
		
		
		if(2 <= n) {  
		
 			for(int i = 2; i <= n; i++) {
 				int min = Integer.MAX_VALUE;
 				for(int j = 1; j <= (int)Math.sqrt(i); j++) {
 				min = Math.min(min, dp[i - j * j] + 1);
 				}
 				dp[i] = min;
 			}
		}
		

		
		return dp[n];
	}
}



