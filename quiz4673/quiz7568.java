import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz7568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		int[][] spec = new int[N][2];
		
		String[] str;
		for(int i = 0 ; i < N; i++)
		{
	
		
			str =bf.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			
			spec[i][0] = x;
			spec[i][1] = y;
		}
		StringBuilder sb = new StringBuilder();
		
		for(int j = 0 ; j < N  ; j++) {
			int rank = 1;
			for(int k = 0; k< N ; k++) {
				if(spec[j][0] < spec[k][0] && spec[j][1] < spec[k][1]) {
					rank++;
				}
			}
			sb.append(rank).append(" ");
		}
		
System.out.println(sb);
}
}
