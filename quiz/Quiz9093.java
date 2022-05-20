import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Quiz9093 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 값을 입력하기 위하여 BufferedReader 사용
		StringBuilder sb = new StringBuilder(); //문자열을 결합한 뒤 정답을 출력하기 위하여 StringBuilder 사용
		StringTokenizer st; 

		int T = Integer.parseInt(bf.readLine()); //첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
		
		for(int i = 0; i < T ; i++) { //테스트의 케이스의 개수 T만큼 for문 실행
			st = new StringTokenizer(bf.readLine(), " "); // 문자열로 영어 문장을 입력받아 공백으로 단어들을 분리한 후 st에 저장
			
			while(st.hasMoreTokens()) { // st에 토큰 값이 있을 경우 = true -> while문 실행, st의 토큰 값을 모두 사용하고 남아있는 토큰 값이 없을 경우 false -> while문 실행 stop
			
				sb.append(new StringBuilder(st.nextToken()).reverse().toString()).append(" "); //토큰 (=영단어)를 거꾸로 만든 뒤 sb에 추가하고 공백 추가
			}
			sb.append("\n"); //영단어로 이루어진 문장 한 줄을 거꾸로 만들었으면 다음 문장과 구별하기 위해 개별문자 추가
		}
		
		
		
		System.out.println(sb); //정답출력
	}
}
