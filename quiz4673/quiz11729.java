import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz11729 {
	static StringBuilder sb = new StringBuilder(); //값을 출력하기 위해 StringBuilder사용하여  sb를 전역변수로 선언
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //N을 입력 하기 위해 BufferedReader사용
		
		int N = 3; //1 <= N <= 20. N입력
		sb.append((int)Math.pow(2, N)-1).append("\n"); //하노이 탑의 최소 이동 횟수 = 2^N - 1. 그리고 개행 문자 추가
		
		hanoi(N,1,2,3); //하노이 함수 호출. 1 = 시작 기둥 , 2 = 경유하는 기둥 , 3 = 도착 기둥
		
		System.out.println(sb); //정답 출력
		
	}
	
	public static void hanoi(int N, int start, int via, int to) { //N은 원판 개수, start는 시작 기둥, via는 경유하는 기둥 , to는 도착하는 기둥 

		
		
		if(N == 1) { //만약 N == 1이라면
			sb.append(start + " " + to).append("\n"); //sb에 1 3 그리고 개행문자를 추가
		}
		else { //N이 1이 아니라면
		hanoi(N-1, start, to , via); //N-1 재귀 함수 호출    N = 3일 때 hanoi(2, 1,3,2);를 호출   N = 2일 때 hanoi(1, 1,2,3)을 호출
		
		sb.append(start + " " + to).append("\n");
		
		hanoi(N-1,via,start, to);
		}
	}

}
