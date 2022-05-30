import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz1212 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
		StringBuilder sb = new StringBuilder(); //여러 문자열의 결합하여 정답 문자열을 만들기 위해 StringBuilder 사용
		
		String octo = bf.readLine(); //문자열로 8진수를 입력받음 . 10진수로 8^333334 의 값이 나올 수 있어 숫자 변수를 사용할 수 없다.
		
		
		if(octo.equals("0")) System.out.println(0); //만약 8진수로 0이 입력되었을 때, 0을 출력하고 프로그램 종료 (문제조건 : 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.)
		
		else { //만약 입력된 8진수가 0 이 아닐 때 
		
		String num[] = octo.split(""); //각 자리를 분리하여 문자열 배열 num에 순서대로 저장
		
		for( int i  = 0; i < num.length; i++) {	 //num배열 길이만큼 반복문 실행
			int n = Integer.parseInt(num[i]); //num배열에 있는 문자열로 된 숫자를 정수형으로 변환 한 뒤 정수형 변수 n에 저장
			
			switch(n) { //8진수는 0~7밖에 표현 못하므로 n의 값에 따라 해당 문자열을 정답 문자열 sb에 추가한 후 switch문 탈출
			case 0:  
				sb.append("000"); break;
			case 1:
				sb.append("001"); break;
			case 2:
				sb.append("010"); break;
			case 3:
				sb.append("011"); break;
			case 4:
				sb.append("100"); break;
			case 5:
				sb.append("101"); break;
			case 6:
				sb.append("110"); break;
			case 7:
				sb.append("111"); break;
		
			}
			
			
		}
		//문제 조건에서 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다고 하였으므로 정답 문자열 앞쪽에 있는 0을 전부 제거
		while(sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
			
		
		

		
		
		
		
		
		
		System.out.println(sb);
	
		}
	}
}
