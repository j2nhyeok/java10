import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz9095 {
	public static Integer dp[] = new Integer[11]; //동적 계획법을 사용할 예정. n의 범위가 1이상 10이하 이기때문에 0을 포함하여 크기룰 11로 선언
	
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
	
	public static int cnt(int n) {
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		if(dp[n] == null) {
			dp[n] = cnt(n-3) + cnt(n-2) + cnt(n-1); //점화식
		}
		
		
		return dp[n];
		
	}

}
