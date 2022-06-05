import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Quiz15990 {
	 public static int dp[];
	 public static int numbers[];
	 public static void main(String[] args) throws NumberFormatException, IOException {
		     
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 Stack <Integer> stack = new Stack<>();

		      
		     
		 int N = Integer.parseInt(bf.readLine());
		 dp = new int[N];
		 numbers = new int[N];
		      
		 StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		      
		 for(int i  = 0; i < N ; i++) {
		      numbers[i] = Integer.parseInt(st.nextToken()); 
		      dp[i] = 1;
		 }
		 
	
		 int ans = length(N);
		 System.out.println(ans);
		 
		 for(int i = 0 ; i < N; i++) {
			 System.out.print(dp[i] + " ");
		 }
		 System.out.println();
		 for(int i = 0 ; i < N; i++) {
			 System.out.print(numbers[i] + " ");
		 }
		 System.out.println();
	
//-------------문제의 코드는 39------------------정상 값으로 30이 나와야 하는데   -6 이 나옴 -----------------
		 System.out.println(numbers[ Arrays.binarySearch(dp, 4)]);
		 System.out.println(numbers[ Arrays.binarySearch(dp, 2)]);
		 System.out.println(numbers[ Arrays.binarySearch(dp, 1)]);
		 
	System.out.println(numbers[ Arrays.binarySearch(dp, 3)]);
	
//		 for(int i = ans ; 1 <= i ; i--) {
//			 stack.push(numbers[ Arrays.binarySearch(dp, i)]);
//		 }
//		 
//		 int a = stack.size();
//		 
//		 for(int i  = 0 ; i < a; i++) {
//			 System.out.print(stack.pop() + " ");
//		 }

	 }
	 public static int length(int n) {
	
		for(int j = 1; j < n; j++) { 
		
			for(int i = 0 ; i < j ; i++) {
				
		if(numbers[i] < numbers[j] && dp[j] < dp[i] + 1 ) {
			 dp[j] = dp[i] + 1;
		
		}
		
		}
	
			
	}
	int max = -1;
	for(int i = 0 ; i < n; i++) {
		if(max < dp[i]) {
			max = dp[i];
		}
	}
		
		
		 return max;
	 }
}
