import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class quiz11651 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //���� �Է¹ޱ� ���Ͽ� BufferedReader ���
		StringBuilder sb = new StringBuilder(); //������ ���� ���� StringBuilder sb ����.
		
		int N = Integer.parseInt(bf.readLine()); //ù° �ٿ� ���� ���� N (1 �� N �� 100,000)�� �־�����. 
		
		int[][] coordinate = new int[N][2]; //�� ���� ��ǥ (x,y)�� �������� ���߹迭 coordinate ����
		
		StringTokenizer st; 
		for(int i = 0; i < N ; i++) { // N��ŭ �ݺ��� ����
			st = new StringTokenizer(bf.readLine(), " "); //�� �ٷ� x��ǥ y��ǥ�� �Է¹޾� �������� �и��� �� st�� ����
			coordinate[i][0] = Integer.parseInt(st.nextToken()); //st�� ���� �� ���� (x��ǥ)�� ���������� �� ��ȯ�� coordinate[i][0]�� ����
			coordinate[i][1] = Integer.parseInt(st.nextToken()); ////st�� ���� �� ���� (y��ǥ)�� ���������� �� ��ȯ�� coordinate[i][1]�� ����
			
		}
		
		Arrays.sort(coordinate, new Comparator<int[]>() { //coordinate ���߹迭�� �ؿ� �ִ� ���ǿ� ���� ������ ����.

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1])       //y��ǥ�� ���� ���
					return o1[0] -o2[0]; //x��ǥ�� �����ϴ� ������ ����.
				else                    //y��ǥ�� ���� ���� ��� 
					return o1[1] - o2[1]; //y��ǥ�� �����ϴ� ������ ����
			}
			
		});
			
		for(int j = 0; j < N ; j++) { //N�� ũ�⸸ŭ �ݺ��� ����
			sb.append(coordinate[j][0] + " " + coordinate[j][1]).append("\n"); //���߹迭�� x��ǥ " " y��ǥ �׸��� ���๮�ڸ� sb�� ����
		}
	System.out.println(sb); //sb ��� == ����.
	}
}
