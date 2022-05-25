import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Quiz18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(bf.readLine()); //ÁÂÇ¥ÀÇ °³¼ö , 1 ¡Â N ¡Â 1,000,000
		int Xi[] = new int[N];
		int sorted[] = new int[N];
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		for(int i = 0; i < N ; i++) {
			sorted[i] = Xi[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sorted);
		
		int rank = 0;
		
		for(int j = 0; j < sorted.length; j++) {
			if(!rankingMap.containsKey(sorted[j])) {
				rankingMap.put(sorted[j],rank);
				rank++;
			}
		}
		
		for(int k = 0; k < N; k++) {
			sb.append(rankingMap.get(Xi[k])).append(" ");
		}
		System.out.println(sb);
		
	}

}
