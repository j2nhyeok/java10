import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz1149 {
	public static int dp[][];
	public static int price[][];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
		int N = Integer.parseInt(bf.readLine());
		
		dp = new int[N+1][4];
		price = new int[N+1][4];
		
		for(int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
			price[i][1] = Integer.parseInt(st.nextToken()); // 빨강색 페인트 가격
			price[i][2] = Integer.parseInt(st.nextToken()); // 초록색 페인트 가격
			price[i][3] = Integer.parseInt(st.nextToken()); // 파랑색 페인트 가격
			
		}
		
		System.out.println(minimum_price(N));
		}
	}
	public static int minimum_price(int N) {
		for(int i = 1; i <= 3 ; i++) {
			dp[1][i]= price[1][i];
		}
		
		if(dp[N][1] == 0 && dp[N][2] == 0 && dp[N][3] == 0) {
			for(int i = 2; i <= N ; i++) {
				dp[i][1] = Math.min(dp[ i - 1 ][2] , dp[ i - 1 ][3]) + price[i][1];
				dp[i][2] = Math.min(dp[ i - 1 ][1] , dp[ i - 1 ][3]) + price[i][2];
				dp[i][3] = Math.min(dp[ i - 1 ][1] , dp[ i - 1 ][2]) + price[i][3];
			}
		}
		
		return Math.min(Math.min(dp[N][1], dp[N][2]), dp[N][3]);
}
}
