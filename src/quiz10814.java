import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class quiz10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //정답을 출력하기 위하여 BufferedWriter 사용
		
		int N = Integer.parseInt(bf.readLine()); //첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
		String personal[][] = new String[N][2];
		
		StringTokenizer st;
		
		for(int i = 0; i < N ; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
            personal[i][0] = st.nextToken(); //나이 == 1 <= age <= 200 인 정수
			personal[i][1] = st.nextToken(); //이름 == 길이가 100보다 작거나 같은 문자열	
		}
		
		Arrays.sort(personal, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				if(o1[0] == o2[0])
					return -1;
				else {
					int a = Integer.parseInt(o1[0]);
					int b = Integer.parseInt(o2[0]);
					return Integer.compare(a, b);
			}
			}
			
			
		});
		
		for(int j = 0; j < N; j++) {
			bw.write(personal[j][0] + " " + personal[j][1] + "\n");
		}

		bw.flush();
		bw.close();
	}

}
