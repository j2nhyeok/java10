import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class quiz1427 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //���� �Է¹ޱ� ���� BufferedReader ���
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //���� ����ϱ� ���� BufferedWriter ���
	
	int N = Integer.parseInt(bf.readLine()); //N�� �����Ϸ��� �ϴ� �� N. N�� 1,000,000,000���� �۰ų� ���� �ڿ���
	
	ArrayList<Integer> number = new ArrayList<Integer>(); //������ ����Ʈ number ����
	
	while(N != 0) { // N�� 0�� �ƴϸ� while�� ����. 
		number.add(N % 10); //number ����Ʈ�� N�� 10���� ���� ������ ���� �߰��Ѵ�.
		N /= 10; // �� ������ ������ �� N�� 10���� ���� ���� N�� �������Ѵ�.
	}
	
	Collections.sort(number, Collections.reverseOrder()); //Collections.sort�� ����Ͽ� ������������ ����Ʈ�� ����
	
	for(int i = 0 ; i < number.size(); i++) //number.size()��ŭ for�� �ݺ� 
	{
		bw.write(String.valueOf(number.get(i))); //���
	}
	
	
	bw.close();
	}

}
