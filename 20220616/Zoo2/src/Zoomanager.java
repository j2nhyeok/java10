
import java.util.Scanner;
import java.util.Set;
import java.security.KeyStore.Entry;
import java.util.HashMap;

public class Zoomanager {
	Scanner sc = new Scanner(System.in); // ���� �Է� �ޱ� ���Ͽ� Scanner ���
	Animal[] animals = new Animal[10];
	Worker[] workers = new Worker[10];
	HashMap<String, String> animal_worker = new HashMap<String, String>();
	
	int selectNumber = 0; // �������� ���������� ����.
	int count_animal = 0; // �ű� ȸ�� �� �� ��� �ɶ� ���� count++; �� ����
	int count_worker = 0;

	public Zoomanager() {
		run();
	}

	public void run() {
		while (true) {
//			if(selectNumber == 2) {
//				break;
//			}
			
			System.out.println("                                                  ");
			System.out.println("=====================���=========================");
			System.out.println("1. �ű� ���� ���");
			System.out.println("2. �ű� ���� ���");
			System.out.println("3. ���� ��ϵ� ���� ��� ����");
			System.out.println("4. �ʽ� / ���� �з��ؼ� ����");
			System.out.println("5. ���� ��� �Ű�");
			System.out.println("6. ���� �ذ�");
			System.out.println("7. ����");
			System.out.println("=================================================");
			System.out.println("                                                  ");
			
			selectNumber = Integer.parseInt(getData("��ȣ �Է� : "));

			System.out.println();

			if (selectNumber == 1) {
				registerAnimal(); // ȸ�� ����ϴ� �Լ��� �̵�
			} else if (selectNumber == 2) {
				registerWorker(); // ��ϵ� ȸ�� ����� �� �� �ִ� �Լ��� �̵�
			} else if (selectNumber == 3) {
				animalList();
			} else if (selectNumber == 4) {
				herb_meat();
			}
			else if (selectNumber == 5) {
				dieAnimal();
			}
			else if (selectNumber == 6) {
					fireWorker();
			}
			 else if (selectNumber == 7) {
				System.out.println("\n <���� ���� ���α׷��� �����մϴ�.>");
				break;
			} else {
				System.out.println("<������ ���� ��� ��ȣ�� �Է��ϼ̽��ϴ�.>");
				System.out.println("<�ٽ� �Է����ּ���.>");
			}
		}
	}

	private void fireWorker() {
		int temp = 0;
		String firePerson = getData("������ �ذ��Ͻðڽ��ϱ�?");
		
		  Set<java.util.Map.Entry<String,String>> entrySet = animal_worker.entrySet();  
		  
		  for (java.util.Map.Entry<String, String> entry : entrySet) {           
			  if (entry.getValue().equals(firePerson)) {             
				animal_worker.replace("entry.getKey()", "������ ���û簡 ����.");  // 1, 3
			  }
		  }
		  
		  for(int i = 0 ; i < 10; i++) {
			  if(workers[i] != null) {
				  if(workers[i].getName().equals(firePerson)) {
					  temp = i;
					  workers[i] = null;
				  }
			  }
		  }
		  
		  for(int j = temp ; j < 8; j++) {
				animals[j] = animals[j + 1];
				animals[j + 1] = null;
			}
		
		
	}

	private void dieAnimal() {
		int temp = 0;
		String deadAnimal = getData("� ������ �׾���Ƚ��ϱ�?");
		
		for(int i = 0 ; i < 10; i++) {
			if( animals[i].getSpecies().equals(deadAnimal)) {
				temp = i;
				animal_worker.remove(animals[i].getSpecies());
				animals[i] = null;
				break;
			}
		}
		
		for(int j = temp ; j < 8; j++) {
			animals[j] = animals[j + 1];
			animals[j + 1] = null;
		}
		
		
		for(int i = 0; i < 10; i++) {
			if(animals[i] != null && animal_worker.get(animals[i].getSpecies()).equals("������ ���û簡 ����.")) {
				for(int j = 0; j < 10 ; j++) {
					if (workers[j] != null && !animal_worker.containsValue(workers[j].getName())) {
						animal_worker.put(animals[i].getSpecies(), workers[j].getName());
					}
				}
			}
		}
		
	
		
	}

