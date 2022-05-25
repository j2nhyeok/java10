import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); //N은 10,000보다 작거나 같은 자연수
		int cnt = 0;
		 for(int i = 666; i <Integer.MAX_VALUE; i++) {
			 String i2 = String.valueOf(i);
			 if(i2.contains("666")) {
				 cnt++;
			 }
			 
			 if(cnt == N) {
				 System.out.println(i2);
				 break;
			 }
					 
		 }
	}

}
