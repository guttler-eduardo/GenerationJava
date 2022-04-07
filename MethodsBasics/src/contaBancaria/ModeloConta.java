package contaBancaria;

public class ModeloConta {

	String banco, modalidade;
	double saldo;
	
	public ModeloConta(String banco, String modal) {
		this.banco = banco;
		this.modalidade = modal;
	}
	
	public void emitirExtrato() {
		System.out.println("O saldo atual em conta é de R$" + saldo);
	}
	
	public void efetuarTransferencia() {
		if (saldo > 0) {
			System.out.println("A transferência será concluída!");
		} else {
			System.out.println("Erro: Saldo insuficiente!");
		}
	}
	
	public void agendarPagamento() {
		if (saldo > 0) {
			System.out.println("Seu pagamento será agendado!");
		} else {
			System.out.println("Erro: Saldo insuficiente!");
		}
	}
	
	public void info() {
		System.out.println("Banco: " + this.banco + ", Conta: " + this.modalidade);
	}
}
