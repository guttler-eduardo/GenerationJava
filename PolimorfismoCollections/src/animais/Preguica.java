package animais;

public class Preguica extends Animal {

	public void subirArvore() {
		System.out.println("A pregui?a est? escalando a ?rvore");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("ZzzZZZZzzzzzz...");
	}
}