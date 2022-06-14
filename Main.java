import first.InPackageClass;
import first.second.AnotherClass;

public class Main {
	public static void main(String[] args) {
		InPackageClass test = new InPackageClass();
		
		AnotherClass test2 = new AnotherClass();
		test2.number = 10;
//		test2.mySecret = 22;
//		test.test = 33;  // default 접근제한자 or package 접근제한자 : 패키지 내에서만 사용 가능 
	}
}
