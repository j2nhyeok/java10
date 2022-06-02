import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz10844 {
	public static long dp[][];
	public static long sum = 0l; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 
	 int N = Integer.parseInt(bf.readLine()); //첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수
	
	 dp =  new long[N+1][10];
	 
	System.out.println(stair_cnt(N));

	}
	
	private static long stair_cnt(int n) {
		dp[1][0] = 0; //0으로 시작하는 수는 계단수가 아니다.


		
		for(int i = 1; i < 10; i++) {  // 첫 번째 자릿수는 오른쪽 맨 끝의 자릿수이므로 경우의 수가 1개밖에 없음 
			dp[1][i] =1;
		}
		
		for(int j = 2; j <= n ; j++) { // 두 번째 자릿수부터 N까지 탐색 
			
			for(int i = 0; i <10; i++) { // i번째 자릿수의 자릿값들을 탐색 (0~9) 
			
				if(i == 0) dp[j][0] = dp[j-1][1] % 1000000000; // i = 0, 즉 자릿값이 0이라면 이전 자릿수의 첫번째 자릿수만 가능
				else if(i == 9) dp[j][9] = dp[j-1][8] % 1000000000; // i = 9라면 이전 자릿수는 8만 가능
				else { // 그 외의 경우 이전 자릿수의 자릿값 +1, -1 의 합이 됨 
					dp[j][i] = (dp[j-1][i - 1] + dp[j-1][i + 1]) % 1000000000;
				}
			
			}
		}
		// 각 자릿값마다의 경우의 수를 모두 더해준다. 
		for(int j = 0; j < 10; j++) {
			sum +=  dp[n][j]  %  1000000000 ;
		}
		
		
		return sum %  1000000000 ;
	}
}
