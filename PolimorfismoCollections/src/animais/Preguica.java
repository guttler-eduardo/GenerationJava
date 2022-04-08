package animais;

public class Preguica extends Animal {

	public void subirArvore() {
		System.out.println("A preguiça está escalando a árvore");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("ZzzZZZZzzzzzz...");
	}
}