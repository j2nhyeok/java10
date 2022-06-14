import java.util.Scanner;

public class MemberTest {
	Scanner sc = new Scanner(System.in);
	Member[] members = new Member[10];
	int selectNumber = 0;
	int count = 0;
	
	public MemberTest(){
		run();
	}
	
	
	public void run() {
		while(true) {
			if(selectNumber == 2) {
				break;
			}
			
			System.out.println("                                                  ");
			System.out.println("=====================목록=========================");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 목록");
			System.out.println("3. 각 회원들이 BMI 지수 보기");
			System.out.println("6. 종료				");
			System.out.println("=================================================");
			System.out.println("                                                  ");
			
			selectNumber = Integer.parseInt(getData("번호 입력 : "));
			
			System.out.println();
			
			if(selectNumber == 1) {
				registerMember();
			}else if(selectNumber == 2) {
				memberList();
			}else if(selectNumber == 3){
				bmiCal();
			}else if(selectNumber == 6) {
    			System.out.println("\n <도서 관리 프로그램을 종료합니다.>");
    			break;
    		}else {
    			System.out.println("<범위에 없는 목록 번호를 입력하셨습니다.>");
    			System.out.println("<다시 입력해주세요.>");
    		}
		}
		
	}
	private void bmiCal() {
		
	}





	private void memberList() {
		 System.out.println("                                                  ");
		 System.out.println("=================================================");
	     System.out.println("                  회원목록");
	     System.out.println("이름\t키(m)\t몸무게(kg)\tbmi");
		 System.out.println("=================================================");
		 System.out.println("                                                  ");
	     
	     for(int i = 0; i < 10; i++) {
	    	 if(members[i] != null) {
	    		 System.out.println(members[i].PrintAll());
	        }
	     }
	     
	     System.out.println("1.목록   2.프로그램 종료");
	     
	     selectNumber = Integer.parseInt(getData("번호입력 : "));
		if(selectNumber == 2) {
			System.out.println("프로그램을 종료합니다.");
		}
	}


	private void registerMember() {
		System.out.println("몇 명의 회원을 등록하시겠습니까? ");
        int register_cnt = sc.nextInt();
		
		
		 for(int j = 0; j < register_cnt; j++) {
			String name = getData((count +  1) +"번째 신규 회원의 이름을 입력해주세요");
			double height = Double.parseDouble(getData( (count +  1) + "번째 신규 회원의 키를 입력해주세요"));
			double weight =  Double.parseDouble(getData( (count +  1) +"번째 신규 회원의 몸무게를 입력해주세요"));
		
			for(int i = 0; i < 10; i++) {
				
				
				if(members[i] == null) {
					members[i] = new Member(name, height, weight);
					count++;
					
					for(int k = 0; k < i; k++) {
						
						if(members[k].equals(members[i])) {
							count--;
							
							members[i] = null;
							System.out.println("기존 회원과 같은 이름, 키 , 몸무게입니다.");
							System.out.println("목록으로 다시 돌아갑니다.");
							break;
						}
						
					}
					break;
					
				}
			}
			
			
				
				
				
				
				
			
			System.out.println("< " + count + "명 등록완료" + "                        " + (10 - count) + " 명 남았습니다.(최대 10명) >");
		
			if(	members[j] == null) {
				
				j--;
				
				
			}
		 }
		
		
	}


	private String getData(String Message) {
		System.out.println(Message);
		return sc.next();
	}


	public static void main(String[] args) {
	
		new MemberTest();
		
	}

}
