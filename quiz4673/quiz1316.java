import java.util.Scanner;

public class quiz1316 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int count = 0;
		for(int i = 0; i < N; i++) {
             if( check() == true) {
            	 count++;
             }
		}
		
		
		System.out.println(count);
		}
	
	
	public static boolean check() {
		
		String sentence =  sc.next();
		int prev = 0;
		
		
		boolean[] check = new boolean[26];
	
		for(int i = 0; i < sentence.length(); i++) {
			int now_number = sentence.charAt(i);
			if(now_number != prev) {
				if(check[now_number - 97] == false) {
					check[now_number - 97] =true;
					prev = now_number;
				}else {
					return false;
				}
				
			} else{  //이전 문자와 같을 떄.
				continue;
			};
			
		}
		
		return true;
		
	}

}

