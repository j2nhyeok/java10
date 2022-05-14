
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class quiz2447 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String[][] starArr = new String[N][N];

		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				starArr[i][j] = " ";
			}
		}
		
		star_pattern(starArr, 0, 0, N);
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				bw.write(starArr[i][j]);					
			}
			bw.write("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
		
	}
	
	public static void star_pattern(String[][] starArr, int x, int y, int N) {
		
		if(N == 1) {
			starArr[x][y] = "*";
			return;
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				if(!(i == 1 && j == 1)) {
					star_pattern(starArr, x + i*(N/3), y + j*(N/3), N/3);
				}
			}
		}
	}
}
