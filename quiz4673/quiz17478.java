import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz17478 {
	 static int M; //정수형 변수 M을 전역 변수로 선언. 나중 반복문 조건으로 사용에정
	
	 public static void recursion(int N) { // 재귀함수 recursion. 
		 if(N == 0) { //만약 N == 0이면
			 String str = ""; //문자열 변수 str 을 = ""로 초기화
			 for(int i = 0; i < M-N; i++) { //0부터 M-N직전까지 반복문
				 str += "____"; // 반복문 돌 때마다 str에 "____"을 더한다.
			 }
			 System.out.println(str + "\"재귀함수가 뭔가요?\"\n" + 
					 			str +"\"재귀함수는 자기 자신을 호출하는 함수라네\"\n"
					 			+ str + "라고 답변하였지."
					 			);
		 } else { //N이 0이 아니라면.
			 String str = ""; //문자열 변수 str을 ""로 초기화
			 for(int j = 0; j< M-N; j++) { // 0부터 M-N직전까지 반복문
				 str += "____"; //반복문 돌 때마다 str에 "____"을 더한다.
			 }
			 System.out.println(str + "\"재귀함수가 뭔가요?\"\n" + 
			 			str +"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n"
			 			+ str + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n"
			 			+ str + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
			 
			 recursion(N-1); //재귀함수 호출
			 
			 System.out.println(str + "라고 답변하였지.");
		 
		 }
		 }
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		M = N;
		//밑에 문장은 1번밖에 출력되지 않는다.
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		

		recursion(N);
	}

}
