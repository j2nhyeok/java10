import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz11005 {
	//A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
	
	public static StringBuilder sb = new StringBuilder(); //정답 문자열인 sb를 전역변수로 선언
	public static char[] alphabet = new char[26]; //A부터 Z까지 알파벳 총 26개를 저장할 문자형 배열 alphabet을 전역변수로  선언.
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력하기 위한 BufferedReader 사용
		StringTokenizer N_B = new StringTokenizer(bf.readLine(), " "); //문자열 한 줄로 N값과 B값을 입력 받은 후 공백을 기준으로 분리한 후 N_B에 저장.
		
		int N = Integer.parseInt(N_B.nextToken()); //N_B의 첫 번째 토큰 값을 정수형으로 변환 후 정수형 변수 N에 저장. N은 10억보다 작거나 같다.
		int B = Integer.parseInt(N_B.nextToken()); //N_B의 첫 번째 토큰 값을 정수형으로 젼환 후 정수형 변수 B에 저장. 2 ≤ B ≤ 36
		
		for(int i = 0; i < alphabet.length; i++ ) { // 알파벳 배열에 순서대로 A,B,C ...Z 저장 하는 반복문
			alphabet[i] = (char)(i + 65); //A의 아스키 코드가 65, Z의 아스키코드가 90이므로 i의 값에 65를 더한 뒤 문자형으로 변환 후 alphabet 배열에 저장
		}
		
		change_N(N, B); //B진법으로 변환 문자열 값을 return해주는 change_N()메서드에 인자값으로 N, B넘겨줌.
		
		
		System.out.println(sb.reverse()); //정답 == return 받은 sb를 reverse하여 출력

	}
	
	public static StringBuilder change_N(int N, int B) { // N진법으로 변환 해주는 메서드
		
		while( N / B != 0) { //N을 B로 나눴을 때 0이 되면 while문 종료
			if( 10 <=  N % B && N % B <= 35) { // 만약 N % B가 10이상 35이하라면
			sb.append(alphabet[ N % B - 10]);  //값에 대응 하는 알파벳을 정답 문자열 sb에 추가
			}
			
			else { // 만약 N % B가 10이상 35이하가 아니라면 == 0이상 9이하라면
				sb.append(N % B); //숫자 그대로를 sb에 추가
			}
			N /= B; // N / B 값을 N에 재저장
		} //while문 종료
		
		if(N < 10) //while문 종료 후 N이 10이하라면
		sb.append(N); //숫자 그대로 sb에 마지막으로 추가
		else sb.append(alphabet[ N % B - 10]); //while문 종료 후 N이 10이상이라면 숫자에 대응하는 알파벳을 sb에 마지막으로 추가
		
		return sb; //완성된 sb를 return
	}
}
