package condicionais;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] num1 = new int[3];
		int num2, maiorNumero = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite um número: ");
			num2 = scanner.nextInt();
			num1[i] = num2;
			
			if (num1[i] > maiorNumero) {
				maiorNumero = num1[i];
			}
		}
		
		System.out.println("Os números informados foram: " + num1[0] + ", " + num1[1] + ", " + num1[2]);
		System.out.println("O maior número é: " + maiorNumero);
		
		scanner.close();
	}
}