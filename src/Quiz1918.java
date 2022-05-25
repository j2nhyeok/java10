import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Quiz1918 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack <Character> stack = new Stack<>();
		
		String sentence = bf.readLine(); //중위 표기식으로 입력, 중위 표기식의 길이는 100을 넘지 않는다.
		
		for(int i = 0; i < sentence.length(); i++) {
			if(65 <= (int)sentence.charAt(i) && (int)sentence.charAt(i) <= 90) {
				sb.append(sentence.charAt(i));
			}
			
			else {
				if(sentence.charAt(i) == '(') {
					stack.push(sentence.charAt(i));
				}
				else if(sentence.charAt(i) == ')') {
					while(stack.peek() != '(') {
						sb.append(stack.pop());
					}
					stack.pop();
					
				}
				else {
					if(stack.isEmpty() || priority(stack.peek()) < priority(sentence.charAt(i))) {
						stack.push(sentence.charAt(i));
					}else {
						while(!stack.isEmpty() && priority(stack.peek()) >= priority(sentence.charAt(i))) {
							sb.append(stack.pop());
						}
						if(stack.isEmpty() || priority(stack.peek()) < priority(sentence.charAt(i))) {
							stack.push(sentence.charAt(i));
						}
					}
				}

			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
	System.out.println(sb);
	
	}
	
	public static int priority(char c) {
		if(c == '(') return 0;
		else if(c == '+' || c == '-') return 1; 
		else  return 2;
	
		
	}
}
