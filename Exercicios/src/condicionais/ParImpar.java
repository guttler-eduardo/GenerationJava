package condicionais;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número qualquer: ");
		numero = scanner.nextInt();
		
		if ((numero % 2) == 0) {
			System.out.println("Este número é par; Sua raiz quadrada é: " + (Math.sqrt(numero)));
		} else {
			System.out.println("Este número é ímpar; Seu valor elevado ao quadrado é de: " + (numero * numero));
		}
		scanner.close();
	}
}