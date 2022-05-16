import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class practice {

	public static void main(String[] args) throws IOException {
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 String sentence = bf.readLine();
		 
		 String[] sentence2 = sentence.split("");
		 
		 char aj[][] =new char[9][9];
		aj[0][0] = sentence2[1].charAt(0);
	

		
		System.out.println(aj[0][0]);
		

}
}






