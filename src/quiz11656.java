import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class quiz11656 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
		StringBuilder sb = new StringBuilder(); //문자열을 결합하여 정답 문자열인 sb을 만들기 위해 StringBuilder 사용
		
		String S = bf.readLine(); //첫째 줄에 문자열 S가 주어진다. S는  알파벳 소문자. 길이는 1,000보다 작거나 같다.
		
		String suffix[]  = new String[S.length()];  //문자열의 길이만큼 크기를 가진 문자열 배열 suffix선언
		
		for(int i = 0; i < S.length(); i++) {  //문자열의 길이만큼 반복문 실행
			suffix[i]    =   S.substring(i, S.length()); //문자열을 잘라주는 .substring()메서드를 사용하여 문자를 자른 뒤 suffix배열에 순서대로 저장
		}
		
		

	
	Arrays.sort(suffix); //문자열 배열인 suffix를 사전순으로 오름차순으로 정렬
	
	for(int k = 0; k < suffix.length; k++) {  //정답 출력.
		System.out.println( suffix[k]);
	}

	}

}
