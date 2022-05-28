import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz17103 {

	public static boolean prime[] = new boolean[1000001]; //에라토스테네스의 체를 사용하기 위해 boolean형 prime 선언.
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위해 BufferedReader 사용
		StringBuilder sb = new StringBuilder(); // 문자열들을 결합해서 정답 문자열인 sb를 만들기 위해 StringBuilder 사용
		
		int T = Integer.parseInt(bf.readLine()); //첫째 줄에 테스트 케이스의 개수 T (1 ≤ T ≤ 100)
		get_prime(); // 1부터 1000000까지의 수를 소수인지 판별한 함수 호출
		
		for(int i = 0; i < T; i++) { //테스트 케이스의 개수 T만큼 반복문 실행
			int N = Integer.parseInt(bf.readLine()); //N은 짝수이고, 2 < N ≤ 1,000,000
			int cnt = 0; // 골드바흐 파티션의 개수를 나타내는 정수형 변수 cnt 선언 후 0으로 초기화
			
			
			int A = N / 2;
			int B = N / 2;
			
			while(A != 0) { //A는 0이되면 while문 종료
			if(!prime[A] && !prime[B]) cnt++; //A, B 둘다 소수 이면 cnt 1증가
			A--; // 다른 콜드바흐 파티션의 개수를 구해야 하므로 A를 1씩 감소
			B++; // 다른 콜드바흐 파티션의 개수를 구해야 하므로 B를 1씩 증가
			}
			sb.append(cnt).append("\n"); //각 테스트의 골드바흐 파티션의 개수를 sb에 추가
		}
		System.out.println(sb); //정답 문자열  sb
	}
	
	
//에라토스테네스의 체 사용 원리
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length) ; i++) {
			if(prime[i]) continue;
			
			for(int j = i * 2; j < prime.length ; j+= i ) {
				prime[j] = true;
			}
		}
	}
}
