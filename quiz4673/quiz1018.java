import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 

public class quiz1018 {

	public static void main(String[] args) throws IOException {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

		 
	 int row = Integer.parseInt(st.nextToken()); //N == row
	 int col = Integer.parseInt(st.nextToken()); // M == col
	char[][] chess = new char[row][col];
	 for(int i = 0; i < row ; i++) {
		 String sentence = bf.readLine();  
		 String[] sentence2 = sentence.split("");
		 
		 for(int j = 0; j<col;j++) {
			 chess[i][j] = sentence2[j].charAt(0);
		 }
	 }

	 int cursor = Integer.MAX_VALUE;
	 for(int a = 0; a < row - 7; a++ ) {
		 for(int b = 0; b < col - 7; b++) {
			 int sol = min_cnt(a,b,chess);
			 
			 if(cursor > sol) {
				 cursor = sol;
			 }
		 }
	 }
	 System.out.println(cursor);
	}
	
	public static int min_cnt(int start_row, int start_col, char[][] chess) {
		String[] orgboard = {"WBWBWBWB", "BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW"};
		int modify = 0;

		
		for(int a = start_row ; a < start_row +  8; a++) {
			
			for(int b = start_col ; b < start_col +  8; b++) {
				int col = start_col + b;
		
				
				if(chess[a][b] != orgboard[a-start_row].charAt(b-start_col)) {
				modify++;
				}
				
				}
			
			}
		
		return Math.min(modify, 64-modify) ;
	}
}
