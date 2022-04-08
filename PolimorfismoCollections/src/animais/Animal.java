package animais;

public abstract class Animal {

	String nome;
	int idade;
	
	public void emitirSom() {
		System.out.println("O animal está emitindo um som");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}