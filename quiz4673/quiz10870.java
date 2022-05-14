import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz10870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine()); //첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
		
		int answer = Fibonacci(n);  //재귀 함수 호출 후 answer에 저장

		System.out.println(answer); //정답 출력
	}
	
	public static int Fibonacci(int n) { //Fibonacci를 구해줌
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return Fibonacci(n - 2) + Fibonacci(n-1);
	}
}
