import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class quiz1978 {
	static int PrimeNumbers[] = new int[999];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int[] number_IntArray = new int[N];
		int cnt = 0;
		
		String numbers = bf.readLine();
		String[] number_StringArray = numbers.split(" ");

	        for (int i = 0; i < number_StringArray.length; i++) {
	            number_IntArray[i] = Integer.parseInt(number_StringArray[i]);
	        }
		
		for(int j = 0 ; j < N ; j++) {
					 if(checker(number_IntArray[j]){
						 cnt++;
					 }
		}
		  
	}
	public static boolean checker(int n) {
		for(int i = 0; i < 999; i++) {
			PrimeNumbers[i] = i+2;
		}
		List<Integer> PrimeNumbers2= Arrays.stream(PrimeNumbers).boxed().collect(Collectors.toList());
		for(int j = 2 ; j <=31; j++) {
			for(int k = 1; j*k<=1000;k++) {
				PrimeNumbers2.remove(Integer.valueOf(j * k));
			}
		}
		
	}
}
