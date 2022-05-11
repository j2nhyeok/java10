import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz2775 {
	public static int[][] cnt = new int[15][14];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int T = Integer.parseInt(bf.readLine());
		for(int j = 0; j<T;j++) {
			int k = Integer.parseInt(bf.readLine());
			int n = Integer.parseInt(bf.readLine());
			
			int answer = people(k,n);
			sb.append(answer).append("\n");
			
		}
		System.out.println(sb);
	}
	public static int people(int floor, int room) {
		int people_count = 0;
		for(int i = 0 ; i < 14; i++) {
			cnt[0][i] = i+1;
			cnt[i][0] = 1;
		}
		
		for(int j = 0 ; j < room; j++) {
			people_count += cnt[floor-1][j];
		}
		
		return people_count;
	}

}
