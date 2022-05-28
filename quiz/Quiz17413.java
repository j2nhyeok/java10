import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Quiz17413 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < 100; i++) {
			
		

			String sentence = bf.readLine();
			if(sentence.length() == 0) break;
			else {
			int lower_cnt = 0;
			int upper_cnt = 0;
			int number_cnt = 0;
			int blank_cnt = 0;
			
			for(int j = 0; j < sentence.length(); j++) {
				if(65 <= (int)sentence.charAt(j) && (int)sentence.charAt(j) <= 90) {
					upper_cnt++;
				}else if(97 <= (int)sentence.charAt(j) && (int)sentence.charAt(j) <= 122) {
					lower_cnt++;
				}
				else if(48 <= (int)sentence.charAt(j) && (int)sentence.charAt(j) <= 57) {
					number_cnt++;
				}
				else if((int)sentence.charAt(j) == 32) {
					blank_cnt++;
				}
			}
			bw.write(String.valueOf(lower_cnt) + " "  + String.valueOf(upper_cnt) + " " + String.valueOf(number_cnt) + " " + String.valueOf(blank_cnt) + "\n");
		}
		}
		
		bw.flush();
		bw.close();
	}

}