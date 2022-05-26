import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Quiz2004 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st =new StringTokenizer(bf.readLine(), " ");
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
	
		//n!/{(n-m)!m!}
		long five_cnt = five_cnt_check(n) - five_cnt_check(n-m) - five_cnt_check(m);
		long two_cnt = two_cnt_check(n) - two_cnt_check(n - m) - two_cnt_check(m);
		
		System.out.println(Math.min(two_cnt, five_cnt));
	}
	
	public static long two_cnt_check(long num) {
		int two_cnt = 0;
		for(int i = 1; i <= num; i++) {
			int target = i;
			while((target % 2 == 0)) {
				two_cnt++;
				target = target/2;
			}
		}
		return two_cnt;
	}
	
	
	public static long five_cnt_check(long num) {
		int  five_cnt = 0;
		for(int i = 1; i <= num; i++) {
			int target = i;
			while((target % 5 == 0)) {
				five_cnt++;
				target = target/5;
			}
		}
		return five_cnt;
		
	}
	
				
	}


