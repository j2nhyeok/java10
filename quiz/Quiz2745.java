import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//B진법 수 N을 10진법으로 출력하는 코드
//ZZZZZ 36 => 60466175
public class Quiz2745 {
	public static char[] alphabet = new char[26]; //A부터 Z까지 알파벳 총 26개를 저장할 문자형 배열 alphabet을 전역변수로  선언.
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 값을 입력받기 위하여 BufferedReader 사용
	
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " "); // 한 줄로 N과 B를 입력받아 공백을 기준으로 분리한 후 순서대로 st에  저장.
		
		String N = st.nextToken();  //B진법 수 N 
		int B = Integer.parseInt(st.nextToken()); //B진법.     (2 ≤ B ≤ 36)
		
		int ans = 0;  //B진법 수 N을 10진법으로 변환하였을 떄의 값을 나타내는 정수형 변수 ans선언 후 0으로 초기화
		
		for(int i = 0; i < N.length(); i++) { //문자열 N길이 만큼 for문 반복
			if(65 <= (int)N.charAt(i) && (int)N.charAt(i) <= 90) { //현재 문자가 알파벳 문자일때.  'A'의 아스키 코드가 65, 'Z'의 아스키 코드가 90이다.
			ans += ((int)N.charAt(i) - 55) * Math.pow(B, (N.length()-1) - i); 
			} else if(48 <= (int)N.charAt(i) && (int)N.charAt(i) <= 57) { //현재 문자가 숫자일 경우 
				ans += ((int)N.charAt(i) - 48) * Math.pow(B, (N.length()-1) - i);
			}
		}
		System.out.println(ans);
		
	}
	
	
}
