import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static Integer dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine()); //첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
		
		 dp = new Integer[1001];  //N이 1000이하 이므로 0까지 포함하여 1000 크기의 다이나믹프로그래밍을 듯하는 dp 배열 할당.
		 							//N의 값에 따라  2×n 크기의 직사각형을 채우는 방법의 수를 각 배열에 저장 할 예정.

		
		 System.out.println(recur(n) );
	}
	
	public static int recur(int n) { 
		dp[0] = 0;  //N이 0일 때 방법 0
		dp[1] = 1;  //N이 1일 때 방법 1
		dp[2] = 2; //N이 2일 때 방법 2
		dp[3] = 3; //N이 3일 때 방법 3
		dp[4] = 5; // . . .
		dp[5] = 8; //dp[n] = dp[n-2] + dp[n-1]

		
		if(dp[n] == null) { //dp[n]이 null이 아니라면

	
			
			dp[n] = recur(n -1) + recur(n-2); //점화식에 의한 재귀함수
			
			
		
		}
		
		
		return dp[n] % 10007; 
		

		
	}

}