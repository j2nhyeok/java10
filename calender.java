
public class calender {

	public static void main(String[] args) {
		System.out.println("\t\t<6월 달력>\t\t");

		System.out.println("일\t월\t화\t수\t목\t금\t토");

		
		for(int i = 0; i <= 30; i++) {
			if(i == 0) {
				System.out.print("\t\t\t");
			}
			else {
				System.out.print(i + "\t");

			}
			
			if(i % 7 == 4) {
				System.out.println();
			}
		}
	}

}
