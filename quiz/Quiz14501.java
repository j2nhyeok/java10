import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz14501 {
	public static int N;
	public static int time[];
	public static int price[];
	public static int maxValue = Integer.MIN_VALUE;
	public static int start;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//첫째 줄에 N (1 ≤ N ≤ 15)이 주어진다.
		 N = Integer.parseInt(bf.readLine());
		time = new int[N+1];
		price = new int[N+1];
		for(int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
				time[i] = Integer.parseInt(st.nextToken());
				price[i] = Integer.parseInt(st.nextToken());		
		}
	
			solve(1,0);
			
		
		System.out.println(maxValue);
		
	}
	
	public static void solve(int timeSum, int priceSum) {
		if(timeSum == N ) {
			if(time[N] == 1) {
				priceSum += price[N];
				maxValue = Math.max(priceSum, maxValue);
			}
			else {
				maxValue = Math.max(priceSum, maxValue);
			}
			
			return;
		}
		
	
		
		
		for(int i = timeSum ; i <= N; i++ ) {
			
				
				solve( i + time[i],  priceSum +  price[i]);
				solve(i + 1, priceSum);
		
			}
		}
	}
	


