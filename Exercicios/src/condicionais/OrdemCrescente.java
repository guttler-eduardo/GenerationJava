package condicionais;
import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite um n�mero qualquer: ");
		num1 = scanner.nextInt();
		System.out.println("Digite mais um qualquer: ");
		num2 = scanner.nextInt();
		System.out.println("Digite um �ltimo qualquer: ");
		num3 = scanner.nextInt();

			
		if (num1 > num2 && num1 > num3) {
			
			if (num2 > num3) {
				System.out.println("Os n�meros informados foram: " + num1 + ", " + num2 + ", " + num3);
				System.out.println("A ordem crescente dos n�meros �: " + num3 + ", " + num2 + ", " + num1);
			}
			else if (num3 > num2) {
				System.out.println("Os n�meros informados foram: " + num1 + ", " + num2 + ", " + num3);
				System.out.println("A ordem crescente dos n�meros �: " + num2 + ", " + num3 + ", " + num1);
			}
		}
		else if (num2 > num1 && num2 > num3) {
			
			if (num1 > num3) {
				System.out.println("Os n�meros informados foram: " + num1 + ", " + num2 + ", " + num3);
				System.out.println("A ordem crescente dos n�meros �: " + num3 + ", " + num1 + ", " + num2);
			}
			else if (num3 > num1) {
				System.out.println("Os n�meros informados foram: " + num1 + ", " + num2 + ", " + num3);
				System.out.println("A ordem crescente dos n�meros �: " + num1 + ", " + num3 + ", " + num2);
			}
		}
		else if (num3 > num1 && num3 > num2) {
			
			if (num1 > num2) {
				System.out.println("Os n�meros informados foram: " + num1 + ", " + num2 + ", " + num3);
				System.out.println("A ordem crescente dos n�meros �: " + num2 + ", " + num1 + ", " + num3);
			}
			else if (num2 > num1) {
				System.out.println("Os n�meros informados foram: " + num1 + ", " + num2 + ", " + num3);
				System.out.println("A ordem crescente dos n�meros �: " + num1 + ", " + num2 + ", " + num3);
			}
		}
		scanner.close();
	}
}