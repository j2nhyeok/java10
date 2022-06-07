import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz11053 {
	 public static int dp[]; // 동적 계획법을 사용할 예정.
	 public static int numbers[]; // 둘째 줄에 입력할 정수들을 저장할 numbers배열을 전역 변수로 선언.
	 public static void main(String[] args) throws NumberFormatException, IOException {
		 
		 //값을 입력하기 위해 BufferedReader 사용
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		      
		     
		 int N = Integer.parseInt(bf.readLine()); // 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)
		
		 dp = new int[N]; // dp[] 크기를 N으로 선언.
		 numbers = new int[N]; // numbers[] 크기를 N으로 선언.
		      
		 StringTokenizer st = new StringTokenizer(bf.readLine(), " "); // 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000). 
		                                                               // 한 줄로 입력 받아 공백으로 분리 한 후 st에 순서대로 저장.
		      
		 for(int i  = 0; i < N ; i++) {      // N만큼 반복문 돌림
		      numbers[i] = Integer.parseInt(st.nextToken()); //numbers배열에 st에 저장된 정수를 순서대로 저장 
		      dp[i] = 1; //dp의 모든 요소를 1로 초기화
		 }
		 
	
		 
		 System.out.println(length(N)); // 정답 출력

	 }
	 
	 public static int length(int n) {
		
		for(int j = 1; j < n; j++) { 
		
			for(int i = 0 ; i < j ; i++) {
				
				if(numbers[i] < numbers[j] && dp[j] < dp[i] + 1) {
						dp[j] = dp[i] + 1;
		
				}	
			}
		}
	
		Arrays.sort(dp); // dp배열을 오름차순으로 정렬
		
		
		return dp[dp.length - 1]; // 오름차순으로 정렬한 dp배열의 제일 마지막 요소 값이 가장 긴 증가하는 부분 수열의 길이이므로 이 값을 return.
	 }
}


