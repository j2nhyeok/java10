import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Quiz10799 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
		Stack<Character>stack = new Stack<>(); 		//문자를 저장받는 스택 stack 선언.
	
		int answer = 0; 							// 잘려진 조각의 총 개수를 나타내는 정수형 변수 answer 선언 후 0으로 초기화
		String sentence = bf.readLine();			 // 괄호 문장 입력 
		for(int i = 0 ; i < sentence.length() ; i++) { // 괄호문장의 길이만큼 for문 실행
			if(sentence.charAt(i) == '('){ 			// 만약 괄호문장의 각각의 괄호가 '('인 경우
				stack.push(sentence.charAt(i)); 	// stack에 '('를 쌓는다.
			} else {            					// 만약 괄호문장의 각각의 괄호가 ')'인 경우... 이 경우엔 또 다시 두 가지 경우로 나뉜다.
				if(sentence.charAt(i -1) == '(') {  // ')'의 바로 이전 문자가 '('인 경우 == 막대가 아니라 레이저가 완성되는 경우
					stack.pop(); 					// 스택에서 '(' 를 제거한 후
					answer += stack.size(); 		// 잘려진 조각의 총개수를 나타내는 answer에 스택의 크기(막대의 개수를 의미하는)를 더한다.
				} else { 							// ')'의 바로 이전 문자가 ')'인 경우 == 하나의 막대가 끝나는 경우
					stack.pop();                    // 하나의 막대가 끝났으므로 stack에 있는 '('를 제거한다.
					answer++;                       // 정답에 +1 추가
				}
			}
			
			}
		System.out.println(answer);
	}
	}
