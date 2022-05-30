import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static Integer dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine()); //ù° �ٿ� n�� �־�����. (1 �� n �� 1,000)
		
		 dp = new Integer[1001];  //N�� 1000���� �̹Ƿ� 0���� �����Ͽ� 1000 ũ���� ���̳������α׷����� ���ϴ� dp �迭 �Ҵ�.
		 							//N�� ���� ����  2��n ũ���� ���簢���� ä��� ����� ���� �� �迭�� ���� �� ����.

		
		 System.out.println(recur(n) );
	}
	
	public static int recur(int n) { 
		dp[0] = 0;  //N�� 0�� �� ��� 0
		dp[1] = 1;  //N�� 1�� �� ��� 1
		dp[2] = 2; //N�� 2�� �� ��� 2
		dp[3] = 3; //N�� 3�� �� ��� 3
		dp[4] = 5; // . . .
		dp[5] = 8; //dp[n] = dp[n-2] + dp[n-1]

		
		if(dp[n] == null) { //dp[n]�� null�� �ƴ϶��

	
			
			dp[n] = recur(n -1) + recur(n-2); //��ȭ�Ŀ� ���� ����Լ�
			
			
		
		}
		
		
		return dp[n] % 10007; 
		

		
	}

}