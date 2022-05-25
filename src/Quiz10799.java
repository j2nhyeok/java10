import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Quiz10799 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //���� �Է¹ޱ� ���Ͽ� BufferedReader ���
		Stack<Character>stack = new Stack<>(); 		//���ڸ� ����޴� ���� stack ����.
	
		int answer = 0; 							// �߷��� ������ �� ������ ��Ÿ���� ������ ���� answer ���� �� 0���� �ʱ�ȭ
		String sentence = bf.readLine();			 // ��ȣ ���� �Է� 
		for(int i = 0 ; i < sentence.length() ; i++) { // ��ȣ������ ���̸�ŭ for�� ����
			if(sentence.charAt(i) == '('){ 			// ���� ��ȣ������ ������ ��ȣ�� '('�� ���
				stack.push(sentence.charAt(i)); 	// stack�� '('�� �״´�.
			} else {            					// ���� ��ȣ������ ������ ��ȣ�� ')'�� ���... �� ��쿣 �� �ٽ� �� ���� ���� ������.
				if(sentence.charAt(i -1) == '(') {  // ')'�� �ٷ� ���� ���ڰ� '('�� ��� == ���밡 �ƴ϶� �������� �ϼ��Ǵ� ���
					stack.pop(); 					// ���ÿ��� '(' �� ������ ��
					answer += stack.size(); 		// �߷��� ������ �Ѱ����� ��Ÿ���� answer�� ������ ũ��(������ ������ �ǹ��ϴ�)�� ���Ѵ�.
				} else { 							// ')'�� �ٷ� ���� ���ڰ� ')'�� ��� == �ϳ��� ���밡 ������ ���
					stack.pop();                    // �ϳ��� ���밡 �������Ƿ� stack�� �ִ� '('�� �����Ѵ�.
					answer++;                       // ���信 +1 �߰�
				}
			}
			
			}
		System.out.println(answer);
	}
	}
