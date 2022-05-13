import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class quiz9020 {
	static boolean prime[]; //소수이면 false, 소수가 아니면 true를 저장할 boolean형 prime 배열을 전역 변수로 선언
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위해 BufferedReader 사용
		StringBuilder sb = new StringBuilder(); //값을 출력할 때 사용하기 위한 StringBuilder
		int T = Integer.parseInt(bf.readLine()); //T는 테스트 개수
		
		for(int i = 0; i < T; i++) { //테스트 개수 T만큼 for문 반복
			int number = Integer.parseInt(bf.readLine()); //4 ≤ number ≤ 10,000

			prime = new boolean[10001]; // 배열의 크기를 10001로 지정. why? 10000이하의 자연수 + 0
			get_prime(); //get_prime()함수 호출
			int A = number / 2; //number가 8이라고 가정. A = 4
			int B = number / 2; //number가 8이라고 가정. B = 4
			
			// number/2의 값에서 A는 1씩 뺴면서 B는 1씩 더하면서 A,B가 둘 다 소수 일 때 그 A,B값이 A-B가 제일 작은 값이다. 
			while(true) {
				if(prime[A] == false && prime[B] == false) { //A와 B가 false(소수)라면
					sb.append(A).append(" ").append(B).append("\n"); //sb에 A " " B \n 을 추가한 뒤
					break; //반복문을 탈출
				}
				A--; //만약 A와 B가 둘다 소수가 아니라면 A--;       A = 7,6,5,4,...
				B++; //만약 A와 B가 둘다 소수가 아니라면 B++;       B = 8,9,10,11,... 
			}

		}
		System.out.println(sb); //정답 출력
	}
//에라토스테네스의 체의 원리
	public static void get_prime(){
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i ) {
				prime[j] = true;
			}
		}
	}
	
}
