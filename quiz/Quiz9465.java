import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	public static int dp[][];
	public static int numbers[][];
	StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i  < T; i++) {
			int N = Integer.parseInt(bf.readLine());
			
			dp = new int[2][N+1];
			numbers = new int[2][N+1];
	
			
			sb.append(max(N)).append("\n");
		 }
		System.out.println(sb);
	}
	
	public static int max(int N) throws IOException {
	
		for(int i = 0 ; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			for(int j = 1 ; j <= N ; j++) {
				numbers[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp[0][1] = numbers[0][1];
		dp[1][1] = numbers[1][1];
		
		if(dp[1][N] == 0) {
		for(int i = 2; i <= N ; i++) {
			dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + numbers[0][i];
			dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + numbers[1][i];
		}
		}

		
		
		
		return Math.max(dp[0][N], dp[1][N]);
	}
}
