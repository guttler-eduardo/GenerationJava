package animais;

public class Sons {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		preguica.setIdade(42);
		cavalo.emitirSom();
		cachorro.Correr();
		cavalo.Correr();
		preguica.subirArvore();
		System.out.println(preguica.idade);
	}
}