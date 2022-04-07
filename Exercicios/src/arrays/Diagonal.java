package arrays;
import java.util.Scanner;

public class Diagonal {

	public static void main(String[] args) {
		
		int T1[][] = new int[3][3];
		int soma = 0, soma2;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Digite 9 (nove) números para uma tabela 3 x 3: ");
				T1[i][j] = scanner.nextInt();
				soma = soma + T1[i][j];
			}
		}
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(T1[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("A soma de todos os elementos da tabela é de " + soma);
		soma2 = T1[0][0] + T1[1][1] + T1[2][2];
		System.out.println("A soma dos elementos da diagonal (de cima para baixo, da esquerda para a direita) é de " + soma2);
		scanner.close();
	}
}