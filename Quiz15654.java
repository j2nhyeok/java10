import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz15654 {
	public static int numbers[];
	public static StringBuilder sb = new StringBuilder();
	public static int arr[];
	public static int N, M = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer st1 = new StringTokenizer(bf.readLine(), " ");
		N = Integer.parseInt(st1.nextToken());
		 M = Integer.parseInt(st1.nextToken());
	
		
		numbers = new int[N];
		arr = new int[M];
		
		StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");
		for(int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st2.nextToken());
		}
			
		Arrays.sort(numbers);

	
		
		solved(0);
		
		System.out.println(sb);

	}
	public static void solved( int cnt) {

	    
	    
	    
	    if(cnt == M) {
	    	for(int i = 0 ; i < M ; i++) {
	    		sb.append(arr[i]).append(" ");
	    		
	    	}
	    	sb.append("\n");
	    return;
	    }
	    
	    
	    for(int i = 0; i < N ; i++) {
	    	arr[cnt] = numbers[i];
	    	solved(cnt + 1);
	    }
	
	    
	}
}
