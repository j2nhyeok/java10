import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

	public static Integer dp[]; 
	
	public static void Quiz1463(String[] args) throws NumberFormatException, IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	 int N = Integer.parseInt(bf.readLine()); // ù° �ٿ� 1���� ũ�ų� ����, 10^6���� �۰ų� ���� ���� N�� �־�����.

	
	 dp = new Integer[1000001]; //N�� 10^6�̹Ƿ� 0���� �����Ͽ� 1000001 ũ���� ���̳������α׷����� ���ϴ� dp �迭 �Ҵ�.
	 							//N�� ���� ���� 1�� ����� ���� �ʿ�� �ϴ� ���� Ƚ���� �ּڰ��� �迭�� ������ ��ȹ.

	 
	 
	 System.out.println(recur(N));
	 
	}
	
	public static int recur(int N) {
		
		 dp[0] = 0; //N�� 1���� ũ�ų� ������ 0�� �� �� ����. ��� dp[0]���� 0�� �Ҵ�.
		 dp[1] = 0; //N�� 1�� �� 1�� ����� ���� ���̻� ������ �ʿ䰡 ������ dp[1] = 0;
		 dp[2] = 1; //N�� 2�� �� -1 �� ���� �ϸ� �ǹǷ� dp[2] = 1;
		 dp[3] = 1; //N�� 3�� �� /3 �� ���� �ϸ� �ǹǷ� dp[3] = 1;
		 
		if(dp[N] == null) { //���� dp[N]���� null�̸�
			
			//�ּ� ����Ƚ���� return �ؾ� �ϹǷ� Math.min ���
			if(N % 6 == 0){  
				dp[N] = Math.min( Math.min(recur(N - 1/2), recur(N/3)), recur(N/2)) + 1; //�������� +1�� ���ִ� ������ +1 �ٷ� �տ� ������ �� �� �ߴٴ� �ǹ̷� +1
			}
			else if(N % 3 == 0) {
				dp[N] = Math.min(recur(N/3) , recur(N-1)) + 1;
			}
			else if(N % 2 == 0) {
				dp[N] = Math.min(recur(N/2), recur(N-1)) + 1;
				
			}else {
				dp[N] = recur(N-1) + 1 ;
			}
		}
		return dp[N];
		
	}
}