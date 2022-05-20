import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class quiz11650 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 값이 입력 받기 위해 BufferedReader 사용.
		
		StringBuilder sb = new StringBuilder(); //문자열을 저장할 sb 선언 == 나중에 정답을 출력할 때 사용할 예정.
		
		int N = Integer.parseInt(bf.readLine()); //2차원 평면 위의 점 N개. 첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 

		int coordinate[][] = new int[N][2]; //N개의 좌표의 위치를 저장 할 이중배열 선언.
		
		StringTokenizer st;
	
		
		for(int i = 0; i<N ; i++) { //평면 위의 점 N개 만큼 for문 실행
			st = new StringTokenizer(bf.readLine(), " "); //좌표를 문자열로 입력 받아 공백으로 분리
	
	

			coordinate[i][0] = 	Integer.parseInt(st.nextToken()); //공백으로 분리한 x좌표를 coordinate[i][0]에 저장.
			coordinate[i][1] = 	Integer.parseInt(st.nextToken()); //공백으로 분리한 y좌표를 coordinate[i][1]에 저장.
			
		}
		
	 Arrays.sort(coordinate, new Comparator<int[]>() { //Arrays.sort를 사용하여 coordinate배열을 정렬할 예정.

		@Override
		public int compare(int[] o1, int[] o2) { //Comparator 사용
			if(o1[0] == o2[0])  //x좌표가 같다면,
				return o1[1] - o2[1]; //y좌표끼리 비교하여 오름차순 정렬.
			
			else //x좌표가 같지 않다면,
				return o1[0] - o2[0]; //x좌표끼리 비교하여 오름차순 정렬.
			
		
		}
		 
	 });
		
		
		
		
		for(int j= 0 ; j < N  ; j++) { //N의 수 만큼 for문 반복 실행.
		sb.append(String.valueOf(coordinate[j][0]) +" " + String.valueOf(coordinate[j][1])).append("\n"); //StringBuilder sb에 String.valueOf(coordinate[j][0]) +" " + String.valueOf(coordinate[j][1] 추가 후 개행문자 추가
		
		}
		
	System.out.println(sb); //그렇게 저장된 sb 출력 == 정답
	
		}
		
	}
