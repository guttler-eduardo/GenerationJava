package loops;
import java.util.Scanner;

public class DoWhile_Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero, soma = 0;
		double media, conta = 0;
		
		do {
			System.out.println("Digite um número inteiro qualquer ou pressione 0 (zero) para sair: ");
			numero = scanner.nextInt();
			
			if (numero % 3 == 0) {
				soma = soma + numero;
				conta++;
			}
			
		} while (numero != 0);
		
		media = soma / conta;
		System.out.println("A média dos números múltiplos de 3 é igual a " + media);
		
		scanner.close();
	}
}