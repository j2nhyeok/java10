import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz11057 {
	public static int dp[][]; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		//dp[i][j]  == 길이가 i인 오르막 수 중 맨 끝 자리의 수가 j로 끝나는 오르막 수의 개수
		dp = new int[N + 1][10]; //
		
		System.out.println(rise_cnt(N));
		

	}
	public static int rise_cnt(int N) {         //길이가 N인 오르막 수의 개수를 구해줄 메서드
		int cnt = 0;
		for(int i = 0; i <= 9 ; i++) { //기저상태     길이가 1인 오르막 수의 중 끝이 0 ~ 9로 끝나는 수의 개수는 각 1개씩 총 10개다
			dp[1][i] = 1;
		}
		
		if(dp[N][9] == 0) {
		
		for(int i = 2; i <= N; i++) {
			for(int j = 0; j <= 9; j++) {
				for(int k = 0 ; k <= j; k++) {
					dp[i][j] =(dp[i][j] + dp[i- 1][k]) % 10007;
				}
				
			}
		}
		}
		

		for(int i = 0; i <= 9; i++) {
			cnt += dp[N][i];    // 길이가 N인 오르막 수 중 0으로 끝나는 수의 개수 + . . . + 길이가 N인 오르막 수 중 9로 끝나는 수의 개수 를 해야 길이가 N인 오르막 수의 개수가 나온다.
		}
		
		return cnt % 10007;
		
		
	}

}
