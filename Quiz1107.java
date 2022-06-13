import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz1107 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	
		int minCnt = 0;

		//수빈이의 현재 채널 100
		int N = Integer.parseInt(bf.readLine()); // 수빈이가 이동하려고 하는 채널 N (0 ≤ N ≤ 500,000)
		
		
		
		int M = Integer.parseInt(bf.readLine()); // 고장난 버튼의 개수 M (0 ≤ M ≤ 10)
	
		
		boolean[ ] broken = new boolean[10];
		if(M != 0) {
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		for(int i = 0 ; i <M ; i++) {
			broken[Integer.parseInt(st.nextToken())] = true;
		}
		}
	
		minCnt = Math.abs(N - 100);
	
		for(int i = 0 ; i <= 999999; i++) {
			String str = String.valueOf(i);
			
			int len = str.length();
			
			boolean isbroken = false;
			
			for(int j = 0; j < len; j++) {
				if(broken[Character.getNumericValue(str.charAt(j))]){
					isbroken = true;
				}
			
			}
			
			if(!isbroken) {
				minCnt = Math.min(minCnt, len + Math.abs(N - i));
		
			}
			
			
		}
		System.out.println(minCnt);
	}

}