import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz10824 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " "); // 네 자연수를 공백을 기준으로 문자열 한 줄로 입력받은 후 공백을 기준으로 분리하여 st에 저장
		String num1 = st.nextToken() + st.nextToken(); //st에 앞에 있는 두 문자열로 된 숫자(A, B)를 결합하여 문자열형 변수 num1에 저장 == A의 뒤에 B를 붙이는 것
		String num2 = st.nextToken() + st.nextToken(); //st에 앞에 있는 두 문자열로 된 숫자(C, D)를 결합하여 문자열형 변수 num2에 저장 == C의 뒤에 D를 붙이는 것
		
		System.out.println(Long.parseLong(num1) + Long.parseLong(num2)); //int가 아닌 Long으로 해준 이유가 A,B의 값이 최대 범위인 1,000,000이라면
																		//문자열 num1이 "10000001000000"이 되므로 계산을 위해 정수형으로 바꿔야 하는데
																		//int는 범위에서 벗어나기 때문에 long을 썼다.

	}

}
