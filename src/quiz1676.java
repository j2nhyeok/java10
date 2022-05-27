import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;



public class quiz1676 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용

		int N = Integer.parseInt(bf.readLine()); //0 <= N <= 500
		int cnt = 0; //N!의 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 count를 저장할 cnt변수 선언 후 0으로 초기화
		
		BigInteger factorial_value = new BigInteger("1"); // 밑에서 BigInteger로 계산 할거기 때문에 sum도 BigInteger로 선언후 factorial_value값으로 1을 저장.
		
		
		for(int i  = 2 ; i <= N; i++) { //2부터 N까지 반복문 실행 (1은 이미 위에서 sum으로 넣어 줬기 때문)
			factorial_value = factorial_value.multiply(BigInteger.valueOf(i)); // 1부터 순서대로 N까지 팩토리얼을 계산하여 sum 변수에 저장.
		}
		
	String number = String.valueOf(factorial_value);  //밑에서 N!의 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수 구해주기 위하여 factorial_value를 문자열로 형 변환
	
	
		for(int i = number.length() - 1 ; 0 <= i ; i--) {	//뒤에서부터 갯수를 세어줘야 하므로 i를 문자열의 맨 끝 인덱스로 설정
			if(number.charAt(i) == '0') { // 만약 현재문자가 '0'과 같다면
				cnt++; // 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 1씩 증가
			}else { // 만약 현재문자가 '0'이 아니라면
				break;  //for문 탈출
			}
		}
		
		System.out.println(cnt); //정답 출력
		
	}

}