package animais;

public class Cavalo extends Animal {

	public void Correr() {
		System.out.println("O cavalo est� cavalgando");
	}
		
	@Override
	public void emitirSom() {
		System.out.println("O cavalo est� relinchando");
	}
}