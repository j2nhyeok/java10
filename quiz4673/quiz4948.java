import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz4948 {
	public static boolean prime[]; // 소수를 저장할 boolean형 전역 변수 선언
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader를 사용하여 값을 입력 받음
	 StringBuilder sb = new StringBuilder(); //값을 출력하기 위해 StringBuilder 사용
	 
	 while(true) { //입력 마지막에 숫자 0을 입력하기 전까지 숫자를 입력 받아야 하므로 무한 루프 
		 int n = Integer.parseInt(bf.readLine()); //1 ≤ n ≤ 123,456, 숫자 n입력
		 
		 if (n == 0) { //문제에 n이 0일 경우 입력을 종료하라고 하였으므로
			 break; //반복문 탈출
		 }
		 
		 int cnt = 0; //소수의 개수를 저장해줄 cnt변수 선언 후 0으로 초기화
		 prime = new boolean[2*n +1 ]; //전역 변수로 선언해논 prime의 크기 지정 
		 get_prime(); //get_prime함수 불러오기
		 
	
		 for(int i = n + 1 ; i <= 2*n ; i++ ) { //문제가 n초과, 2n이하이므로 그에 맞는 범위 설정
			if(prime[i] == false) { //prime[i]가 false(소수)라면 
				cnt++;   //소수의 개수를 나타내는 cnt의 개수 하나씩 증가
			}
		 }
		 sb.append(cnt).append("\n"); //sb에 소수 개수를 추가 한 뒤 개행문자 추가
		 
	 }
	 System.out.println(sb); // 정답 출력
	}

		
	
	public static void get_prime() {
		prime[0] = true; //숫자 0 과 1 은 소수가 아니므로 false에서 true로 변환
		prime[1] = true;
		
		//에라토스테네스의 체
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}
