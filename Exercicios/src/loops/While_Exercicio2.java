package loops;
import java.util.Scanner;

public class While_Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String response;
		int idade;
		int pesquisa = 0, m = 0, f = 0, o = 0, calm = 0, nerv = 0, agr = 0, f2 = 0, m2 = 0, nerv2 = 0, calm2 = 0;
		
			while (pesquisa < 150) {
				System.out.println("Informe a idade: ");
				idade = scanner.nextInt();
				
				System.out.println("Informe o sexo ('h' para homem, 'm' para mulher, 'o' para outros): ");
				response = scanner.next();
				if (response.equalsIgnoreCase("m")) {
					f++;
				}
				else if (response.equalsIgnoreCase("h")) {
					m++;
				}
				else if (response.equalsIgnoreCase("o")) {
					o++;
				}
				
				System.out.println("Informe uma das opções listadas abaixo: \n");
				System.out.println("Digite 1 para: Calmo(a)");
				System.out.println("Digite 2 para: Nervoso(a)");
				System.out.println("Digite 3 para: Agressivo(a)");
				response = scanner.next();
				if (response.equals("1")) {
					calm++;
				}
				else if (response.equals("2")) {
					nerv++;
				}
				else if (response.equals("3")) {
					agr++;
				}
				System.out.println();
				
				
				if (f == nerv && nerv > 0) {
					f2++;
				}
				else if (m == agr && agr > 0) {
					m2++;
				}
				else if (idade >= 40 && nerv > 0) {
					nerv2++;
				}
				else if (idade <= 18 && calm > 0) {
					calm2++;
				}
				
				pesquisa++;
			}

			System.out.println("Resultado da pesquisa: \n");
			System.out.println("Número de pessoas calmas: " + calm);
			System.out.println("Número de mulheres nervosas " + f2);
			System.out.println("Número de homens agressivos: " + m2);
			System.out.println("Número de pessoas nervosas com mais de 40 anos: " + nerv2);
			System.out.println("Número de pessoas calmas com menos de 18 anos: " + calm2 + "\n");
			
			scanner.close();
		}
}