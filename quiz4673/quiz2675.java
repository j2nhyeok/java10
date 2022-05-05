import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class quiz2675 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bf.readLine());  //T는 테스트 케이스의 개수 (1<=T<=1,000)
		for(int i = 0; i < T; i++) {
			String c = null;
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			int R = Integer.parseInt(st.nextToken());
			String word = st.nextToken();
			
			String[] word_arr = word.split("");
			
			for(int j = 0; j < word_arr.length; j++) {
				c += word_arr[j].repeat(R) ;
			
			}
			bw.write(c + " \n");	
				}	
		bw.close();
	}
}
