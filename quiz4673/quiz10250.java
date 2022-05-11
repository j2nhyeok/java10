import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class quiz10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		 int T= Integer.parseInt(bf.readLine());
		 for(int i = 1; i <= T; i++) {
			 String numbers = bf.readLine();
    String[] number = numbers.split(" ");
    //(1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W)
    int H = Integer.parseInt(number[0]); // 호텔의 층 수. 
    int N = Integer.parseInt(number[2]); // N 번째 손님.
	
    int X = 0;
	int Y = 0;
  
	if(N%H == 0) {
    	 Y = H;
    	 X = N/H;
    }else {
     Y = N%H;
     X = N/H +1;
    }
    
	String answer =Integer.toString(Y * 100 + X);

    bw.write(answer);
    bw.newLine();
    }
		 bw.flush();
		 bw.close();
	}
}


