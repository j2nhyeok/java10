import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Quiz10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 값을 입력받기 위하여 BufferedReader 사용
		StringBuilder sb = new StringBuilder(); // 정답 문자열을 만들어줄 StringBuilder sb 선언
		
		int N = Integer.parseInt(bf.readLine()); //첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)
		
		ArrayList<Integer> stack =  new ArrayList<Integer>(); //정수형 리스트 stack 선언
		int size  = 0; //size는 0으로 선언, stack 이라는 리스트에 값이 하나씩 추가 될 때마다 1씩 증가, stack이라는 리스트에 값이 하나씩 제거 될 때 마다 1씩 감소.
		
		for(int i = 0; i < N; i++) { //N만큼 for문 반복 실행
		StringTokenizer st = new StringTokenizer(bf.readLine(), " "); //문자열을 입력 받아 공백을 기준으로 분리. 예를 들어 push 3 입력시 "push", "3"
		
		String order = st.nextToken(); //String형 order 변수에 st의 첫 째 값을 저장함.
	
		
		if(order.equals("push")) { //만약 명령어가 "push"와 같다면
			int number = Integer.parseInt(st.nextToken()); //뒤에 있던 문자열로 된 숫자를 정수열로 변경한 다음 int형 변수 number에 저장.
			stack.add(number); // stack이라는 리스트에 number값 저장
			size++; //리스트에 요소가 추가 되었으니 size 1증가.
			
		}
		else if(order.equals("pop")) { // 만약 명령어가 "pop"과 같다면
			if(size == 0) sb.append(-1).append("\n"); // 만약 명령어가 "pop"과 같고 stack이라는 리스트의 요소 개수가 0이면 -1을 sb에 추가 후 개행문자 추가
			else if(1 <= size) { // 만약 명령어가 "pop"과 같고 stack이라는 리스트의 요소 개수가 1이상이라면
				sb.append(stack.get(size-1)).append("\n"); //sb에 stack 리스트의 제일 마지막값을 추가 한 후 개행문자 추가
				

				stack.remove(size-1); //pop은 스택에서 가장 위에 있는 정수 출력한 뒤 그 수를 제거하므로, 제일 마지막 인덱스 (가장 위에 있는 정수의 인덱스)를 리스트에서 삭제
				
			 
				
				size--; // 요소 하나가 삭제 되었으므로 size 값을 1감소
			}
			
			
		}
		else if(order.equals("size")) { //만약 명령어가 "size"와 같다면
		 sb.append(size).append("\n"); //sb에 size 값을 추가한 후 개행문자 추가
		
		}
		
		else if(order.equals("empty")) { //만약 명령어가 "empty"와 같다면
			if(size == 0) sb.append(1).append("\n");  //만약 명령어가 "empty"와 같고, size가 0이라면 (stack이라는 리스트에 아무런 요소가 없다면) sb에 1을 추가한 후 개행문자 추가 
			else sb.append(0).append("\n"); //만약 명령어가 "empty"와 같고, size가 0이 아니라면 (stack이라는 리스트에 요소가 있다면) sb에 0을 추가한 후 개행문자 추가
			
		}
		
		else if(order.equals("top")) { //만약 명령어가 "top"와 같다면
			if(size == 0) sb.append(-1).append("\n"); //만약 명령어가 "top"와 같고,  size가 0이라면 (stack이라는 리스트에 아무런 요소가 없다면) sb에 -1을 추가한 후 개행문자 추가 
			else sb.append(stack.get(size -1)).append("\n"); //만약 명령어가 "top"와 같고, size가 0이 아니라면 (stack이라는 리스트에 요소가 있다면) sb에 stack이라는 리스트의 마지막 요소 값을 추가한 후 개행문자 추가
			 
		}
		

		}
		System.out.println(sb); // 정답출력
	}

}
