import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class quiz2798 {

	public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력하기 위해 BufferedReader 사용
	String N_M = bf.readLine(); //N값과 M값을 한 줄로 입력받음
	String[] N_M_split = N_M.split(" "); //공백을 기준으로 두 숫자를 분리 후 N_M_split에 순서대로 저장
	ArrayList<Integer> sum = new ArrayList<Integer>(); // 정수형 리스트 sum  선언
	int N = Integer.parseInt(N_M_split[0]); // N(3 ≤ N ≤ 100) //문자열인 N_M_split[0]을 정수형으로 변환 후 int N에 저장.
	int M = Integer.parseInt(N_M_split[1]); //M(10 ≤ M ≤ 300,000) //문자열인 N_M_split[1]을 정수형으로 변환 후 int M에 저장.
	
	int[] numbers = new int[N]; //크기가 N인 numbers 정수형 배열 선언
	
	String numbers1 = bf.readLine();  //100,000을 넘지 않는 양의 정수, 총 N개의 양의 정수 입력
	String[] numbers_split = numbers1.split(" "); //공백을 기준으로 N개의 양의 정수 분리
	for(int i = 0; i < N; i++) {
		numbers[i] = Integer.parseInt(numbers_split[i]);
	}
	
	for(int j = 0 ; j < N-2;j++) {
		for(int k = j+1 ; k<N-1; k++) {
			for(int L = k + 1 ; L <N; L++) {
				if(numbers[j] + numbers[k] + numbers[L] <= M) {
				sum.add(numbers[j] + numbers[k] + numbers[L]); //반복문을 돌려 5장의 카드 중 3장의 카드를 골라 더한 모든 값을 for문을 돌려 sum리스트에 저장
				}
			}
		}
	}
	
	Collections.sort(sum, Collections.reverseOrder()); //sum리스트를 내림차순으로 정렬
	
	System.out.println(sum.get(0)); //sum 리스트의 제일 첫 요소가 M과 가장 가까운 숫자임.


	

	}

}
