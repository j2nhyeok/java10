import java.util.Scanner;

public class quiz1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int prev_cell_cnt = 0;
		int now_cell_cnt = 1;
		while(true) {
			
		
		if(X <= prev_cell_cnt + now_cell_cnt) {
			int T = now_cell_cnt + 1 ;
			if(now_cell_cnt % 2 == 1) {
				System.out.print(T-(X-prev_cell_cnt) + "/" + (X - prev_cell_cnt));
				break;
				
			}else if( now_cell_cnt % 2 == 0) {
			
				System.out.print((X - prev_cell_cnt) + "/" + (T-(X-prev_cell_cnt)));
				break;
			}
			break;
		}else {
			prev_cell_cnt += now_cell_cnt;
			now_cell_cnt++;
			}
		}
		
	}

}
