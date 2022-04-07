package arrays;
import java.util.Random;

public class LancamentoDado {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int movIA, highScore = 0, highScoreCount = 0;
		int rolls[] = new int[10];
		double avgScore;
		
		for (int i = 0; i < 10; i++) {
			movIA = random.nextInt(6)+1;
			rolls[i] = movIA;
			
			if (rolls[i] > highScore) {
				highScore = rolls[i];
			}
		}
		
		for (int i = 0; i < 10; i++) {
			if (rolls[i] == highScore) {
				highScoreCount++;
			}
		}
		
		System.out.println("Os lançamentos foram " + rolls[0] + ", " + rolls[1] + ", "  + rolls[2] + ", " + rolls[3] + ", " +
		rolls[4] +  ", " + rolls[5] +  ", " + rolls[6] +  ", " + rolls[7] +  ", " + rolls[8] +  ", " + rolls[9]);
		
		avgScore = (rolls[0] + rolls[1] + rolls[2] + rolls[3] + rolls[4] + rolls[5] + rolls[6] + rolls[7] + rolls[8] + rolls[9]) / 10.0;
		System.out.println("A média dos lançamentos é de " + avgScore);
		System.out.println("A maior pontuação foi " + highScore);
		System.out.println("A maior pontuação ocorreu " + highScoreCount + " vezes");
	}
}