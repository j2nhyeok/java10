import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//B진법 수 N을 10진법으로 출력하는 코드
//ZZZZZ 36 => 60466175
public class Quiz2745 {
	public static String[] alphabet = new String[26]; //A부터 Z까지 알파벳 총 26개를 저장할 문자형 배열 alphabet을 전역변수로  선언.
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		String N = st.nextToken();  //B진법 수 N
		int B = Integer.parseInt(st.nextToken()); //B진법.
		
		for(int i = 0; i < alphabet.length; i++ ) { // 알파벳 배열에 순서대로 A,B,C ...Z 저장 하는 반복문
			alphabet[i] = String.valueOf((char)(i + 65)); //A의 아스키 코드가 65, Z의 아스키코드가 90이므로 i의 값에 65를 더한 뒤 문자형으로 변환 후 alphabet 배열에 저장
		}
		//alphabet[0] = 'A', alphabet[1] = 'B', alphabet[2] = 'C', alphabet[3] = 'D', alphabet[4] = 'E'
		
		System.out.println(alphabet[0]);
		
	}
	
	public static int change_10(String N , int B) {
		if( B <= 10) {
			for(int i = 0; i < N.length() ; i++ ) {
				change_10((String)( B * Integer.valueOf(N.charAt(i)) + Integer.valueOf(N.charAt(i + 1)), B);
			}
		}else {
			alphabet.
		}
		
		
		return 0;
	}
}
