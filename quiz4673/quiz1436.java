import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위해 BufferedReader 사용
		int N = Integer.parseInt(bf.readLine()); //N은 10,000보다 작거나 같은 자연수 , N번째 영화의 제목의 N 입력
		int cnt = 0; //정수형 변수 cnt를 선언 후 0으로 초기화.
		 for(int i = 666; i <Integer.MAX_VALUE; i++) { //i는 666부터 integer형 최대 정수값까지 for문 반복. 666부터 시작하는 이유는 정수중 666이 들어가는 최소 정수가 666이기 때문에
			 String i2 = String.valueOf(i); //정수 값 i를 문자열 형으로 변환 후 문자열 변수 i2에 저장. 문자열로 바꾸는 이유는 숫자에 666이 들어가나 확인 하기 위해서.
			 if(i2.contains("666")) { //문자열로 변환한 숫자 i2에 문자열 666이 들어간다면,
				 cnt++; //cnt를 1 추가
			 }
			 
			 if(cnt == N) { //만약 cnt가 N과 같아질 때
				 System.out.println(i2); //i2를 출력 시키고
				 break; //바로 반복문 탈출.
			 }
					 
		 }
	}

}