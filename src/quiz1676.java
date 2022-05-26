import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;



public class quiz1676 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //���� �Է¹ޱ� ���Ͽ� BufferedReader ���

		int N = Integer.parseInt(bf.readLine()); //0 <= N <= 500
		int cnt = 0; //N!�� �ڿ������� ó�� 0�� �ƴ� ���ڰ� ���� ������ 0�� ������ count�� ������ cnt���� ���� �� 0���� �ʱ�ȭ
		
		BigInteger sum = new BigInteger("1"); // �ؿ��� BigInteger�� ��� �Ұű� ������ sum�� BigInteger�� ������ sum������ 1�� ����.
		
		
		for(int i  = 2 ; i <= N; i++) { //N��ŭ �ݺ��� ����
			sum = sum.multiply(BigInteger.valueOf(i));
		}
		
	String number = String.valueOf(sum);
	
	
		for(int i = number.length() - 1 ; 0 <= i ; i--) {	
			if(number.charAt(i) == '0') {
				cnt++;
			}else {
				break;
			}
		}
		
		System.out.println(cnt);
		
	}

}