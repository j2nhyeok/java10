import java.util.Scanner;

public class quiz1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long C = sc.nextInt();
		int i = 1;
		if(C <= B) {
			System.out.println(-1);
		}else {
			
				while(A + B * i >= C * i) {
					i++;
				}
				System.out.println(i);
			}
		}

	}


