import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Quiz10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // ���� �Է¹ޱ� ���Ͽ� BufferedReader ���
		StringBuilder sb = new StringBuilder(); // ���� ���ڿ��� ������� StringBuilder sb ����
		
		int N = Integer.parseInt(bf.readLine()); //ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)
		
		ArrayList<Integer> stack =  new ArrayList<Integer>(); //������ ����Ʈ stack ����
		int size  = 0; //size�� 0���� ����, stack �̶�� ����Ʈ�� ���� �ϳ��� �߰� �� ������ 1�� ����, stack�̶�� ����Ʈ�� ���� �ϳ��� ���� �� �� ���� 1�� ����.
		
		for(int i = 0; i < N; i++) { //N��ŭ for�� �ݺ� ����
		StringTokenizer st = new StringTokenizer(bf.readLine(), " "); //���ڿ��� �Է� �޾� ������ �������� �и�. ���� ��� push 3 �Է½� "push", "3"
		
		String order = st.nextToken(); //String�� order ������ st�� ù ° ���� ������.
	
		
		if(order.equals("push")) { //���� ��ɾ "push"�� ���ٸ�
			int number = Integer.parseInt(st.nextToken()); //�ڿ� �ִ� ���ڿ��� �� ���ڸ� �������� ������ ���� int�� ���� number�� ����.
			stack.add(number); // stack�̶�� ����Ʈ�� number�� ����
			size++; //����Ʈ�� ��Ұ� �߰� �Ǿ����� size 1����.
			
		}
		else if(order.equals("pop")) { // ���� ��ɾ "pop"�� ���ٸ�
			if(size == 0) sb.append(-1).append("\n"); // ���� ��ɾ "pop"�� ���� stack�̶�� ����Ʈ�� ��� ������ 0�̸� -1�� sb�� �߰� �� ���๮�� �߰�
			else if(1 <= size) { // ���� ��ɾ "pop"�� ���� stack�̶�� ����Ʈ�� ��� ������ 1�̻��̶��
				sb.append(stack.get(size-1)).append("\n"); //sb�� stack ����Ʈ�� ���� ���������� �߰� �� �� ���๮�� �߰�
				

				stack.remove(size-1); //pop�� ���ÿ��� ���� ���� �ִ� ���� ����� �� �� ���� �����ϹǷ�, ���� ������ �ε��� (���� ���� �ִ� ������ �ε���)�� ����Ʈ���� ����
				
			 
				
				size--; // ��� �ϳ��� ���� �Ǿ����Ƿ� size ���� 1����
			}
			
			
		}
		else if(order.equals("size")) { //���� ��ɾ "size"�� ���ٸ�
		 sb.append(size).append("\n"); //sb�� size ���� �߰��� �� ���๮�� �߰�
		
		}
		
		else if(order.equals("empty")) { //���� ��ɾ "empty"�� ���ٸ�
			if(size == 0) sb.append(1).append("\n");  //���� ��ɾ "empty"�� ����, size�� 0�̶�� (stack�̶�� ����Ʈ�� �ƹ��� ��Ұ� ���ٸ�) sb�� 1�� �߰��� �� ���๮�� �߰� 
			else sb.append(0).append("\n"); //���� ��ɾ "empty"�� ����, size�� 0�� �ƴ϶�� (stack�̶�� ����Ʈ�� ��Ұ� �ִٸ�) sb�� 0�� �߰��� �� ���๮�� �߰�
			
		}
		
		else if(order.equals("top")) { //���� ��ɾ "top"�� ���ٸ�
			if(size == 0) sb.append(-1).append("\n"); //���� ��ɾ "top"�� ����,  size�� 0�̶�� (stack�̶�� ����Ʈ�� �ƹ��� ��Ұ� ���ٸ�) sb�� -1�� �߰��� �� ���๮�� �߰� 
			else sb.append(stack.get(size -1)).append("\n"); //���� ��ɾ "top"�� ����, size�� 0�� �ƴ϶�� (stack�̶�� ����Ʈ�� ��Ұ� �ִٸ�) sb�� stack�̶�� ����Ʈ�� ������ ��� ���� �߰��� �� ���๮�� �߰�
			 
		}
		

		}
		System.out.println(sb); // �������
	}

}
