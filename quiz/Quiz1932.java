import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static int numbers[][];
	public static int dp[][];
	public static void main(String[] args) throws NumberFormatException, IOException {
		
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	int n = Integer.parseInt(bf.readLine());
	
	numbers = new int[n + 1][n + 1];
	dp = new int[n + 1][n + 1];
	
	
	for(int i  = n ; 1 <= i; i--) {
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		for(int j = 1; j <= n - (i - 1) ; j++) {
			numbers[i][j] = Integer.parseInt(st.nextToken());
	
		}
	}
	for(int i = 1; i <= n; i++) {
		dp[1][i] = numbers[1][i];
	}
	
	if(dp[n][1] == 0) {
	for(int i = 2 ; i <= n; i++) {
		for(int j  = 1; j <=  n - (i - 1); j++) {
			dp[i][j] = Math.max(dp[i-1][j] + numbers[i][j], dp[i-1][j+1] + numbers[i][j]);
		}
	}
        }

	System.out.println(dp[n][1]);
	}

}
