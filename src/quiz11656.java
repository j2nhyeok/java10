import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class quiz11656 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //���� �Է¹ޱ� ���Ͽ� BufferedReader ���
		StringBuilder sb = new StringBuilder(); //���ڿ��� �����Ͽ� ���� ���ڿ��� sb�� ����� ���� StringBuilder ���
		
		String S = bf.readLine(); //ù° �ٿ� ���ڿ� S�� �־�����. S��  ���ĺ� �ҹ���. ���̴� 1,000���� �۰ų� ����.
		
		String suffix[]  = new String[S.length()];  //���ڿ��� ���̸�ŭ ũ�⸦ ���� ���ڿ� �迭 suffix����
		
		for(int i = 0; i < S.length(); i++) {  //���ڿ��� ���̸�ŭ �ݺ��� ����
			suffix[i]    =   S.substring(i, S.length()); //���ڿ��� �߶��ִ� .substring()�޼��带 ����Ͽ� ���ڸ� �ڸ� �� suffix�迭�� ������� ����
		}
		
		

	
	Arrays.sort(suffix); //���ڿ� �迭�� suffix�� ���������� ������������ ����
	
	for(int k = 0; k < suffix.length; k++) {  //���� ���.
		System.out.println( suffix[k]);
	}

	}

}
