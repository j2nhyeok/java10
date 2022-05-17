import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class quiz2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력 받기 위해 BufferedReader 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //값을 출력 하기 위해 BufferedReader 사용
		
		
		int N = Integer.parseInt(bf.readLine()); //첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
		Integer[] numbers = new Integer[N]; // N개의 정수를 저장 해줄 크기가 N인 Integer형 배열 numbers 선언. 
		
		for(int i = 0 ; i < N; i++) { //정수의 개수 N만큼 반복문 실행
			numbers[i] = Integer.parseInt(bf.readLine()); //정렬을 할 숫자들의 반복문을 돌려 입력한 후 순서대로 numbers배열에 저장.
		}
		
		  Arrays.sort(numbers); //numbers 배열을 sort()를 사용해서 오름차순으로 정렬
		  
		  for(int j = 0 ; j < N ; j++) { //for문을 돌려
			  bw.write(String.valueOf(numbers[j])); //오름차순으로 정렬 된 numbers 배열을 출력. bw.write는 문자열만 출력할 수 있기에 정수형을 문자열로 변환
			  bw.newLine(); //개행 문자 
		  }

bw.flush();
bw.close();

	}
}