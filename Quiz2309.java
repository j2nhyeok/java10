import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Quiz2309 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int dwarfs[] = new int[9];
		int sum = 0;
	
		
		for(int i = 0 ; i <= 8 ; i++) {
			dwarfs[i] = Integer.parseInt(bf.readLine()); 
			sum += dwarfs[i];   
		} 
		
		
	
		
		for(int i = 0; i  <= 7 ; i++) {
			for(int j = i + 1; j <= 8; j++) {
				if(dwarfs[i] + dwarfs[j] == sum - 100){
					dwarfs[i] = dwarfs[j] = 0;
					break;
				}
			}
			
			if(dwarfs[i] == 0) {
				break;
			}
		
		}
		
		Arrays.sort(dwarfs);
		
		for(int i = 2; i <= 8; i++) {
			System.out.println(dwarfs[i]);
		}
		

}
}

