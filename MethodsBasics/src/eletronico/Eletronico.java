package eletronico;

public class Eletronico {

	public static void main(String[] args) {
		
		ModeloEletronico computador1 = new ModeloEletronico();
		ModeloEletronico computador2 = new ModeloEletronico();
		ModeloEletronico computador3 = new ModeloEletronico();
		
		computador1.marca = "Lenovo";
		computador1.bateria = 100;
		computador1.ram = 4;
		computador1.hd = 500;
		computador1.processador = 3.8;
		computador1.placaVideo = true;
		computador1.ligar();
		computador1.rodarJogo();
		computador1.info();
		System.out.println();
		
		computador2.marca = "Positivo";
		computador2.bateria = 85;
		computador2.ram = 6;
		computador2.hd = 500;
		computador2.processador = 3.6;
		computador2.placaVideo = false;
		computador2.ligar();
		computador2.rodarJogo();
		computador2.info();
		System.out.println();
		
		computador3.marca = "Asus";
		computador3.bateria = 0;
		computador3.ram = 4;
		computador3.hd = 1000;
		computador3.processador = 4.2;
		computador3.placaVideo = true;
		computador3.ligar();
		computador3.rodarJogo();
		computador3.info();
	}
}
