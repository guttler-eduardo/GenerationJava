package loops;

import java.util.Scanner;

public class While_Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int idade = 0, menosDe21 = 0, maisDe50 = 0;
		
		while (idade != -99) {
			System.out.println("Digite a idade de uma pessoa qualquer: ");
			idade = scanner.nextInt();
			
			if (idade <= 21) {
				menosDe21++;
			}
			else if (idade >= 50) {
				maisDe50++;
			}
		}
		System.out.println();
		System.out.println("O número de pessoas com menos de 21 anos é: " + menosDe21);
		System.out.println("O número de pessoas com mais de 50 anos é: " + maisDe50);
		
		scanner.close();
	}
}