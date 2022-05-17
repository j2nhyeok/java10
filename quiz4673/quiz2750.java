import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class quiz2750 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용

		
		int N = Integer.parseInt(bf.readLine()); //첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
		int[] numbers = new int[N]; //N개의 정수를 저장 해 줄 정수형 배열 numbers 선언.
		
		for(int i = 0 ; i < N; i++) { //N의 개수만큼 for문 반복
			numbers[i] = Integer.parseInt(bf.readLine()); //둘째 줄부터 N개의 줄에는 수 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다. N개의 정수를 입력 받아 numbers 배열에 순서대로 저장.
		}
		
		  Arrays.sort(numbers); //숫자가 저장된 numbers배열을 오름차순으로 정렬
		  
		  for(int j =0; j<N; j++) { //반복문을 이용하여 오름차순으로 정렬된 numbers 배열을 출력
			  System.out.println(numbers[j]);
		  }
	}

}