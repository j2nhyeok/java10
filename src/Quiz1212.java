import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz1212 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //���� �Է¹ޱ� ���Ͽ� BufferedReader ���
		StringBuilder sb = new StringBuilder(); //���� ���ڿ��� �����Ͽ� ���� ���ڿ��� ����� ���� StringBuilder ���
		
		String octo = bf.readLine(); //���ڿ��� 8������ �Է¹��� . 10������ 8^333334 �� ���� ���� �� �־� ���� ������ ����� �� ����.
		
		
		if(octo.equals("0")) System.out.println(0); //���� 8������ 0�� �ԷµǾ��� ��, 0�� ����ϰ� ���α׷� ���� (�������� : ���� 0�� ��츦 �����ϰ�� �ݵ�� 1�� �����ؾ� �Ѵ�.)
		
		else { //���� �Էµ� 8������ 0 �� �ƴ� �� 
		
		String num[] = octo.split(""); //�� �ڸ��� �и��Ͽ� ���ڿ� �迭 num�� ������� ����
		
		for( int i  = 0; i < num.length; i++) {	 //num�迭 ���̸�ŭ �ݺ��� ����
			int n = Integer.parseInt(num[i]); //num�迭�� �ִ� ���ڿ��� �� ���ڸ� ���������� ��ȯ �� �� ������ ���� n�� ����
			
			switch(n) { //8������ 0~7�ۿ� ǥ�� ���ϹǷ� n�� ���� ���� �ش� ���ڿ��� ���� ���ڿ� sb�� �߰��� �� switch�� Ż��
			case 0:  
				sb.append("000"); break;
			case 1:
				sb.append("001"); break;
			case 2:
				sb.append("010"); break;
			case 3:
				sb.append("011"); break;
			case 4:
				sb.append("100"); break;
			case 5:
				sb.append("101"); break;
			case 6:
				sb.append("110"); break;
			case 7:
				sb.append("111"); break;
		
			}
			
			
		}
		//���� ���ǿ��� ���� 0�� ��츦 �����ϰ�� �ݵ�� 1�� �����ؾ� �Ѵٰ� �Ͽ����Ƿ� ���� ���ڿ� ���ʿ� �ִ� 0�� ���� ����
		while(sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
			
		
		

		
		
		
		
		
		
		System.out.println(sb);
	
		}
	}
}
