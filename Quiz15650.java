import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz15650 {
	public static int numbers[];
	public static boolean visit[];
	public static StringBuilder sb = new StringBuilder();
	public static int at = 0;
	
	public static void main(String[] args) throws IOException {
    
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		numbers = new int[M];
		visit = new boolean[N];
		
		solved(N, M, 0);
		
		System.out.println(sb);
	}
	
	public static void solved(int N, int M, int cnt) {
		if(cnt == M) {
			for(int i = 0; i < M; i++) {
				sb.append(numbers[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = at; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				at = numbers[cnt] = i +1;
				solved(N, M,cnt + 1);
				visit[i] = false;
			}
		}
	}
}
