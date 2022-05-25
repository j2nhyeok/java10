import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;





public class Quiz10820 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String sentence = null;
		

		 while ((sentence = bf.readLine()) != null) {
	
	
			int lower_cnt = 0;
			int upper_cnt = 0;
			int number_cnt = 0;
			int blank_cnt = 0;
			
			for(int j = 0; j < sentence.length(); j++) {
				if(65 <= sentence.charAt(j) && sentence.charAt(j) <= 90) {
					upper_cnt++;
				}else if(97 <= sentence.charAt(j) && sentence.charAt(j) <= 122) {
					lower_cnt++;
				}
				else if(48 <= sentence.charAt(j) && sentence.charAt(j) <= 57) {
					number_cnt++;
				}
				else if(sentence.charAt(j) == 32) {
					blank_cnt++;
			}
			}bw.write(String.valueOf(lower_cnt) + " " + String.valueOf(upper_cnt) + " " + String.valueOf(number_cnt) + " " + String.valueOf(blank_cnt) + "\n");
			
		}
		bw.flush();
		bw.close();
		
	
	}

}