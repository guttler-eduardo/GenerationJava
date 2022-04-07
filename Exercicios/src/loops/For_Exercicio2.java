package loops;
import java.util.Scanner;

public class For_Exercicio2 {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
			
		int num, par = 0, impar = 0;
			
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número qualquer: ");
			num = scanner.nextInt();
				
			if (num % 2 == 0) {
				par++;
			}
			else if (num % 2 != 0) {
				impar++;
			}
		}
		System.out.println("Dos números informados, " + par + " são pares e " + impar + " são ímpares.");
			
		scanner.close();
	}
}