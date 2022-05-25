import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // ���� �Է��ϱ� ���Ͽ� BufferedReader ���
		StringBuilder sb = new StringBuilder(); //���ڿ��� ������ �� ������ ����ϱ� ���Ͽ� StringBuilder ���
		
		int T = Integer.parseInt(bf.readLine()); //�׽�Ʈ ���� T
		
		for(int i = 0 ; i < T; i++) { //�׽�Ʈ ���� T��ŭ for�� �ݺ�
			sb.append(solved(bf.readLine())).append("\n"); //solved �޼ҵ忡 ��ȣ ���ڸ� �Ѱ��� ���� �� return ���� sb�� �߰��� �� ���� ���� �߰�
		}
		System.out.println(sb); //�������.
	}
	
	public static String solved(String sentence) { //��ȣ������ �޾� ���ڿ��� return�ϴ� solved �Լ� ����.
		Stack<Character> stack = new Stack<>(); //��ü���� stack�̶�� Stack ����. ��ü Ÿ���� Character.

		for(int i = 0 ; i <sentence.length(); i++) { //��ȣ ������ ���̸�ŭ for�� �ݺ�
			char c = sentence.charAt(i); //��ȣ������ index�� i�� ���� (��ȣ)�� char�� ���� c�� ����. c�� '(' or ')' �� �� �ϳ�
			
			if(c == '(') { //���� c�� '('��� 
				stack.push(c); //���ÿ� '('�� �߰�
			}
			
			if(c == ')') { //���� c�� ')'���
				if(stack.empty()) { //���� c�� ')' �̰�, ������ ������ ���������
					return "NO"; //return ������ "NO"�� ����
				}
				else {      //���� c�� ')'�̰�,  ���ÿ� ¦�� �̷� �� �ִ� '('�� �ϳ��� �����Ѵٸ�
					stack.pop(); //���ÿ��� ���� ���� �ִ� '('�� pop��
				}
			}
			
			
			
		}
		
		if(stack.empty()) return "YES";   //��ȣ ������ ��� ���ڸ� for�� ���� ��Ų �� ������ ��������� VPS�̹Ƿ� "YES"�� ����
		else return "NO"; //��ȣ ������ ��� ���ڸ� for�� ���� ��Ų �� ������ ��������� VPS�� �ƴϹǷ� "NO"�� ���
		
	}

}
