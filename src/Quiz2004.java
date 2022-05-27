import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Quiz2004 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
		
		StringTokenizer st =new StringTokenizer(bf.readLine(), " "); // 두 정수를 공백으로 구분하여 한 줄로 입력한 다음 공백을 기준으로 분리한 뒤 st에 순서대로 저장
		long n = Long.parseLong(st.nextToken()); //st의 첫 번째 토큰을 n에 저장
		long m = Long.parseLong(st.nextToken()); //st의 첫 번째 토큰을 m에 저장
	
		//n!/{(n-m)!m!}
		long five_cnt = five_cnt_check(n) - five_cnt_check(n-m) - five_cnt_check(m); //n!의 5의 승수 - (n-m)!의 5의 승수 - m!의 5의 승수 = nCm의 5의 승수
		long two_cnt = two_cnt_check(n) - two_cnt_check(n - m) - two_cnt_check(m); //n!의 2의 승수 - (n-m)!의 2의 승수 - m!의 2의 승수 = nCm의 2의 승수
		
		System.out.println(Math.min(two_cnt, five_cnt)); // 둘 중 더 작은 값이 nCm 끝자리 0의 개수
	}
	
	   // factorial 진행과정 중에서 2와 5의 곱의 개수를 파악한다.
	public static long two_cnt_check(long num) { //2의 승수를 구하는 함수
		int two_cnt = 0; //2의 승수의 갯수를 나타내는 two_cnt
		for(int i = 1; i <= num; i++) { //num만큼 반복문 실행
			int target = i; //정수형 변수 target에 i값 저장
			while((target % 2 == 0)) { //target이 2의 배수일 때
				two_cnt++; //two_cnt에 1추가
				target = target/2; //1추가 후 target/2 의 몫을 target에 재저장
			}
		}
		return two_cnt; //2의 승수의 갯수를 return
	}
	
	   // factorial 진행과정 중에서 2와 5의 곱의 개수를 파악한다.
	public static long five_cnt_check(long num) { //5의 승수를 구하는 함수
		int  five_cnt = 0; //5의 승수의 갯수를 나타내는 five_cnt
		for(int i = 1; i <= num; i++) { //num만큼 반복문 실행
			int target = i; //정수형 변수 target에 i값 저장
			while((target % 5 == 0)) { //target이 5의 배수라면
				five_cnt++; //5의 승수 갯수 1증가
				target = target/5; //1추가 후 target/5 의 몫을 target에 재저장
			}
		}
		return five_cnt; //5의 승수의 갯수를 return
		
	}
	
				
	}


