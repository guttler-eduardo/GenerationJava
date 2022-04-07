package cliente;

public class ModeloCliente {

	String comida = "Hamburger", bebida = "Refrigerante", sobremesa = "Sorvete";
	double carteira;
	
	public ModeloCliente(double carteira) {
		this.carteira = carteira;
	}
	
	public void fazerPedido(String comida, String bebida, String sobremesa) {
		System.out.println("O cliente pediu o combo #1: " + this.comida + ", " + this.bebida + ", " + this.sobremesa);
	}
	
	public void fazerPedido(String comida, String sobremesa) {
		System.out.println("O cliente pediu o combo #2: " + this.comida + ", " + this.sobremesa);
	}
	
	public void fazerPedido(String comida) {
		System.out.println("O cliente pediu o lance avulso: " + this.comida);
	}
	
	public void comer() {
		System.out.println("O cliente está comendo");
	}
}