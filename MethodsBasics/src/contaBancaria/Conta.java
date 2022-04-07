package contaBancaria;

public class Conta {

	public static void main(String[] args) {
		
		ModeloConta conta1 = new ModeloConta("Bradesco", "Corrente");
		ModeloConta conta2 = new ModeloConta("Itaú", "Corrente");
		ModeloConta conta3 = new ModeloConta("Santander", "Poupança");
		
		conta1.saldo = -194.50;
		conta2.saldo = 3594.85;
		conta3.saldo = 1829.76;
		
		conta1.info();
		conta1.agendarPagamento();
		System.out.println();
		conta2.info();
		conta2.efetuarTransferencia();
		System.out.println();
		conta3.info();
		conta3.emitirExtrato();
	}
}
