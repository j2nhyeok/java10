import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz15990 {
	public static long dp[][] = new long[100001][4]; //동적 계획법을 사용할 예정. 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(bf.readLine()); //테스트 개수 t
		
		
		for(int i = 0 ; i< t; i++) {
			int n = Integer.parseInt(bf.readLine()); // 정수 n입력
			
			sb.append(cnt(n)).append("\n");
			
		}
		
System.out.println(sb);
	}
	
	
	public static long cnt(int n) {
	//dp[a][b]; == 숫자 a를 만들기 위해 숫자 b로 끝나는 경우 .
		dp[1][1] = 1; //숫자 1을 만들기 위해 숫자 1로 끝나는 경우   1 = 1     한 가지
		dp[2][2] = 1; //숫자 2를 만들기 위해 숫자 2로 끝나는 경우   2 = 2     한 가지
		dp[3][1] = 1; //숫자 3을 만들기 위해 숫자 1로 끝나는 경우   3 = 2 1   한 가지
		dp[3][2] = 1; //숫자 3을 만들기 위해 숫자 2로 끝나는 경우   3 = 1 2   한 가지
		dp[3][3] = 1; //숫자 3을 만들기 위해 숫자 3으로 끝나는 경우  3 = 3     한 가지
		dp[4][1] = 2; //숫자 4를 만들기 위해 숫자 1로 끝나는 경우 4 = 3 1 / 4 = 1 2 1  두 가지
		dp[4][3] = 1; //숫자 4를 만들기 위해 숫자 3으로 끝나는 경우 4 = 1 3    한 가지
		
		
			for(int i = 5; i<= n; i++) { //DP 점화식
				dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % 1000000009;
				dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % 1000000009;
				dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % 1000000009;
			}
		

		return (dp[n][1] + dp[n][2] + dp[n][3])  % 1000000009 ;
		
	}

}