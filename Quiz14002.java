
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Quiz14002 {
	 public static int dp[];  //
	 public static int numbers[];
	 public static void main(String[] args) throws NumberFormatException, IOException {
		  
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 Stack <Integer> stack = new Stack<>();

		      
		     
		 int N = Integer.parseInt(bf.readLine()); // ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000)
		 dp = new int[N]; 
		 numbers = new int[N];
		      
		 StringTokenizer st = new StringTokenizer(bf.readLine(), " "); 
		      
		 for(int i  = 0; i < N ; i++) {
		      numbers[i] = Integer.parseInt(st.nextToken()); 
		      dp[i] = 1; 
		 }
		 
	
		 int ans = length(N);
		 System.out.println(ans);
		 
		 
		 //���� �� �����ϴ� �κ� ������ ����ϴ� ����.  == ������ 
		 
		 for(int i = N - 1; 0 <= i ; i-- ) {
			 if(ans == dp[i]) {
				 stack.push(numbers[i]);
				 ans--;
			 }
		 }
		 
		 int a = stack.size();
		 for(int i  = 0 ; i < a; i++) {
			 System.out.print(stack.pop() + " ");
		 }

	 }
	 public static int length(int n) {
	
		for(int j = 1; j < n; j++) { 
		
			for(int i = 0 ; i < j ; i++) {
				
		if(numbers[i] < numbers[j] && dp[j] < dp[i] + 1 ) {
			 dp[j] = dp[i] + 1;
		
		}
		
		}
	
			
	}
	
	int max = -1; // ���� A�� ���� �� �����ϴ� �κ� ������ ���̸� ����ϴ� ����
	for(int i = 0 ; i < n; i++) {
		if(max < dp[i]) {
			max = dp[i];
		}
	}
		
		
		 return max;
	 }
}