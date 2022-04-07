package aviao;

public class ModeloAviao {

	String cores, companhia;
	int assentos, velocidadeMaxima;
	double carga;
	boolean motor;
	
	public ModeloAviao(String cor, String cia, int a, double c, int vm) {
		this.cores = cor;
		this.companhia = cia;
		this.assentos = a;
		this.carga = c;
		this.velocidadeMaxima = vm;
	}
	
	public void decolar() {
		if (motor == true) {
			System.out.println("A aeronave levantou voo");
		} else {
			System.out.println("Erro: Os motores da aeronave est�o desligados");
		}
	}
	
	public void pousar() {
		System.out.println("A aeronave est� pousando");
	}
	
	public void status() {
		System.out.println("Companhia: " + this.companhia);
		System.out.println("Cor(es) secund�ria(s): " + this.cores);
		System.out.println("N�mero de Assentos: " + this.assentos);
		System.out.println("Capacidade de Carga: " + this.carga + " toneladas");
		System.out.println("Velocidade M�xima: " + this.velocidadeMaxima + " km/h");
	}
}