import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 값을 입력하기 위하여 BufferedReader 사용
		StringBuilder sb = new StringBuilder(); //문자열을 결합한 뒤 정답을 출력하기 위하여 StringBuilder 사용
		
		int T = Integer.parseInt(bf.readLine()); //테스트 개수 T
		
		for(int i = 0 ; i < T; i++) { //테스트 개수 T만큼 for문 반복
			sb.append(solved(bf.readLine())).append("\n"); //solved 메소드에 괄호 문자를 넘겨준 다음 그 return 값을 sb에 추가한 뒤 개행 문자 추가
		}
		System.out.println(sb); //정답출력.
	}
	
	public static String solved(String sentence) { //괄호문장을 받아 문자열을 return하는 solved 함수 선언.
		Stack<Character> stack = new Stack<>(); //객체명이 stack이라는 Stack 선언. 객체 타입은 Character.

		for(int i = 0 ; i <sentence.length(); i++) { //괄호 문장의 길이만큼 for문 반복
			char c = sentence.charAt(i); //괄호문장의 index가 i인 문자 (괄호)를 char형 변수 c에 저장. c는 '(' or ')' 둘 중 하나
			
			if(c == '(') { //만약 c가 '('라면 
				stack.push(c); //스택에 '('를 추가
			}
			
			if(c == ')') { //만약 c가 ')'라면
				if(stack.empty()) { //만약 c가 ')' 이고, 스택이 완전히 비어있으면
					return "NO"; //return 값으로 "NO"를 리턴
				}
				else {      //만약 c가 ')'이고,  스택에 짝을 이룰 수 있는 '('가 하나라도 존재한다면
					stack.pop(); //스택에서 가장 위에 있는 '('를 pop함
				}
			}
			
			
			
		}
		
		if(stack.empty()) return "YES";   //괄호 문장의 모든 문자를 for문 실행 시킨 후 스택이 비어있으면 VPS이므로 "YES"를 리턴
		else return "NO"; //괄호 문장의 모든 문자를 for문 실행 시킨 후 스택이 비어있으면 VPS가 아니므로 "NO"를 출력
		
	}

}
