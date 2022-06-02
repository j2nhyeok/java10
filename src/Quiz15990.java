import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz15990 {
	public static long dp[][] = new long[100001][4]; //���� ��ȹ���� ����� ����. 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(bf.readLine()); //�׽�Ʈ ���� t
		
		
		for(int i = 0 ; i< t; i++) {
			int n = Integer.parseInt(bf.readLine()); // ���� n�Է�
			
			sb.append(cnt(n)).append("\n");
			
		}
		
System.out.println(sb);
	}
	
	
	public static long cnt(int n) {
	//dp[a][b]; == ���� a�� ����� ���� ���� b�� ������ ��� .
		dp[1][1] = 1; //���� 1�� ����� ���� ���� 1�� ������ ���   1 = 1     �� ����
		dp[2][2] = 1; //���� 2�� ����� ���� ���� 2�� ������ ���   2 = 2     �� ����
		dp[3][1] = 1; //���� 3�� ����� ���� ���� 1�� ������ ���   3 = 2 1   �� ����
		dp[3][2] = 1; //���� 3�� ����� ���� ���� 2�� ������ ���   3 = 1 2   �� ����
		dp[3][3] = 1; //���� 3�� ����� ���� ���� 3���� ������ ���  3 = 3     �� ����
		dp[4][1] = 2; //���� 4�� ����� ���� ���� 1�� ������ ��� 4 = 3 1 / 4 = 1 2 1  �� ����
		dp[4][3] = 1; //���� 4�� ����� ���� ���� 3���� ������ ��� 4 = 1 3    �� ����
		
		
			for(int i = 5; i<= n; i++) { //DP ��ȭ��
				dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % 1000000009;
				dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % 1000000009;
				dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % 1000000009;
			}
		

		return (dp[n][1] + dp[n][2] + dp[n][3])  % 1000000009 ;
		
	}

}