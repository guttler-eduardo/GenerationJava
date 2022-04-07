package condicionais;

import java.util.Scanner;

public class CategoriaIdade {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe a idade: ");
		idade = scanner.nextInt();
		
		if (idade >=10 && idade <= 14) {
			System.out.println("Esta pessoa possui " + idade + "anos e pertence à categoria infantil");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Esta pessoa possui " + idade + "anos e pertence à categoria juvenil");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Esta pessoa possui " + idade + "anos e pertence à categoria adulta");
			
		scanner.close();
		}
	}
}