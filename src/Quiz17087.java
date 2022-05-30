import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz17087 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //���� �Է¹ޱ� ���Ͽ� BufferedReader ���
		StringTokenizer st = new StringTokenizer(bf.readLine(), " "); // �� �ٷ� ������ �������� N�� S�� �Է� �޾� �������� �и� �� �� st�� ���ڿ��� ������� ����
		
		int N = Integer.parseInt(st.nextToken());  //ù° �ٿ� N(1 �� N �� 10^5),  ���� N��
		int S = Integer.parseInt(st.nextToken()); //  S(1 �� S �� 10^9), �����̴� ���� �� S�� �ִ�.
		
		int position_difference[] = new int[N]; //���� �������� ��ġ(S)�� N���� �������� ��ġ ���̸� �������� ������ �迭 position_difference ����
		
		st = new StringTokenizer(bf.readLine(), " "); //N���� �������� �� ��ġ�� ������ �������� �� �ٷ� �Է� �޾� �������� �и� �� �� st�� ���ڿ��� ������� ����
		
		
		for(int i = 0; i < N; i++) { // ������ �� N��ŭ �ݺ��� ����
			position_difference[i] = Math.abs( S - Integer.parseInt(st.nextToken())); //������ ���� ��ġ���� �������� ��ġ�� �� ���밪�� position_difference[] �� ����
		}
		
		if(N == 1) System.out.println(position_difference[0]); //���� ������ �� �� ���̶�� ������ġ���� ������ ��ġ�� ���� ���� ������ָ� ��
		
		else { // ������ �� ���� �ƴ� 2�� �̻��̶��
			int gcd = position_difference[0]; //ù ��° ������ ������ ��ġ�� ���� �ִ������� ��Ÿ���� gcd������ �ְ�
			for(int i = 1; i <  N; i++) {
				gcd = GCD(gcd, position_difference[i]); //�ִ������� return���ִ� GCD()�Լ��� ���� �Ѱ��� �� return���� �ٽ� gcd�� ������. 
			}
			System.out.println(gcd); // ���������� ���� gcd�� ���� == D
		}
		}
	
	public static int GCD(int num1, int num2) {    //�� ������ �ִ� ������� �����ִ� �Լ�
		int bigger_number = Math.max(num1, num2); // �ִ������� ���� �� ���� �� ū ���� ������ ���� bigger_number �� ����.
		int smaller_number = Math.min(num1, num2); //�ִ������� ���� �� ���� �� ���� ���� ������ ���� smaller_number �� ����.
		int moduler = 1; //�ִ� ������� ���� �� ���� �� ū ���� ������ ������ ������ ���� �������� ������ moduler ���� �� 1�� �ʱ�ȭ
		
		  while(moduler != 0) { // moduler�� 0�� �ƴϸ�
		         moduler = bigger_number % smaller_number; // �� ���� �� ū ������ ���� ���� ���� �������� moduler�� �����ϰ�
		         
		         if(moduler != 0) {  //���� �� moduler�� 0�� �ƴ϶��
		            bigger_number = smaller_number; //ū ���� ���� ���� ���� �����ϰ�
		            smaller_number = moduler; //���� ���� ������ ���� moduler �� �����ϰ�  �ٽ� ���� �ö󰡼� while�� ����. ��������? moduler�� 0�� �� �� ����.;
		         }else {  // �ᱹ moduler�� 0�� �Ǿ��ٸ�
		        	 break; // smaller_number�� ���� �ִ� �������� ���̹Ƿ� while �� Ż��
		         }
		         
		      }
				return smaller_number;
	}

}
