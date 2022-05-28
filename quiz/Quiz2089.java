import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2089 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(bf.readLine());
	
		if(N == 0 ) System.out.println(0);
		
		else {
			while(N != 1) {
			sb.append(Math.abs(N % -2));
				 N = (int)Math.ceil((double)N/-2);
			
			}
			sb.append(N);
			
			System.out.println(sb.reverse());
		}
	}

}
