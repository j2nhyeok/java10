import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz1373 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
		StringBuilder sb = new StringBuilder(); //여러 문자열의 결합하여 정답 문자열을 만들기 위해 StringBuilder 사용
		
		String binary = bf.readLine(); //2진수 값을 문자열로 입력 받음. 
		
		if (binary.length() % 3 == 1) { //만약 문자열로 입력한 2진수의 길이가 3으로 나눴을 때 나머지가 1이라면,  예) 1|000
			sb.append(((int)binary.charAt(0) - 48) * 1); //이진수 맨 앞 값을 숫자 '0'의 아스키 코드 값(48)을 뺴서 숫자로 만든 뒤 *1을 하여 정답 문자열인 sb에 추가.  1 * 1 = 1 
		}
		
		else if(binary.length() % 3 == 2) { // 만약 문자열로 입력한2진수의 길이가 3으로 나눴을 때 나머지가 2라면, 예) 11|000 
			sb.append(((int)binary.charAt(0) - 48) * 2 + ((int)binary.charAt(1) - 48) * 1);
			//이진수 맨 앞 값과 이진수 앞에서 두 번째 값을 숫자 '0'의 아스키 코드 값(48)을 빼서 숫자로 만든 뒤 *2, *1을 하여 두 값을 더한 뒤 정답 문자열인 sb에 추가.  (1 * 2 = 2) + (1 * 1 = 1) = 3을 저장  
		}
		
		
			for(int i = binary.length() % 3 ; i < binary.length(); i+=3) { // 위의 코드를 거친 뒤 for문 반복 3자리 수씩 끊어서 계산
				sb.append(((int)binary.charAt(i) - 48) * 4 + ((int)binary.charAt(i + 1) - 48) * 2 + ((int)binary.charAt(i + 2) - 48) * 1);	
				//3자리씩 끊었을 때 첫 번째 수가 1일 때 4, 0일 때  0  + 두 번째 수가 1일 때 2, 0일 때  0 + 세 번째 수가 1일 때 1, 0일 때  0
			}
		

		
		System.out.println(sb);
	}

}
