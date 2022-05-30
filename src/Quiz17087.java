import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz17087 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
		StringTokenizer st = new StringTokenizer(bf.readLine(), " "); // 한 줄로 공백을 기준으로 N과 S를 입력 받아 공백으로 분리 한 후 st에 문자열을 순서대로 저장
		
		int N = Integer.parseInt(st.nextToken());  //첫째 줄에 N(1 ≤ N ≤ 10^5),  동생 N명
		int S = Integer.parseInt(st.nextToken()); //  S(1 ≤ S ≤ 10^9), 수빈이는 현재 점 S에 있다.
		
		int position_difference[] = new int[N]; //현재 수빈이의 위치(S)와 N명의 동생들의 위치 차이를 저장해줄 정수형 배열 position_difference 선언
		
		st = new StringTokenizer(bf.readLine(), " "); //N명의 동생들의 현 위치를 공백을 기준으로 한 줄로 입력 받아 공백으로 분리 한 후 st에 문자열을 순서대로 저장
		
		
		for(int i = 0; i < N; i++) { // 동생의 수 N만큼 반복문 실행
			position_difference[i] = Math.abs( S - Integer.parseInt(st.nextToken())); //각각의 동생 위치에서 수빈이의 위치를 뺀 절대값을 position_difference[] 에 저장
		}
		
		if(N == 1) System.out.println(position_difference[0]); //만약 동생이 한 명 뿐이라면 동생위치에서 수빈이 위치를 빼준 값을 출력해주면 끝
		
		else { // 동생이 한 명이 아닌 2명 이상이라면
			int gcd = position_difference[0]; //첫 번째 동생과 수빈이 위치의 차를 최대공약수를 나타내는 gcd변수에 넣고
			for(int i = 1; i <  N; i++) {
				gcd = GCD(gcd, position_difference[i]); //최대공약수를 return해주는 GCD()함수에 값을 넘겨준 뒤 return값을 다시 gcd에 재저장. 
			}
			System.out.println(gcd); // 최종적으로 나온 gcd가 정답 == D
		}
		}
	
	public static int GCD(int num1, int num2) {    //두 정수의 최대 공약수를 구해주는 함수
		int bigger_number = Math.max(num1, num2); // 최대공약수를 구할 두 정수 중 큰 값을 정수형 변수 bigger_number 에 저장.
		int smaller_number = Math.min(num1, num2); //최대공약수를 구할 두 정수 중 작은 값을 정수형 변수 smaller_number 에 저장.
		int moduler = 1; //최대 공약수를 구할 두 정수 중 큰 값을 나머지 값으로 나눴을 때의 나머지를 저장할 moduler 선언 후 1로 초기화
		
		  while(moduler != 0) { // moduler가 0이 아니면
		         moduler = bigger_number % smaller_number; // 두 정수 중 큰 수에서 작은 값을 나눈 나머지를 moduler에 저장하고
		         
		         if(moduler != 0) {  //만약 그 moduler가 0이 아니라면
		            bigger_number = smaller_number; //큰 수에 작은 수의 값을 저장하고
		            smaller_number = moduler; //작은 수에 나머지 값인 moduler 를 저장하고  다시 위로 올라가서 while문 실행. 언제까지? moduler가 0이 될 때 까지.;
		         }else {  // 결국 moduler가 0이 되었다면
		        	 break; // smaller_number의 값이 최대 공약수라는 말이므로 while 문 탈출
		         }
		         
		      }
				return smaller_number;
	}

}
