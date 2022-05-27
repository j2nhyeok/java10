import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz1212 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String octo = bf.readLine();
		
		
		if(octo.equals("0")) System.out.println(0);
		
		else {
		
		String num[] = octo.split("");
		
		for( int i  = 0; i < num.length; i++) {	
			int n = Integer.parseInt(num[i]);
			
			switch(n) {
			case 0: 
				sb.append("000"); break;
			case 1:
				sb.append("001"); break;
			case 2:
				sb.append("010"); break;
			case 3:
				sb.append("011"); break;
			case 4:
				sb.append("100"); break;
			case 5:
				sb.append("101"); break;
			case 6:
				sb.append("110"); break;
			case 7:
				sb.append("111"); break;
		
			}
			
			
		}
		
		while(sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
			
		
		

		
		
		
		
		
		
		System.out.println(sb);
	
		}
	}
}
