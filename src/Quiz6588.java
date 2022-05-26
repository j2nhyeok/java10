import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Quiz6588 {
	static boolean prime[] = new boolean[1000001]; //에라토스테네스의 체를 사용하기 위해 크기가 1000001인 boolean형 배열 선언 후 false로 초기화
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
		StringBuilder sb = new StringBuilder(); //문자열을 결합하여 정답 문자열인 sb을 만들기 위해 StringBuilder 사용
		
		int n = 0; //정수형 변수 n선언 후 0으로 초기화. 짝수 정수 n입력 때 사용할 예정
		get_prime(); //에라토스테네스의 채를 불러냄. 즉 1000000까지의 자연수 중 소수인 것과 소수가 아닌 수를 나눠준 함수를 호출
		
		while( (n = Integer.parseInt(bf.readLine())) != 0) { //n은 짝수 정수. 만약 0을 입력하면 입력이 끝났다는 의미 ( 문제의 조건 : 입력의 마지막 줄에는 0이 하나 주어진다.)
			int a = 2; //소수중 가장 작은 수인 2를 정수형 변수 a에 저장.   n을 만들 수 있는 방법이 여러 가지라면, b-a가 가장 큰 것을 출력하므로 이 때 사용할 예정
			int b = n - a; //n에서 a를 뺀 숫자를 정수형 변수 b에 저장.
			
			while(true) { //break;를 만나기 전까지 무한 루프
			if(!prime[a] && !prime[b] && a + b == n) { //a의 값이 소수이고, b의 값도 소수이고, a + b 의 합친 값이 n일 때
				break; //while 반복문 탈출
			}
			
			//위의 if 조건문을 만족하지 못했을 경우
			a++;  //a에 1을 더하고
			b--;  //b에 1을 빼준다.
			
			}
			
			if( a == n) { //만약 a가 n과 같으면 == 두 홀수 소수의 합으로 n을 나타낼 수 없는 경우
				sb.append("Goldbach's conjecture is wrong.").append("\n"); //정답 문자열에 "Goldbach's conjecture is wrong."를 추가하고 개행문자를 추가한다.
			}else { //만약 a가 n과 같지 않으면
			sb.append(n + " =" + " " + a + " " + "+" + " " + b).append("\n"); //정답 문자열에 정답 추가
			}
			
		}
		System.out.println(sb);
	
	}
	
	public static void get_prime() {
		prime[0] = true; //0은 소수가 아니므로 false에서 true로 변경
		prime[1] = true; //1은 소수가 아니므로 false에서 true로 변경
		
		for(int i =2 ; i<= Math.sqrt(prime.length); i++) {
			if(prime[i])  continue; //만약 이미 prime[i]의 값이 소수여서 true로 바껴있다면, continue해서 다음 for문 진행.
			for(int j = i * 2 ; j < prime.length; j += i) { //
				prime[j] = true; //소수가 아닐경우 true로 변환
			}
		}
	}

}

