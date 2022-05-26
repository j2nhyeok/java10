import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;



public class quiz1676 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용

		int N = Integer.parseInt(bf.readLine()); //0 <= N <= 500
		int cnt = 0; //N!의 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 count를 저장할 cnt변수 선언 후 0으로 초기화
		
		BigInteger sum = new BigInteger("1"); // 밑에서 BigInteger로 계산 할거기 때문에 sum도 BigInteger로 선언후 sum값으로 1을 저장.
		
		
		for(int i  = 2 ; i <= N; i++) { //N만큼 반복문 실행
			sum = sum.multiply(BigInteger.valueOf(i));
		}
		
	String number = String.valueOf(sum);
	
	
		for(int i = number.length() - 1 ; 0 <= i ; i--) {	
			if(number.charAt(i) == '0') {
				cnt++;
			}else {
				break;
			}
		}
		
		System.out.println(cnt);
		
	}

}