import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;
 
public class Quiz17928 {
 
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 	// 값을 입력받기 위하여 BufferedReader 사용
		Stack<Integer> stack = new Stack<Integer>();    	// 정수형 스택 stack 사용
		
		int N = Integer.parseInt(br.readLine()); 	// 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)
		int[] number = new int[N]; //각각의 숫자를 저장해 줄 크기가 N인 정수형 배열 number 선언
		int[] answer = new int[N]; // 오큰수 및 -1 을 출력하는 정답 배열
		StringBuilder sb = new StringBuilder();    // 문자열을 결합하여 정답을 만들어서 출력하기 위하여 StringBuilder 사용
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");     // 공백을 기준으로 여러 숫자를 한 줄로 입력받아 StringTokenizer st에 저장.
		
		boolean change[] = new boolean[N];      // 크기가 N인 boolean형 배열 change 선언 후 -> 각각의 원소가 false로 자동 초기화.
		
		for(int i = 0; i < N; i++) {	// 크기 N만큼 반복문 실행
			answer[i] = number[i] = Integer.parseInt(st.nextToken());			// st로 입력받은 각각의 숫자들을 정수형으로 변환한 후 number 배열과 answer배열에 순서대로 저장.
		}
 
 
		for(int i = 0; i < N; i++) {	// 크기 N만큼 반복문 실행
			
	
			while(!stack.isEmpty() && number[stack.peek()] < number[i] && !change[stack.peek()]) { //while문 실행 조건이 총 3가지.  1번 : 스택이 비어있지 않고, 2번 : number[stack.peek()]이 number[i]보다 작고, 3번 : stack의 최상단값을 인덱스로 가지는 change의 값이 false (값이 바뀐적이 없다) 여야 한다.
				int a = stack.pop(); 	// 위 3조건을 모두 만족한다면, stack의 최상단 정수 값을 꺼내와 정수형 변수 a에 저장하고
				answer[a] = number[i]; 	// number[i]의 값을 answer[a]에 저장한다.
				change[a] = true; 		// 그리고 number[a]의 값이 바꼈으니 값이 바꼈다는 의미로 change[a]를 true로 바꿔준다.  고로 이후에 더 큰 값이 나오더라도 change[a]가 true이기 때문에 위에 while문이 실행 되지 않는다.    문제가 <오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다.>
											// 이므로 단 한 번만 바꾸면 된다.
			}
			
			stack.push(i); //while문을 실행 여부와 상관없이 stack에 i (인덱스)값을 넣는다 
		}
		
		for(int j = 0; j < N ; j++) { // N만큼 반복문 실행
			if(!change[j]) { //만약 change[j]가 false 라면 == 값이 한 번도 바뀐 적 없다면 == 오큰수가 없다면 
				answer[j] = -1; //같은 인덱스 j를 가지는 answer[j]의 값에 -1을 저장
			}
		}
		
		for(int i = 0; i < N; i++) { //N만큼 반복문 실행
			sb.append(answer[i]).append(' '); //오큰수 및 -1로 된 정답을 sb에 추가
		}
		
		System.out.println(sb); //정답 출력
	}
}
