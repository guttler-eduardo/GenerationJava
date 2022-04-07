package arrays;

import java.util.Scanner;

public class SomaDiferenca {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];
		
	    for (int i = 0; i < 4; i++) {
	    	for (int j = 0; j < 6; j++) {
	    		System.out.println("Digite 24 (vinte e quatro) números para a primeira tabela, um de cada vez: ");
	    		N1[i][j] = scanner.nextInt();
	    	}
	    }
	    System.out.println();
	    for (int i = 0; i < 4; i++) {
	    	for (int j = 0; j < 6; j++) {
	    		System.out.println("Digite 24 (vinte e quatro) números para a segunda tabela, um de cada vez: ");
	    		N2[i][j] = scanner.nextInt();
	    	}
	    }
	    
	    System.out.println();
	    System.out.println("Primera Tabela: ");
	    for (int i = 0; i < 4; i++) {
	    	for (int j = 0; j < 6; j++) {
	    		System.out.print(N1[i][j] + "\t");
	    	}
	    	System.out.println();
	    }
	    System.out.println();
	    System.out.println("Segunda Tabela: ");
	    for (int i = 0; i < 4; i++) {
	    	for (int j = 0; j < 6; j++) {
	    		System.out.print(N2[i][j] + "\t");
	    	}
	    	System.out.println();
	    }
	    
	    System.out.println();
	    System.out.println("Tabela de Soma: ");
	    for (int i = 0; i < 4; i++) {
	    	for (int j = 0; j < 6; j++) {
	    		System.out.print((M1[i][j] = N1[i][j] + N2[i][j]) + "\t");
	    	}
	    	System.out.println();
	    }
	    System.out.println();
	    System.out.println("Tabela de Subtração: ");
	    for (int i = 0; i < 4; i++) {
	    	for (int j = 0; j < 6; j++) {
	    		System.out.print((M2[i][j] = N1[i][j] - N2[i][j]) + "\t");
	    	}
	    	System.out.println();
	    }
	    scanner.close();
	}
}