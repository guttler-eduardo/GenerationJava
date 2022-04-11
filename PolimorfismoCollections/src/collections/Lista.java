package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista implements Estoque {
	
	int n;
	Scanner leia = new Scanner(System.in);
	private String stock1, stock2, stock3;
	ArrayList<String> stock = new ArrayList<>();

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getEstoque1() {
		return stock1;
	}

	public void setEstoque1(String estoque1) {
		this.stock1 = estoque1;
	}

	public String getEstoque2() {
		return stock2;
	}

	public void setEstoque2(String estoque2) {
		this.stock2 = estoque2;
	}
	
	public String getEstoque3() {
		return stock3;
	}

	public void setEstoque3(String estoque3) {
		this.stock3 = estoque3;
	}

	public ArrayList<String> getEstoq() {
		return stock;
	}

	public void setEstoq(ArrayList<String> stock) {
		this.stock = stock;
	}

	@Override
	public void menu() {
		System.out.println("Digite o nome de 3 itens no estoque: ");
		System.out.println("Primeiro item: ");
		this.setEstoque1(leia.next());
		System.out.println("Segundo item: ");
		this.setEstoque2(leia.next());
		System.out.println("Terceiro item: ");
		this.setEstoque3(leia.next());
		stock.add(0,this.getEstoque1());
		stock.add(1, this.getEstoque2());
		stock.add(2, this.getEstoque3());
		System.out.println();
		System.out.println(stock);
		System.out.println();
		System.out.println("Informações cadastradas");
	}

	@Override
	public void remove() {
		System.out.println();
		System.out.println("Remova um item da lista \n");
		System.out.println("1 - " + this.getEstoque1() + " 2 - " + this.getEstoque2() + " 3 - " + this.getEstoque3());
		n= leia.nextInt();
		
		if (n == 1) {
			stock.remove(0);
			System.out.println("Lista atualizada: "+stock);
		}
		else if (n == 2) {
			stock.remove(1);
			System.out.println("Lista atualizada: "+stock);
		}
		else if (n == 3) {
			stock.remove(1);
			System.out.println("Lista atualizada: "+stock);
		}
	}
}