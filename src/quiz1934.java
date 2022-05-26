import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class quiz1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //���� �Է¹ޱ� ���Ͽ� BufferedReader ���
		StringBuilder sb = new StringBuilder();  //���ڿ��� �����Ͽ� ���� ���ڿ��� sb�� ����� ���� StringBuilder ���
		
		int T = Integer.parseInt(bf.readLine()); //ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)
		
		for(int j = 0 ; j < T; j++) { //�׽�Ʈ ����T��ŭ �ݺ��� ����
		StringTokenizer st = new StringTokenizer(bf.readLine(), " "); //�� �ٷ� �� ���� �ڿ����� �Է¹޾� �������� �и��� �� st�� ������� ����
		 
		int num1 = Integer.parseInt(st.nextToken());  //st�� ù ��° ��ū�� num1�� ����
		int num2 = Integer.parseInt(st.nextToken()); //st�� ù ��° ��ū�� num2�� ����
		
		int max = 0; //max�� �ִ� �����
		int min = 0; //min�� �ּ� �����
		
		
		for(int i = 1; i <= Math.min(num1, num2); i++) { //num1�� num2 �� ���� �� ��ŭ �ݺ��� ����
			if(num1 % i == 0  && num2 % i == 0) {
				max = i; //num1�� num2�� i�� �������� �� �Ѵ� �������� 0�� �ǰ��ϴ� i�� �ִ밪�� �ִ� ������� �Ǵ� ����
			}
		}
		min = max * (num1 / max) * (num2 / max); //�ּ� ����� = �ִ� ����� * (num1�� �ִ������� ������ ���� ��) * (num2�� �ִ������� ������ ���� ��)
		sb.append(min).append("\n");
	}
		System.out.println(sb);
	}
}