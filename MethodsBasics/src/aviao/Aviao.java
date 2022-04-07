package aviao;

public class Aviao {
	
	public static void main(String[] args) {
		
		ModeloAviao A320 = new ModeloAviao("Vermelho e Azul", "LATAM", 174, 19.9, 829);
		ModeloAviao A380 = new ModeloAviao("Vinho", "Qatar", 853, 84.0, 903);
		ModeloAviao B737 = new ModeloAviao("Laranja", "Gol", 215, 79.2, 992);
		ModeloAviao B747 = new ModeloAviao("Azul e Amarelo", "Ryanair", 550, 47.5, 955);
		
		A320.motor = true;
		A380.motor = false;
		B737.motor = true;
		B747.motor = false;

		
		A320.decolar();
		A320.status();
		System.out.println();
		A380.decolar();
		A380.status();
		System.out.println();
		B737.decolar();
		B737.status();
		System.out.println();
		B747.pousar();
		B747.status();
	}
}