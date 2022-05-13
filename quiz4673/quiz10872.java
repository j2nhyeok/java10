import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz10872 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위해 BufferedReader 사용
		
		int N = Integer.parseInt(bf.readLine()); //N값 입력.  첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
		int answer = factorial(N); //factorial함수 호출
		
		System.out.println(answer); //정답 출력
	}
	public static int factorial(int N) {
		if(N <= 1) return 1; //N이 0, 1 일 경우 return값으로 1을 return.
		
		return N * factorial(N-1); //문제 카테고리가 재귀함수 이기에 재귀함수 사용
	}

}
