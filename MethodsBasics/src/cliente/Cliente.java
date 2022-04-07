package cliente;

public class Cliente {

	public static void main(String[] args) {
		
		ModeloCliente cliente1 = new ModeloCliente(100.50);
		ModeloCliente cliente2 = new ModeloCliente(200.00);
		ModeloCliente cliente3 = new ModeloCliente(50.75);
		
		cliente1.fazerPedido(null);
		cliente1.comer();
		System.out.println();
		cliente2.fazerPedido(null, null, null);
		cliente2.comer();
		System.out.println();
		cliente3.fazerPedido(null, null);
		cliente3.comer();
	}
}
