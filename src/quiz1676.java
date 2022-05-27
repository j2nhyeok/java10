import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;



public class quiz1676 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //���� �Է¹ޱ� ���Ͽ� BufferedReader ���

		int N = Integer.parseInt(bf.readLine()); //0 <= N <= 500
		int cnt = 0; //N!�� �ڿ������� ó�� 0�� �ƴ� ���ڰ� ���� ������ 0�� ������ count�� ������ cnt���� ���� �� 0���� �ʱ�ȭ
		
		BigInteger factorial_value = new BigInteger("1"); // �ؿ��� BigInteger�� ��� �Ұű� ������ sum�� BigInteger�� ������ factorial_value������ 1�� ����.
		
		
		for(int i  = 2 ; i <= N; i++) { //2���� N���� �ݺ��� ���� (1�� �̹� ������ sum���� �־� ��� ����)
			factorial_value = factorial_value.multiply(BigInteger.valueOf(i)); // 1���� ������� N���� ���丮���� ����Ͽ� sum ������ ����.
		}
		
	String number = String.valueOf(factorial_value);  //�ؿ��� N!�� �ڿ������� ó�� 0�� �ƴ� ���ڰ� ���� ������ 0�� ���� �����ֱ� ���Ͽ� factorial_value�� ���ڿ��� �� ��ȯ
	
	
		for(int i = number.length() - 1 ; 0 <= i ; i--) {	//�ڿ������� ������ ������� �ϹǷ� i�� ���ڿ��� �� �� �ε����� ����
			if(number.charAt(i) == '0') { // ���� ���繮�ڰ� '0'�� ���ٸ�
				cnt++; // �ڿ������� ó�� 0�� �ƴ� ���ڰ� ���� ������ 0�� ������ 1�� ����
			}else { // ���� ���繮�ڰ� '0'�� �ƴ϶��
				break;  //for�� Ż��
			}
		}
		
		System.out.println(cnt); //���� ���
		
	}

}