	private void herb_meat() {
		System.out.println("---------------");
		System.out.println("1.�ʽ� | 2.���� ");
		System.out.println("---------------");
		
		selectNumber = Integer.parseInt(getData("< ������� ��ȣ �Է� >"));
		
		if(selectNumber == 1) {
			for(int i = 0; i < 10; i++) {
				if (animals[i] != null && animals[i].getMainMeal().equals("�ʽ�")) {
					System.out.println(animals[i].getSpecies());
				}
			}
		}else if( selectNumber == 2) {
			for(int i = 0; i < 10; i++) {
				if (animals[i] != null && animals[i].getMainMeal().equals("����")) {
					System.out.println(animals[i].getSpecies());
				}
			}
		}
	}

	private void animalList() {
		System.out.println("                                                  ");
		System.out.println("=================================================");
		System.out.println("                  �������");
		System.out.println("ǰ��\t����\t������(kg)\t�ֽ�\t���û�");
		System.out.println("=================================================");
		
		for(int i = 0; i < 10; i++) {
			if (animals[i] != null) {
				for(int j = 0; j < 10; j++) {
					if(workers[j] != null && workers[j].getRole().equals("���û�") && !animal_worker.containsValue(workers[j].getName())) {
						animal_worker.put(animals[i].getSpecies(), workers[j].getName());
						break;
					}
				else animal_worker.put(animals[i].getSpecies(), "������ ���û簡 ����.");
				
			}	
			
		}
			
			
			
		}
		for (int i = 0; i < 10; i++) {
			if (animals[i] != null) {
				System.out.print(animals[i].PrintAll() + "  \t   " + animal_worker.get(animals[i].getSpecies())); // �� ȸ���� �̸�, Ű, ������, bmi����, bmi��� �� ���
				System.out.println();
			}
		} 

		System.out.println("=================================================");
		System.out.println("1.���   2.���α׷� ����"); 

		selectNumber = Integer.parseInt(getData("��ȣ�Է� : "));

		if (selectNumber == 2) {
			System.out.println("���α׷��� �����մϴ�.");
		}

	}

	private void registerWorker() {
		boolean a = true;
		while (a) {
			// ���� count�� 0���� ���������Ƿ�
			String role = getData((count_worker + 1) + "��° �ű� ������ ������ �Է����ּ���");
			String name = getData((count_worker + 1) + "��° �ű� ������ �̸��� �Է����ּ���");

			for (int i = 0; i < 10; i++) {
				if (workers[i] == null) { // ���� members[i]�� ����� ȸ���� ���ٸ�
					workers[i] = new Worker(role, name); // ���ڸ��� N��° ȸ���� �̸� , Ű , �����Ը� ����
					count_worker++; // �ű� ������ ��� �Ǿ����� count++;
					break;
				}
			}

			System.out.println("< " + count_worker + "�� ��ϿϷ�" + "                        " + (10 - count_worker)
					+ " �� ���ҽ��ϴ�.(�ִ� 10��) >");
			int b = Integer.parseInt(getData("1. �߰� ���      2. ��� ����"));
			if (b == 2) {
				break;
			}

		}
	}

	private void registerAnimal() {

		boolean a = true;
		while (a) {
			// ���� count�� 0���� ���������Ƿ�
			String species = getData((count_animal + 1) + "��° �ű� ������ ǰ���� �Է����ּ���");
			int age = Integer.parseInt(getData((count_animal + 1) + "��° �ű� ������ ���̸� �Է����ּ���"));
			int weight = Integer.parseInt(getData((count_animal + 1) + "��° �ű� ������ �����Ը� �Է����ּ���"));
			String mainMeal = getData((count_animal + 1) + "��° �ű� ������ �ֽ��� �Է����ּ���");

			for (int i = 0; i < 10; i++) {
				if (animals[i] == null) { // ���� members[i]�� ����� ȸ���� ���ٸ�
					animals[i] = new Animal(species, age, weight, mainMeal); // ���ڸ��� N��° ȸ���� �̸� , Ű , �����Ը� ����
					count_animal++; // �ű� ������ ��� �Ǿ����� count++;
					break;
					
				}
			}
			System.out.println("< " + count_animal + "���� ��ϿϷ�" + "                        " + (10 - count_animal)
					+ " ���� ���ҽ��ϴ�.(�ִ� 10����) >");

			int b = Integer.parseInt(getData("1. �߰� ���      2. ��� ����"));
			if (b == 2) {
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
