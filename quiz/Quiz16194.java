import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz16194 {
	public static Integer dp[] =new Integer[1001]; // 동적 계획법을 사용하기 위해 dp[] 사용. 크기는 0을 포함 하여 1001로 설정
	public static Integer price[]; // 각각의 N개 팩의 가격을 저장할 price[] 배열 선언.
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 값을 입력받기 위하여 BufferedReader 사용
		
		int N = Integer.parseInt(bf.readLine()); // 첫째 줄에 민규가 구매하려고 하는 카드의 개수 N이 주어진다. (1 ≤ N ≤ 1,000)
		StringTokenizer st = new StringTokenizer(bf.readLine(), " "); // Pi 부터 Pn까지 순서대로 입력 후 공백을 기준으로 분리 한 후 st에 저장
		
		price = new Integer[N + 1]; // 젼역변수로 선언 한 price 배열을 N + 1 크기로 할당. N+1크기로 할당 한 이유는
		price[0] = 0; //0개의 카드가 담긴 팩은 없으므로 0의 값을 넣어주고 price[1] == 카드 1개 담긴 팩의 가격,  price[N] == 카드 N개가 담긴 팩의 가격
		
		for(int i = 1; i <= N ; i++) { //price[i]에 카드 i개가 담긴 팩의 가격을 저장.
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		
		System.out.println(min_money(N)); // 카드 N개를 갖기 위해 지불해야 하는 금액의 최솟값을 출력 == 정답

	}
	
	public static int min_money(int n) { // 카드 n개를 갖기위해 지불해야 하는 금액의 최솟값을 출력해주는 메서드
		
		dp[0] = 0; //카드 0개를 갖기 위해 지불해야 하는 금액의 최솟값 == 0원
		dp[1] = price[1]; //카드 1개를 갖기 위해 지불해야 하는 금액의 최솟값  == 카드 1개가 담긴 팩의 금액
		
		
		if(dp[n] == null) { //만약 dp[n]이 null이라면
			int min[] = new int[n/2]; 
			for(int i  = 1 ; i <= n/2; i++) {
			
					min[i-1] = Math.min(price[n], min_money(n - i) + min_money(i));
			
			}
			
			Arrays.sort(min); //오름차순으로 정렬
			
			dp[n]  = min[0]; //dp에 최솟값 저장
		}
		
		
		return dp[n];
	}
}
