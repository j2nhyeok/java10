
import java.util.Scanner;

public class Zoomanager {
	Scanner sc = new Scanner(System.in); // ���� �Է� �ޱ� ���Ͽ� Scanner ���
	Animal[] animals = new Animal[10];
	Worker[] workers = new Worker[10];
	
	int selectNumber = 0; //�������� ���������� ����.
	int count_animal = 0; // �ű� ȸ�� �� �� ��� �ɶ� ���� count++; �� ����
	int count_worker = 0;
	
	public Zoomanager() {
		run();
	}
	
	public void run() {
		while(true) {
			System.out.println("                                                  ");
			System.out.println("=====================���=========================");
			System.out.println("1. �ű� ���� ���");
			System.out.println("2. �ű� ���� ���");
			System.out.println("3. ���� ��ϵ� ���� ��� ����(�ֽ����� �з�)");
			System.out.println("4. ���û� ��翡 ���� ���� ��� ����");
			System.out.println("5. ����");
			System.out.println("=================================================");
			System.out.println("                                                  ");
	
			selectNumber = Integer.parseInt(getData("��ȣ �Է� : "));
			
			System.out.println();
			
			if(selectNumber == 1) {
				registerAnimal(); // ȸ�� ����ϴ� �Լ��� �̵�
			}else if(selectNumber == 2) {
				registerWorker(); // ��ϵ� ȸ�� ����� �� �� �ִ� �Լ��� �̵�
			}else if(selectNumber == 3){
				animalList();
			}else if(selectNumber == 4) {
				
			}
			else if(selectNumber == 5) {
    			System.out.println("\n <ȸ�� ���� ���α׷��� �����մϴ�.>");
    			break;
    		}else {
    			System.out.println("<������ ���� ��� ��ȣ�� �Է��ϼ̽��ϴ�.>");
    			System.out.println("<�ٽ� �Է����ּ���.>");
    		}
		}
	}
	
	private void animalList() {
		 System.out.println("                                                  ");
		 System.out.println("=================================================");
	     System.out.println("                  �������");
	     System.out.println("ǰ��\t����\t������(kg)\t���\t���û�");
		 System.out.println("=================================================");
	
	     for(int i = 0; i < 10; i++) {
	    	 if(animals[i] != null) { // numbers[i]�� ��ϵ� ȸ���� �ִٸ�
	    		 System.out.println(animals[i].PrintAll()); //�� ȸ���� �̸�, Ű, ������, bmi����, bmi��� �� ���
	        }
	     }							//numbers[i]�� ��ϵ� ȸ���� ���ٸ� �Ѿ.
	     
		 System.out.println("=================================================");	// ��ϵ� ȸ������ �� ����ߴٸ�     
	     System.out.println("1.���   2.���α׷� ����"); //������� ���ư��� ���α׷��� �������� �������� �־���.
	     
	     selectNumber = Integer.parseInt(getData("��ȣ�Է� : "));
		
	    if(selectNumber == 2) {
			System.out.println("���α׷��� �����մϴ�.");
		}
			
	}


private void registerWorker() {
	boolean a = true;
	 while(a) {
		 // ���� count�� 0���� ���������Ƿ� 
		String role = getData((count_worker +  1) +"��° �ű� ������ ������ �Է����ּ���");		
		String name = getData((count_worker +  1) +"��° �ű� ������ �̸��� �Է����ּ���");
		
		for(int i = 0; i < 10; i++) {								
			if(workers[i] == null) { //���� members[i]�� ����� ȸ���� ���ٸ�
				workers[i] = new Worker(role, name); // ���ڸ��� N��° ȸ���� �̸� , Ű , �����Ը� ����
				count_worker++; // �ű� ������ ��� �Ǿ����� count++;
					
			}
		}
		
		
		System.out.println("< " + count_worker + "�� ��ϿϷ�" + "                        " + (10 - count_worker) + " �� ���ҽ��ϴ�.(�ִ� 10����) >");	
		int b = Integer.parseInt(getData("1. �߰� ���      2. ��� ����"));
		if(b == 2) {
			break;			
		}
			
	 }
	}

private void registerAnimal() {
		
		boolean a = true;
		 while(a) {
			 // ���� count�� 0���� ���������Ƿ� 
			String species = getData((count_animal +  1) +"��° �ű� ������ ǰ���� �Է����ּ���");
			int age = Integer.parseInt(getData( (count_animal +  1) + "��° �ű� ������ ���̸� �Է����ּ���"));
			int weight = Integer.parseInt(getData( (count_animal +  1) +"��° �ű� ������ �����Ը� �Է����ּ���"));
			String mainMeal = getData((count_animal +  1) +"��° �ű� ������ �ֽ��� �Է����ּ���");
			
			for(int i = 0; i < 10; i++) {								
				if(animals[i] == null) { //���� members[i]�� ����� ȸ���� ���ٸ�
					animals[i] = new Animal(species, age, weight, mainMeal); // ���ڸ��� N��° ȸ���� �̸� , Ű , �����Ը� ����
					count_animal++; // �ű� ������ ��� �Ǿ����� count++;
						
				}
			}
			
			
			System.out.println("< " + count_animal + "���� ��ϿϷ�" + "                        " + (10 - count_animal) + " ���� ���ҽ��ϴ�.(�ִ� 10����) >");	
			int b = Integer.parseInt(getData("1. �߰� ���      2. ��� ����"));
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
