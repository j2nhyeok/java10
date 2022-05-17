import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 

public class quiz1018 {

	public static void main(String[] args) throws IOException {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위해 BufferedReader 사용
	 StringTokenizer st = new StringTokenizer(bf.readLine(), " "); //한 줄로 특정값을 입력 받아 공백을 기준으로 분리한 후 StringTokenizer형인 st변수에 저장

		 
	 int row = Integer.parseInt(st.nextToken()); //N == row. st변수에 제일 첫 번째 요소를 정수형으로 형 변환 후 정수형 변수 row(행)에 저장
	 int col = Integer.parseInt(st.nextToken()); // M == col. st변수에 제일 첫 번째 요소(원래 두 번째 요소지만 위에서 제일 첫 번째 요소가 빠졌으므로)를 정수형으로 형 변환 후 정수형 변수 col(열)에 저장.
	char[][] chess = new char[row][col]; //[row][col]크기만큼 문자형 이중배열 chess 선언. 각 요소는 B 혹은 W를 저장하므로 문자형 배열로 정했다.
	 for(int i = 0; i < row ; i++) { //행 개수 만큼 for문 실행
		 String sentence = bf.readLine();  //문자열 입력받음. 예를 들어 BWBWBWBWWB, WBWWWWWBBBB 등등..
		 String[] sentence2 = sentence.split(""); //위에서 입력 받은 문자열을 ""로 분리 한 후 문자열 배열 sentence2에 순서대로 저장.
		 
		 for(int j = 0; j<col;j++) { //col의 개수만큼 for문 반복.
			 chess[i][j] = sentence2[j].charAt(0); // 반복문을 돌려 chess[row][col]의 각각 B 혹은 W 저장.
		 }
	 }

	 int cursor = Integer.MAX_VALUE; //정수형 변수 cursor에 정수형 최대 맥스값 입력. 밑에 if문을 안전하게 한 번 실행시키기 위하여
	 for(int a = 0; a < row - 7; a++ ) { //범위를 0 <= a < row - 7로 해준 이유는 row가 10일 경우 첫 행의 인덱스가 0,1,2로만 시작해야 8x8 체스판을 만들 수 있기 때문에. 
		 for(int b = 0; b < col - 7; b++) { //범위를 0 <= b < col - 7로 해준 이유는 col가 10일 경우 첫 열의 인덱스가 0,1,2로만 시작해야 8x8 체스판을 만들 수 있기 때문에. 
			 int sol = min_cnt(a,b,chess); // min_cnt함수에 a,b, chess배열을 넘겨 주어 최소 수정 횟수를 정수형 변수 sol에 젖ㅇ
			 
			 if(cursor > sol) { //만약 sol이 cursor보다 작은 경우
				 cursor = sol; //cursor에 sol값을 저장.
			 }
		 }
	 }
	 System.out.println(cursor); // cursor == 정답 출력
	}
	
	public static int min_cnt(int start_row, int start_col, char[][] chess) {
		String[] orgboard = {"WBWBWBWB", "BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW"}; //첫 칸이 하얀색 으로 시작하는 8x8 체스 판을 저장
		int modify = 0; //총 수정할 횟수를 저장해 줄 modify변수

		
		for(int a = start_row ; a < start_row +  8; a++) {
			
			for(int b = start_col ; b < start_col +  8; b++) {
			
				
				if(chess[a][b] != orgboard[a-start_row].charAt(b-start_col)) { //[row][col]크기의 체스판을 모든 8x8 크기의 경우의 수를 따지면서 만약 자른 8x8 체스판과 원래 첫 칸이 하얀색으로 시작하는 8x8체스 판과 다르면
				modify++; //수정횟수를 1씩 추가
				}
				
				}
			
			}
		
		return Math.min(modify, 64-modify) ; //modify = 첫 칸이 하얀색으로 시작하는 체스판으로 만들 경우 수정해야 하는 횟수, 64 - modify = 첫 칸이 검정색으로 시작하는 체스판으로 만들 경우 수정해야 하는 횟수.
	}
}
