import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Quiz1406 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
		StringBuilder sb = new StringBuilder();//정답을 만들어줄 StringBuilder sb 사용
		
		
		Stack<Character> left_alphabet = new Stack<>(); //커서 기준 왼쪽에 있는 알파벳을 저장 받을 left_alphabet 스택
		Stack<Character> right_alphabet = new Stack<>(); //커서 기준 오른쪽에 있는 알파벳을 저장 받을  right_alphabet 스택
		String sentence = bf.readLine(); //첫 줄에 영어소문자로 된 문자열을 입력받음.        예를들어 sentence = happy|       |는 커서를 의미
		
		StringTokenizer st; //
		
		for( int j = 0 ; j < sentence.length() ; j++) { //입력받은 영어문자열의 알파벳 개수만큼 for문 실행
			left_alphabet.push(sentence.charAt(j)); //입력받은 영어 문자열의 알파벳을 순서대로 left_alphabet에 push.
		}
	
		
		int M = Integer.parseInt(bf.readLine()); //총 M개의 명령어
		
		
		for(int i = 0; i < M; i++) { //M개의 명령어만큼 for문 반복 실행
			st = new StringTokenizer(bf.readLine(), " "); // 명령어를 입력 받아 공백으로 분리 한 후 st에 순서대로 저장. P $ 명령어가 있어  StringTokenizer 사용.
			char order = st.nextToken().charAt(0); //st에 저장된 첫 문자열의 첫 문자를 char형 order에 저장.
		
			
			
			if(order == 'L') { //만약 order 가 'L'과 같다면
				if(!left_alphabet.isEmpty()) {  //left_alphabet 스택이 비어있지 않다라면,           											   만약  happy|
					right_alphabet.push(left_alphabet.pop()); //left_alphabet의 제일 최상단 문자를 끄집어 내어 제거한 후 right_alphabet 스택에 push.    (happ| -> y )
					}
				}
			
			else if(order == 'D') { //만약 order 가 'D'와 같다면
				if(!right_alphabet.isEmpty()) { //right_alphabet 스택이 비어있지 않다라면,              										    만약  |happy
					left_alphabet.push(right_alphabet.pop()); //right_alphabet의 제일 최상단 문자를 끄집어 내어 제거한 후 left_alphabet 스택에 push.    (h  <-  |appy )
					}
				}
			
			else if(order == 'B') { //만약 order 가 'B'와 같다면
				if(!left_alphabet.isEmpty()) { //right_alphabet 스택이 비어있지 않다라면,        			      만약 happy|
					left_alphabet.pop(); //left_alphabet의 제일 최상단 문자를 끄집어 내어 제거             		  ( happ| )
				}
			}
			else if(order == 'P') { //만약 order 가 'P'와 같다면
				char plus_char = st.nextToken().charAt(0); //plus_char는 커서 왼쪽에 추가할 문자
				left_alphabet.push(plus_char); //left_alphabet 스택에 plus_char를 push
			}		
		}
		
		while(!right_alphabet.isEmpty()) {   //right_alphabet에 하나 이상의 값이 들어가 있는 경우 while문 실행
			left_alphabet.push(right_alphabet.pop()); // //right_alphabet의 제일 최상단 문자를 끄집어 내어 제거한 후 left_alphabet 스택에 push.    
		}
		
		while(!left_alphabet.isEmpty()) {  //left_alphabet에 하나 이상의 값이 들어가 있는 경우 while문 실행
			sb.append(left_alphabet.pop());	//left_alphabet이 happy라면 거꾸로 yppah를 sb에 저장한다
		}
		

		
		String answer = sb.reverse().toString(); //yppah를 저장한 sb를 revere하여 answer에 저장해주면 끝
		
		System.out.println(answer);
	}
}
