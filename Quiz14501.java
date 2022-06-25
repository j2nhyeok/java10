import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz14501 {
	public static int N;
	public static int period[];
	public static int price[];
	public static int minValue = Integer.MAX_VALUE;
	public static boolean visited[];
	public static int start;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//첫째 줄에 N (1 ≤ N ≤ 15)이 주어진다.
		 N = Integer.parseInt(bf.readLine());
		period = new int[N+1];
		price = new int[N+1];
		visited = new boolean[N+1];
		for(int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
				period[i] = Integer.parseInt(st.nextToken());
				price[i] = Integer.parseInt(st.nextToken());		
		}
		
		solve(1,0);
		
		System.out.println(minValue);
		
	}
	
	public static void solve(int periodSum, int priceSum) {
		if(periodSum > N) {
			
			minValue = Math.min(priceSum, minValue);
			
			
			return;
		}
		
		
		for(int i = periodSum ; i < N; i++ ) {
			if(!visited[i]) {
				visited[i] = true;
				periodSum = i + period[i];
				priceSum += price[i];
				solve(periodSum, priceSum);
				visited[i] = false;
			}
		}
	}
	

}
