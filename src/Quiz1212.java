import java.util.*;

class DiceGame {
	int diceFace;
	int userGuess;

	private void RollDice() {
		diceFace = (int) (Math.random() * 6) + 1;
	}

	private int getUserInput(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	private void checkUserGuess() {
		if (diceFace == userGuess)
			System.out.println("�¾ҽ��ϴ�.");
		else
			System.out.println("Ʋ�Ƚ��ϴ�.");
	}
}

public class Quiz1212 {
	public static void main(String[] args) throws IOException {

	}
}
