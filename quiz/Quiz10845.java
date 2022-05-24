import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Quiz10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 값을 입력 받기 위하여 BufferedReader 사용
		StringBuilder sb = new StringBuilder(); //정답을 만들어줄 StingBuilder sb선언
		
		int N = Integer.parseInt(bf.readLine()); //첫째 줄에 명령의 수 N이 주어짐 ( 1<= N <= 10,000)
		Queue<Integer> queue = new LinkedList<>(); //정수형 큐 queue 선언
		
		StringTokenizer st;
		int last_number = 0; //큐에 제일 늦게 들어온 숫자를 저장할 int형 last_number 변수 선언 후 0으로 초기화
		for(int i = 0; i < N ; i++) { //N만큼 반복문 실행
			st = new StringTokenizer(bf.readLine(), " "); //한 줄로 명령어와 숫자(명령어가 push일 경우에만)를 입력받은 후 공백을 기준으로 분리하여 st에 저장
			String order = st.nextToken(); //st의 맨 앞에 저장되어 있는 문자열을 order에 저장
			
			if(order.equals("push")) { //만약 order가 "push"와 같다면
		    int number = Integer.parseInt(st.nextToken()); //st에 저장된 숫자를 정수형 변수 number에 저장
		    last_number = number; //number가 곧 큐에 push될 예정이니까 queue의 제일 최근에 들어온 숫자를 의미하는 last_number에 number 값을 저장
			 queue.add(number);	 //queue에 number값 저장
			}
			
			else if(order.equals("pop")) {  //만약 order가 "pop"와 같다면
				if(queue.isEmpty()) { //만약 queue가 비어있다면.
					sb.append(-1).append("\n"); //sb에 -1을 추가한 뒤 개행문자 추가
				} else { //만약 queue가 비어있지 않다면
					sb.append(queue.poll()).append("\n"); //sb에 front값을 출력 한 뒤 저장 하고 queue에서 front값을 제거 
				}
			}
			
			else if(order.equals("size")) {  //만약 order가 "size"와 같다면
			 sb.append(queue.size()).append("\n"); //sb에 queue.size()를 젖ㅇ
			}
			
			else if(order.equals("empty")) {  //만약 order가 "empty"와 같다면
				if(queue.isEmpty()) { //만약 queue가 비어있다면.
					sb.append(1).append("\n"); //sb에 1을 추가
				}else { // 만약 queue가 비어있지 않다면
					sb.append(0).append("\n"); //sb에 0을 추가
				}
		     }
			
			else if(order.equals("front")) {  //만약 order가 "front"와 같다면
				if(queue.isEmpty()) { //만약 queue가 비어있다면.
					sb.append(-1).append("\n"); //sb에 -1 추가
				}
				else { //만약 queue가 비어있지 않다면
					sb.append(queue.peek()).append("\n"); //sb에 queue.peek()값 저장
				}
			}
			
			else if(order.equals("back")) {  //만약 order가 "back"와 같다면
				if(queue.isEmpty()) { //만약 queue가 비어있다면.
					sb.append(-1).append("\n"); //sb에 -1을 추가하고 개행문자 추가
				}
				else { //만약 queue가 비어있지않다면
					sb.append(last_number).append("\n"); //sb에 last_number를 추가하고 개행문자 추가
				}						
			}
		}
		System.out.println(sb); //정답출력
	}
}
