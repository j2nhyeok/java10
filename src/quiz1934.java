import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class quiz1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
		StringBuilder sb = new StringBuilder();  //문자열을 결합하여 정답 문자열인 sb을 만들기 위해 StringBuilder 사용
		
		int T = Integer.parseInt(bf.readLine()); //첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)
		
		for(int j = 0 ; j < T; j++) { //테스트 개수T만큼 반복문 실행
		StringTokenizer st = new StringTokenizer(bf.readLine(), " "); //한 줄로 두 개의 자연수를 입력받아 공백으로 분리한 후 st에 순서대로 저장
		 
		int num1 = Integer.parseInt(st.nextToken());  //st의 첫 번째 토큰을 num1에 저장
		int num2 = Integer.parseInt(st.nextToken()); //st의 첫 번째 토큰을 num2에 저장
		
		int max = 0; //max는 최대 공약수
		int min = 0; //min은 최소 공배수
		
		
		for(int i = 1; i <= Math.min(num1, num2); i++) { //num1과 num2 중 작은 값 만큼 반복문 실행
			if(num1 % i == 0  && num2 % i == 0) {
				max = i; //num1과 num2를 i로 나누었을 때 둘다 나머지가 0이 되게하는 i중 최대값이 최대 공약수가 되는 거임
			}
		}
		min = max * (num1 / max) * (num2 / max); //최소 공배수 = 최대 공약수 * (num1을 최대공약수로 나눴을 때의 몫) * (num2를 최대공약수로 나눴을 때의 몫)
		sb.append(min).append("\n");
	}
		System.out.println(sb);
	}
}