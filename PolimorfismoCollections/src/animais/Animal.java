package animais;

public class Animal {

	String nome;
	int idade;
	
	public void emitirSom() {
		System.out.println("Barulho");
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