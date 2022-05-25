import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz10808 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cnt[] = new int[26];
		
		String sentence = bf.readLine();
		
		for(int i = 0; i < 26; i++) {
			cnt[i] = 0;
		}
		
		for(int i = 0; i < sentence.length(); i++) {
			
			cnt[(int)sentence.charAt(i) - 97]++;
		}
		
		for(int i = 0; i < 26; i ++) {
			System.out.print(cnt[i] + " ");
		}
	}

}
