package animais;

public class Cachorro extends Animal {

	public void Correr() {
		System.out.println("O cachorro est� correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro est� latindo");
	}
}