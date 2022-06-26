import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz14501_2 {
	public static int N;
	public static int dp[];
	public static int tp[][];
	public static int maxValue = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//첫째 줄에 N (1 ≤ N ≤ 15)이 주어진다.
		 N = Integer.parseInt(bf.readLine());
		 
		 tp = new int[N + 1][2];
		 dp = new int[N + 1];
		 
		 for(int i = 1; i <= N; i++) {
			 StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			 tp[i][0] = Integer.parseInt(st.nextToken());
			 tp[i][1] = Integer.parseInt(st.nextToken());
		 }
		 
		 System.out.println(maxPrice());
		 
	}
	
	
	
		
		
	public static int maxPrice() {
		dp[0] = 0;
		for(int i = 1; i <= N; i++) {
			 if(i + tp[i][0] <= N + 1) {
				for(int j = 0; j < i ; j++) {
					if(j + tp[j][0] <= i) {
						dp[i] = Math.max(dp[i], dp[j] + tp[i][1]);
					}
				}
			}
			
			maxValue = Math.max(dp[i], maxValue);
		}
		return maxValue;
	}

}
