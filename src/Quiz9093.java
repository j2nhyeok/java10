import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // ���� �Է��ϱ� ���Ͽ� BufferedReader ���
		StringBuilder sb = new StringBuilder(); //���ڿ��� ������ �� ������ ����ϱ� ���Ͽ� StringBuilder ���
		StringTokenizer st; 

		int T = Integer.parseInt(bf.readLine()); //ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. 
		
		for(int i = 0; i < T ; i++) { //�׽�Ʈ�� ���̽��� ���� T��ŭ for�� ����
			st = new StringTokenizer(bf.readLine(), " "); // ���ڿ��� ���� ������ �Է¹޾� �������� �ܾ���� �и��� �� st�� ����
			
			while(st.hasMoreTokens()) { // st�� ��ū ���� ���� ��� = true -> while�� ����, st�� ��ū ���� ��� ����ϰ� �����ִ� ��ū ���� ���� ��� false -> while�� ���� stop
			
				sb.append(new StringBuilder(st.nextToken()).reverse().toString()).append(" "); //��ū (=���ܾ�)�� �Ųٷ� ���� �� sb�� �߰��ϰ� ���� �߰�
			}
			sb.append("\n"); //���ܾ�� �̷���� ���� �� ���� �Ųٷ� ��������� ���� ����� �����ϱ� ���� �������� �߰�
		}
		
		
		
		System.out.println(sb); //�������
	}
}