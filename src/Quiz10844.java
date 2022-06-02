import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz10844 {
	public static long dp[][];
	public static long sum = 0l; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 
	 int N = Integer.parseInt(bf.readLine()); //ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 100���� �۰ų� ���� �ڿ���
	
	 dp =  new long[N+1][10];
	 
	System.out.println(stair_cnt(N));

	}
	
	private static long stair_cnt(int n) {
		dp[1][0] = 0; //0���� �����ϴ� ���� ��ܼ��� �ƴϴ�.


		
		for(int i = 1; i < 10; i++) {  // ù ��° �ڸ����� ������ �� ���� �ڸ����̹Ƿ� ����� ���� 1���ۿ� ���� 
			dp[1][i] =1;
		}
		
		for(int j = 2; j <= n ; j++) { // �� ��° �ڸ������� N���� Ž�� 
			
			for(int i = 0; i <10; i++) { // i��° �ڸ����� �ڸ������� Ž�� (0~9) 
			
				if(i == 0) dp[j][0] = dp[j-1][1] % 1000000000; // i = 0, �� �ڸ����� 0�̶�� ���� �ڸ����� ù��° �ڸ����� ����
				else if(i == 9) dp[j][9] = dp[j-1][8] % 1000000000; // i = 9��� ���� �ڸ����� 8�� ����
				else { // �� ���� ��� ���� �ڸ����� �ڸ��� +1, -1 �� ���� �� 
					dp[j][i] = (dp[j-1][i - 1] + dp[j-1][i + 1]) % 1000000000;
				}
			
			}
		}
		// �� �ڸ��������� ����� ���� ��� �����ش�. 
		for(int j = 0; j < 10; j++) {
			sum +=  dp[n][j]  %  1000000000 ;
		}
		
		
		return sum %  1000000000 ;
	}
}
