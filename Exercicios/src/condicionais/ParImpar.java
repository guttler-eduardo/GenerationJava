package condicionais;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero qualquer: ");
		numero = scanner.nextInt();
		
		if ((numero % 2) == 0) {
			System.out.println("Este n�mero � par; Sua raiz quadrada �: " + (Math.sqrt(numero)));
		} else {
			System.out.println("Este n�mero � �mpar; Seu valor elevado ao quadrado � de: " + (numero * numero));
		}
		scanner.close();
	}
}