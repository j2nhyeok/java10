import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz10824 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //���� �Է¹ޱ� ���Ͽ� BufferedReader ���
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " "); // �� �ڿ����� ������ �������� ���ڿ� �� �ٷ� �Է¹��� �� ������ �������� �и��Ͽ� st�� ����
		String num1 = st.nextToken() + st.nextToken(); //st�� �տ� �ִ� �� ���ڿ��� �� ����(A, B)�� �����Ͽ� ���ڿ��� ���� num1�� ���� == A�� �ڿ� B�� ���̴� ��
		String num2 = st.nextToken() + st.nextToken(); //st�� �տ� �ִ� �� ���ڿ��� �� ����(C, D)�� �����Ͽ� ���ڿ��� ���� num2�� ���� == C�� �ڿ� D�� ���̴� ��
		
		System.out.println(Long.parseLong(num1) + Long.parseLong(num2)); //int�� �ƴ� Long���� ���� ������ A,B�� ���� �ִ� ������ 1,000,000�̶��
																		//���ڿ� num1�� "10000001000000"�� �ǹǷ� ����� ���� ���������� �ٲ�� �ϴµ�
																		//int�� �������� ����� ������ long�� ���.

	}

}
