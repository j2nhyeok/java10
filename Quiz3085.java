import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Quiz3085 {
	public static Character candy[][];
	public static int N;
	public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	public static int cnt;
	public static ArrayList<Integer> swapMaxValue = new ArrayList<Integer>();
	public static char temp;
	
	public static void main(String[] args) throws IOException {
		int answer = 0;	
		N = Integer.parseInt(bf.readLine()); // 보드의 크기 N, 3 ≤ N ≤ 50
		candy = new Character[N][N];
		
		for(int i = 0; i < N; i++) {
			String color = bf.readLine();  //빨간색은 C, 파란색은 P, 초록색은 Z, 노란색은 Y    // PPP
			
			for(int j = 0 ; j < N ; j++) {   
				candy[i][j] = color.charAt(j);		
			}		
		}
			
		
	
			answer = EatableMaxCnt();
		
		
System.out.println(answer);
	}


	
	private static int EatableMaxCnt() {
		for(int i = 0; i < N - 1; i++) {
		
				Swap(candy[i][i], candy[i][i + 1]);
				swapMaxValue.add(ColMaxCal(i));
				Swap(candy[i][i], candy[i][i + 1]);
				
			
			
				Swap(candy[i][i], candy[i + 1][i]);
				swapMaxValue.add(RowMaxCal(i));
				Swap(candy[i][i], candy[i + 1][i]);
		
		}
		System.out.println(swapMaxValue);
		return Collections.max(swapMaxValue);
	
}
	private static int RowMaxCal(int i) {
		int cnt1 = 1;
		int cnt2 = 1;
		int maxCnt1 = 0;
		int maxCnt2 = 0;
		for(int k = 0; k < N ; k++) {
			for(int j = 0; j < N ; j++) {
			System.out.print(candy[k][j] + " ");
			}
			System.out.println();
		}
		for(int j = 0 ; j < N -1 ; j++) {
			if(candy[i][j] == candy[i][j+1]) {
				cnt1++;
			}else {
				maxCnt1 = Math.max(maxCnt1, cnt1);
				cnt1 = 0;
			}
			
			if(candy[i + 1][j] == candy[i + 1][j + 1]) {
				cnt2++;
			}else {
				maxCnt2 = Math.max(maxCnt2, cnt2);
				cnt2 = 0;
			}
		
		
		}
		return Math.max(maxCnt1, maxCnt2);
	}

	private static void Swap(char A, char B) {
		System.out.println(A);
		System.out.println(B);
		
		temp = A;
		System.out.println(temp);
		
		A = B;
		System.out.println(A);
		
		B = temp;
		System.out.println(B);
	}
	
	public static int ColMaxCal(int i) {
		int cnt1 = 1;
		int cnt2 = 1;
		int maxCnt1 = 0;
		int maxCnt2 = 0;
		for(int k = 0; k < N ; k++) {
			for(int j = 0; j < N ; j++) {
			System.out.print(candy[k][j] + " ");
			}
			System.out.println();
		}
		for(int j = 0 ; j < N -1 ; j++) {
			if(candy[j][i] == candy[j+1][i]) {
				cnt1++;
			}else {
				maxCnt1 = Math.max(maxCnt1, cnt1);
				cnt1 = 0;
			}
			
			if(candy[j][i + 1] == candy[j + 1][i + 1]) {
				cnt2++;
			}else {
				maxCnt2 = Math.max(maxCnt2, cnt2);
				cnt2 = 0;
			}
		
		
		}
		return Math.max(maxCnt1, maxCnt2);
	}
	
}
