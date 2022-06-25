import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz1759 {
	public static ArrayList<Character> consnants = new ArrayList<>();
	public static ArrayList<Character> vowels = new ArrayList<>();
	public static String arr[]; 
	public static String apb[];
	public static boolean visited[];
	public static StringBuilder sb = new StringBuilder();
	
	public static int start = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer st1 = new StringTokenizer(bf.readLine(), " ");
		// (3 ≤ L ≤ C ≤ 15)
		int L = Integer.parseInt(st1.nextToken());
		int C = Integer.parseInt(st1.nextToken());
		
		arr = new String[L];
		visited = new boolean[C];
		
		
		String sentence = bf.readLine();
		apb = sentence.split(" ");
		
		for(String a : apb) {
			if(a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u") ) {
				vowels.add(a.charAt(0));
			}else {
				consnants.add(a.charAt(0));
			}
			
		}
		
		
		Arrays.sort(apb);
		
		solved(L, C, 0);
		
		System.out.println(sb);

	}
	
	public static void solved(int L , int C,int cnt) {
		if(cnt == L) {
			int vowelsCount = 0;
			int consnantsCount = 0;
			for(String a : arr) {
				if(a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u") ) {
					vowelsCount++;
				}else {
					consnantsCount++;
				}
			}
			
			if(vowelsCount >= 1 && consnantsCount >= 2) {
				for(String a : arr) {
					sb.append(a);
				}
				sb.append("\n");
			}
			
			return;
		}
		
		for(int i = start; i < apb.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				start = i + 1; 
				arr[cnt] = apb[i];
				
				solved(L, C, cnt + 1);
				visited[i] = false;
			}
		}
	}

}
