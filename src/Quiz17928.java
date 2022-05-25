import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;
 
public class Quiz17928 {
 
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 	// ���� �Է¹ޱ� ���Ͽ� BufferedReader ���
		Stack<Integer> stack = new Stack<Integer>();    	// ������ ���� stack ���
		
		int N = Integer.parseInt(br.readLine()); 	// ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000,000)
		int[] number = new int[N]; //������ ���ڸ� ������ �� ũ�Ⱑ N�� ������ �迭 number ����
		int[] answer = new int[N]; // ��ū�� �� -1 �� ����ϴ� ���� �迭
		StringBuilder sb = new StringBuilder();    // ���ڿ��� �����Ͽ� ������ ���� ����ϱ� ���Ͽ� StringBuilder ���
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");     // ������ �������� ���� ���ڸ� �� �ٷ� �Է¹޾� StringTokenizer st�� ����.
		
		boolean change[] = new boolean[N];      // ũ�Ⱑ N�� boolean�� �迭 change ���� �� -> ������ ���Ұ� false�� �ڵ� �ʱ�ȭ.
		
		for(int i = 0; i < N; i++) {	// ũ�� N��ŭ �ݺ��� ����
			answer[i] = number[i] = Integer.parseInt(st.nextToken());			// st�� �Է¹��� ������ ���ڵ��� ���������� ��ȯ�� �� number �迭�� answer�迭�� ������� ����.
		}
 
 
		for(int i = 0; i < N; i++) {	// ũ�� N��ŭ �ݺ��� ����
			
	
			while(!stack.isEmpty() && number[stack.peek()] < number[i] && !change[stack.peek()]) { //while�� ���� ������ �� 3����.  1�� : ������ ������� �ʰ�, 2�� : number[stack.peek()]�� number[i]���� �۰�, 3�� : stack�� �ֻ�ܰ��� �ε����� ������ change�� ���� false (���� �ٲ����� ����) ���� �Ѵ�.
				int a = stack.pop(); 	// �� 3������ ��� �����Ѵٸ�, stack�� �ֻ�� ���� ���� ������ ������ ���� a�� �����ϰ�
				answer[a] = number[i]; 	// number[i]�� ���� answer[a]�� �����Ѵ�.
				change[a] = true; 		// �׸��� number[a]�� ���� �ٲ����� ���� �ٲ��ٴ� �ǹ̷� change[a]�� true�� �ٲ��ش�.  ��� ���Ŀ� �� ū ���� �������� change[a]�� true�̱� ������ ���� while���� ���� ���� �ʴ´�.    ������ <��ū���� �����ʿ� �����鼭 Ai���� ū �� �߿��� ���� ���ʿ� �ִ� ���� �ǹ��Ѵ�.>
											// �̹Ƿ� �� �� ���� �ٲٸ� �ȴ�.
			}
			
			stack.push(i); //while���� ���� ���ο� ������� stack�� i (�ε���)���� �ִ´� 
		}
		
		for(int j = 0; j < N ; j++) { // N��ŭ �ݺ��� ����
			if(!change[j]) { //���� change[j]�� false ��� == ���� �� ���� �ٲ� �� ���ٸ� == ��ū���� ���ٸ� 
				answer[j] = -1; //���� �ε��� j�� ������ answer[j]�� ���� -1�� ����
			}
		}
		
		for(int i = 0; i < N; i++) { //N��ŭ �ݺ��� ����
			sb.append(answer[i]).append(' '); //��ū�� �� -1�� �� ������ sb�� �߰�
		}
		
		System.out.println(sb); //���� ���
	}
}
