package patinete;

public class Patinete {

	public static void main(String[] args) {
		
		ModeloPatinete patinete1 = new ModeloPatinete("Ferro", "M�dio", true);
		ModeloPatinete patinete2 = new ModeloPatinete("Pl�stico", "Pequeno", false);
		ModeloPatinete patinete3 = new ModeloPatinete("Tit�nio", "Grande", true);
				
		patinete1.andarDia();
		patinete1.info();
		System.out.println();
		
		patinete2.andarNoite();
		patinete2.info();
		System.out.println();
		
		patinete3.lanterna = true;
		patinete3.andarNoite();
		patinete3.info();
	}
}
