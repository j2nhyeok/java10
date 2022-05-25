

public class Fibonacci{

	public static void main(String[] args){
		
		
        int n = 12;
		
		for(int i = 1; i < n; i++)
			System.out.print(Fibonacci(i) + " ");


	}
	public static int Fibonacci(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		else
		return Fibonacci(n - 2) + Fibonacci(n-1);
	}
}
