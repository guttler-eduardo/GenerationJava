package loops;
import java.util.Scanner;

public class DoWhile_Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double numero, soma = 0;
		
		do {
			System.out.println("Digite um n�mero qualquer: ");
			numero = scanner.nextDouble();
			
			soma = soma + numero;
			
		} while (numero != 0);

		System.out.println("A soma dos n�meros digitados � igual a " +  soma);
		scanner.close();
	}
}