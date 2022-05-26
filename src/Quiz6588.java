import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Quiz6588 {
	static boolean prime[] = new boolean[1000001]; //�����佺�׳׽��� ü�� ����ϱ� ���� ũ�Ⱑ 1000001�� boolean�� �迭 ���� �� false�� �ʱ�ȭ
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //���� �Է¹ޱ� ���Ͽ� BufferedReader ���
		StringBuilder sb = new StringBuilder(); //���ڿ��� �����Ͽ� ���� ���ڿ��� sb�� ����� ���� StringBuilder ���
		
		int n = 0; //������ ���� n���� �� 0���� �ʱ�ȭ. ¦�� ���� n�Է� �� ����� ����
		get_prime(); //�����佺�׳׽��� ä�� �ҷ���. �� 1000000������ �ڿ��� �� �Ҽ��� �Ͱ� �Ҽ��� �ƴ� ���� ������ �Լ��� ȣ��
		
		while( (n = Integer.parseInt(bf.readLine())) != 0) { //n�� ¦�� ����. ���� 0�� �Է��ϸ� �Է��� �����ٴ� �ǹ� ( ������ ���� : �Է��� ������ �ٿ��� 0�� �ϳ� �־�����.)
			int a = 2; //�Ҽ��� ���� ���� ���� 2�� ������ ���� a�� ����.   n�� ���� �� �ִ� ����� ���� �������, b-a�� ���� ū ���� ����ϹǷ� �� �� ����� ����
			int b = n - a; //n���� a�� �� ���ڸ� ������ ���� b�� ����.
			
			while(true) { //break;�� ������ ������ ���� ����
			if(!prime[a] && !prime[b] && a + b == n) { //a�� ���� �Ҽ��̰�, b�� ���� �Ҽ��̰�, a + b �� ��ģ ���� n�� ��
				break; //while �ݺ��� Ż��
			}
			
			//���� if ���ǹ��� �������� ������ ���
			a++;  //a�� 1�� ���ϰ�
			b--;  //b�� 1�� ���ش�.
			
			}
			
			if( a == n) { //���� a�� n�� ������ == �� Ȧ�� �Ҽ��� ������ n�� ��Ÿ�� �� ���� ���
				sb.append("Goldbach's conjecture is wrong.").append("\n"); //���� ���ڿ��� "Goldbach's conjecture is wrong."�� �߰��ϰ� ���๮�ڸ� �߰��Ѵ�.
			}else { //���� a�� n�� ���� ������
			sb.append(n + " =" + " " + a + " " + "+" + " " + b).append("\n"); //���� ���ڿ��� ���� �߰�
			}
			
		}
		System.out.println(sb);
	
	}
	
	public static void get_prime() {
		prime[0] = true; //0�� �Ҽ��� �ƴϹǷ� false���� true�� ����
		prime[1] = true; //1�� �Ҽ��� �ƴϹǷ� false���� true�� ����
		
		for(int i =2 ; i<= Math.sqrt(prime.length); i++) {
			if(prime[i])  continue; //���� �̹� prime[i]�� ���� �Ҽ����� true�� �ٲ��ִٸ�, continue�ؼ� ���� for�� ����.
			for(int j = i * 2 ; j < prime.length; j += i) { //
				prime[j] = true; //�Ҽ��� �ƴҰ�� true�� ��ȯ
			}
		}
	}

}

