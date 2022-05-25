import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class quiz1427 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위해 BufferedReader 사용
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //값을 출력하기 위해 BufferedWriter 사용
	
	int N = Integer.parseInt(bf.readLine()); //N은 정렬하려고 하는 수 N. N은 1,000,000,000보다 작거나 같은 자연수
	
	ArrayList<Integer> number = new ArrayList<Integer>(); //정수형 리스트 number 생성
	
	while(N != 0) { // N이 0이 아니면 while문 실행. 
		number.add(N % 10); //number 리스트에 N을 10으로 나눈 나머지 값을 추가한다.
		N /= 10; // 위 라인을 실행한 뒤 N을 10으로 나눈 몫을 N에 재저장한다.
	}
	
	Collections.sort(number, Collections.reverseOrder()); //Collections.sort를 사용하여 내림차순으로 리스트를 정렬
	
	for(int i = 0 ; i < number.size(); i++) //number.size()만큼 for문 반복 
	{
		bw.write(String.valueOf(number.get(i))); //출력
	}
	
	
	bw.close();
	}

}
