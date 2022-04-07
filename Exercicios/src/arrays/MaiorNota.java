package arrays;
import java.util.Scanner;

public class MaiorNota {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int nota[] = new int[5], maiorNota = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe a pontuação a ser registrada: ");
			nota[i] = scanner.nextInt();
			
			if (nota[i] > maiorNota) {
				maiorNota = nota[i];
			}
		}
		System.out.println();
		System.out.println("As pontuações informadas foram: " + nota[0] + ", " + nota[1] + ", " + nota[2] + ", " + nota[3] + ", " + nota[4]);
		System.out.println("A maior pontuação registrada foi " + maiorNota);
		scanner.close();
	}
}