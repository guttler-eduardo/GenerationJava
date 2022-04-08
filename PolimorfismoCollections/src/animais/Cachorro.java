package animais;

public class Cachorro extends Animal {

	public void Correr() {
		System.out.println("O cachorro está correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro está latindo");
	}
}