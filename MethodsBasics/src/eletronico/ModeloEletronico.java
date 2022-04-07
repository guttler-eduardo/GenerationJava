package eletronico;

public class ModeloEletronico {

	String marca;
	int ram, hd, bateria;
	double processador;
	boolean placaVideo;
	
	public void ligar() {
		if (bateria == 0) {
			System.out.println("Erro: o dispositivo está sem energia");
		} else {
			System.out.println("O dispositivo iniciou");
		}
	}
	
	public void rodarJogo() {
		if (bateria > 0 && placaVideo == true) {
			System.out.println("O dispositivo executou a aplicação");
		} else {
			System.out.println("Erro: o dispositivo não pode executar a aplicação");
		}
	}
	
	public void info() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Memória RAM: " + this.ram + "GB");
		System.out.println("Memória Interna " + this.hd + "GB");
		System.out.println("Processador: " + processador + "GHz");
	}
}
