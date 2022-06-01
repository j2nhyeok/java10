import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz11727 {
	public static Integer dp[] = new Integer[1001]; // 동적 계획을 사용하기 위해 Integer형 dp배열 선언 후 자동으로 null로 초기화
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader bf =new BufferedReader(new InputStreamReader(System.in)); // 값을 입력받기 위해 BufferedReader 사용
    	
    	int n = Integer.parseInt(bf.readLine()); // n 입력 .  1<= n <= 1000
    	
    	System.out.println(cnt(n));
    }
    
    public static int cnt(int n) {
    	dp[0] = 0;
    	dp[1] = 1;
    	dp[2] = 3;
    	
    	if(dp[n] == null) {
    		dp[n] =cnt(n-2) * 2 + cnt(n-1);
    		
    	}
    	
    	
    	
    	
    	return dp[n] % 10007; 
    }
}