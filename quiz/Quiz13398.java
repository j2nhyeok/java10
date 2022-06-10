import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz13398 {
	public static int numbers[];
	public static int dp[];
	public static int remove_sums[];
	public static int n;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		 n = Integer.parseInt(bf.readLine());
		
		numbers = new int[n + 1];
		dp = new int[n + 1];
		remove_sums = new int[n + 1];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		
		for(int i = 1;i <= n ; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		int all_sum = NoRemoveMaxSum(n); //all_sum은 아무것도 제거하지 않았을 때의 가장 큰 합.
		
		for(int i = 1; i <= n ; i++) {
			int a = numbers[i];
			numbers[i] = 0;
			remove_sums[i] = NoRemoveMaxSum(n);
			numbers[i] = a;
		}
		

		Arrays.sort(remove_sums);
		
		System.out.println(Math.max(all_sum, remove_sums[n]));
	}
	
	public static int NoRemoveMaxSum(int n) {
		dp[1] = numbers[1];
		
		int cnt = 0;
		for(int i = 1;i <= n; i++) {
			if(numbers[i] <= 0 ) {
				cnt++;
			}
		}
		
		if( cnt == n) {
			Arrays.sort(numbers);
			return numbers[n - 1];
		}
		
		for(int i = 2; i <= n; i++) {
			dp[i] = Math.max(dp[i - 1] + numbers[i], numbers[i]);
		}
		
		Arrays.sort(dp);
		
		return dp[n];
	}
	

}
