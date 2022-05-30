import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

	public static Integer dp[]; 
	
	public static void Quiz1463(String[] args) throws NumberFormatException, IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	 int N = Integer.parseInt(bf.readLine()); // 첫째 줄에 1보다 크거나 같고, 10^6보다 작거나 같은 정수 N이 주어진다.

	
	 dp = new Integer[1000001]; //N이 10^6이므로 0까지 포함하여 1000001 크기의 다이나믹프로그래밍을 듯하는 dp 배열 할당.
	 							//N의 값에 따라 1로 만들기 위해 필요로 하는 연산 횟수의 최솟값을 배열에 저장할 계획.

	 
	 
	 System.out.println(recur(N));
	 
	}
	
	public static int recur(int N) {
		
		 dp[0] = 0; //N은 1보다 크거나 같으니 0이 올 수 없다. 고로 dp[0]값에 0을 할당.
		 dp[1] = 0; //N이 1일 때 1로 만들기 위해 더이상 연산할 필요가 없으니 dp[1] = 0;
		 dp[2] = 1; //N이 2일 때 -1 한 번만 하면 되므로 dp[2] = 1;
		 dp[3] = 1; //N이 3일 때 /3 한 번만 하면 되므로 dp[3] = 1;
		 
		if(dp[N] == null) { //만약 dp[N]값이 null이면
			
			//최소 연산횟수를 return 해야 하므로 Math.min 사용
			if(N % 6 == 0){  
				dp[N] = Math.min( Math.min(recur(N - 1/2), recur(N/3)), recur(N/2)) + 1; //마지막에 +1을 해주는 이유는 +1 바로 앞에 연산을 한 번 했다는 의미로 +1
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