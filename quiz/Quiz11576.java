import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz11576 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken()); //미래세계 사용 진법  A
		int B = Integer.parseInt(st.nextToken()); // 정이가 사용하는 진법 B
		
		int m = Integer.parseInt(bf.readLine()); //A진법으로 나타낸 숫자의 자리수의 개수 m
		
		StringTokenizer st1 = new StringTokenizer(bf.readLine(), " "); //세 번째 줄에는 A진법을 이루고 있는 숫자 m개가 공백을 구분으로 높은 자릿수부터 차례대로 주어진다.
													  //각 숫자는 0이상 A미만임이 보장된다. 
													  //또한 수가 0으로 시작하는 경우는 존재하지 않는다.
		int change_10 = 0;
        for(int i = 0; i < m; i++) {
        	change_10 += Integer.parseInt(st1.nextToken()) * Math.pow(A, st1.countTokens());
        	
        }   
       
        while(change_10 > B) {
        	
        	sb.append(change_10 % B).append(" ");
        	change_10 = change_10 /B;
        	
        } sb.append(change_10);
        
    
        String sentence = sb.toString();
        
       String N[] = sentence.split(" ");
       
       for(int i = N.length - 1; 0<= i ; i--) {
    	   System.out.print(N[i] + " ");
       }
      
	}
}
