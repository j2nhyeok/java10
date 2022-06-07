import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz1912 {
	public static int numbers[]; // 둘째 줄에 입력 될 n개의 정수를 저장할 numbers 배열을 전역 변수로 선언
	public static int dp[]; // 동적 계획법을 사용하기 위한 dp배열을 전역 변수로 선언
							// dp배열은 1번째 숫자부터 i번째 숫자까지 더한 값을 저장할 예정.
	   						// ex) dp[3] == 1번째 숫자 + 2번째 숫자 + 3번째 숫자.
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine()); // 첫째 줄에 정수 n(1 ≤ n ≤ 100,000)
		
		//N + 1만큼 numbers, dp 배열 크기 할당
		numbers = new int[N + 1];
		dp = new int[N + 1]; 

		// 둘째 줄에는 n개의 정수로 이루어진 수열 입력.   수는 -1,000보다 크거나 같고, 1,000보다 작거나 같은 정수
		StringTokenizer st = new StringTokenizer(bf.readLine(), " "); 
		
		for(int i = 1 ; i  <= N ; i++) { //이비력된 정수 수열을 numbers 배열에 순서대로 저장
			numbers[i] =Integer.parseInt(st.nextToken());
		}
		
		System.out.println(max_sum(N)); //max_sum 메서드를 호출하여 인자값으로 N을 넘겨 준뒤 return 값 출력 == 정답.
		
	}
	public static int max_sum(int n) {
		dp[0] = numbers[0] = 0; //dp[0], numbers[0]은 아무 의미 없는 값인 0 입력.
		dp[1] = numbers[1];     // 1번째 숫자부터 1번째 숫자까지의 합을 뜻하는 dp[1]은 numbers[1] 값과 같다.
		
		// 입력된 정수가 모두 0보다 작거나 같을 때
		int cnt = 0;
		for(int i = 1; i <= n; i++) {
			if(numbers[i] <= 0) {
				cnt++;
			}
		}
		
		if(cnt == n) { //위의 for문을 돌려 cnt가 = n이라면 입력된 정수가 0보다 작거나 같다는 뜻.
			Arrays.sort(numbers); 
			return numbers[n];
		}
		
		
		for(int i = 2; i <= n ; i++) {
			dp[i] = Math.max(dp[i - 1] + numbers[i], numbers[i]);
		}
		
		Arrays.sort(dp); // 배열을 오름차순 정렬
		
		return dp[n]; // 오름차순된 배열을 제일 마지막 요소 값이  연속된 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합
	}

}