
import java.util.Scanner;

public class Zoomanager {
	Scanner sc = new Scanner(System.in); // 값을 입력 받기 위하여 Scanner 사용
	Animal[] animals = new Animal[10];
	Worker[] workers = new Worker[10];
	
	int selectNumber = 0; //여러개의 선택지에서 사용됨.
	int count_animal = 0; // 신규 회원 한 명씩 등록 될때 마다 count++; 할 예정
	int count_worker = 0;
	
	public Zoomanager() {
		run();
	}
	
	public void run() {
		while(true) {
			System.out.println("                                                  ");
			System.out.println("=====================목록=========================");
			System.out.println("1. 신규 동물 등록");
			System.out.println("2. 신규 직원 목록");
			System.out.println("3. 현재 등록된 동물 목록 보기(주식으로 분류)");
			System.out.println("4. 조련사 담당에 따라 동물 목록 보기");
			System.out.println("5. 종료");
			System.out.println("=================================================");
			System.out.println("                                                  ");
	
			selectNumber = Integer.parseInt(getData("번호 입력 : "));
			
			System.out.println();
			
			if(selectNumber == 1) {
				registerAnimal(); // 회원 등록하는 함수로 이동
			}else if(selectNumber == 2) {
				registerWorker(); // 등록된 회원 목록을 볼 수 있는 함수로 이동
			}else if(selectNumber == 3){
				animalList();
			}else if(selectNumber == 4) {
				
			}
			else if(selectNumber == 5) {
    			System.out.println("\n <회원 관리 프로그램을 종료합니다.>");
    			break;
    		}else {
    			System.out.println("<범위에 없는 목록 번호를 입력하셨습니다.>");
    			System.out.println("<다시 입력해주세요.>");
    		}
		}
	}
	
	private void animalList() {
		 System.out.println("                                                  ");
		 System.out.println("=================================================");
	     System.out.println("                  동물목록");
	     System.out.println("품종\t나이\t몸무게(kg)\t담당\t조련사");
		 System.out.println("=================================================");
	
	     for(int i = 0; i < 10; i++) {
	    	 if(animals[i] != null) { // numbers[i]에 등록된 회원이 있다면
	    		 System.out.println(animals[i].PrintAll()); //그 회원의 이름, 키, 몸무게, bmi지수, bmi결과 를 출력
	        }
	     }							//numbers[i]에 등록된 회원이 없다면 넘어감.
	     
		 System.out.println("=================================================");	// 등록된 회원들을 다 출력했다면     
	     System.out.println("1.목록   2.프로그램 종료"); //목록으로 돌아갈지 프로그램을 종료할지 선택지가 주어짐.
	     
	     selectNumber = Integer.parseInt(getData("번호입력 : "));
		
	    if(selectNumber == 2) {
			System.out.println("프로그램을 종료합니다.");
		}
			
	}


private void registerWorker() {
	boolean a = true;
	 while(a) {
		 // 위에 count가 0부터 시작했으므로 
		String role = getData((count_worker +  1) +"번째 신규 직원의 역할을 입력해주세요");		
		String name = getData((count_worker +  1) +"번째 신규 직원의 이름을 입력해주세요");
		
		for(int i = 0; i < 10; i++) {								
			if(workers[i] == null) { //만약 members[i]에 저장된 회원이 없다면
				workers[i] = new Worker(role, name); // 그자리에 N번째 회원의 이름 , 키 , 몸무게를 저장
				count_worker++; // 신규 동물이 등록 되었으니 count++;
					
			}
		}
		
		
		System.out.println("< " + count_worker + "명 등록완료" + "                        " + (10 - count_worker) + " 명 남았습니다.(최대 10마리) >");	
		int b = Integer.parseInt(getData("1. 추가 등록      2. 등록 종료"));
		if(b == 2) {
			break;			
		}
			
	 }
	}

private void registerAnimal() {
		
		boolean a = true;
		 while(a) {
			 // 위에 count가 0부터 시작했으므로 
			String species = getData((count_animal +  1) +"번째 신규 동물의 품종을 입력해주세요");
			int age = Integer.parseInt(getData( (count_animal +  1) + "번째 신규 동물의 나이를 입력해주세요"));
			int weight = Integer.parseInt(getData( (count_animal +  1) +"번째 신규 동물의 몸무게를 입력해주세요"));
			String mainMeal = getData((count_animal +  1) +"번째 신규 동물의 주식을 입력해주세요");
			
			for(int i = 0; i < 10; i++) {								
				if(animals[i] == null) { //만약 members[i]에 저장된 회원이 없다면
					animals[i] = new Animal(species, age, weight, mainMeal); // 그자리에 N번째 회원의 이름 , 키 , 몸무게를 저장
					count_animal++; // 신규 동물이 등록 되었으니 count++;
						
				}
			}
			
			
			System.out.println("< " + count_animal + "마리 등록완료" + "                        " + (10 - count_animal) + " 마리 남았습니다.(최대 10마리) >");	
			int b = Integer.parseInt(getData("1. 추가 등록      2. 등록 종료"));
			if(b == 2) {
				break;			
			}
				
		 }
		
		
	}
	private String getData(String Message) {
		System.out.println(Message);
		return sc.next();
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Zoomanager();
	}

}
