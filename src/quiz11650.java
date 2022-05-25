import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class quiz11650 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());

		int coordinate[][] = new int[N][2];
		
		StringTokenizer st;
	
		
		for(int i = 0; i<N ; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
	
	

			coordinate[i][0] = 	Integer.parseInt(st.nextToken());
			coordinate[i][1] = 	Integer.parseInt(st.nextToken());
			
		}
		
	 Arrays.sort(coordinate, new Comparator<int[]>() {

		@Override
		public int compare(int[] o1, int[] o2) {
			if(o1[0] == o2[0]) 
				return o1[1] - o2[1];
			
			else
				return o1[0] - o2[0];
			
		
		}
		 
	 });
		
		
		
		
		for(int j= 0 ; j <= N -1 ; j++) {
		sb.append(String.valueOf(coordinate[j][0]) +" " + String.valueOf(coordinate[j][1])).append("\n");
		
		}
		
	System.out.println(sb);
	
		}
		
	}

