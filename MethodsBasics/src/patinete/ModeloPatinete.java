package patinete;

public class ModeloPatinete {

	String material, tamanho;
	boolean buzina, lanterna;
	
	public ModeloPatinete(String material, String tamanho, boolean buzina) {
		this.material = material;
		this.tamanho = tamanho;
		this.buzina = buzina;
	}
	
	public void andarDia() {
		System.out.println("O patinete está sendo utilizado durante o dia");
	}
	public void andarNoite() {
		if (lanterna == true) {
			System.out.println("É possível utilizar o patinete durante a noite");
		} else {
			System.out.println("Erro: não é possível utilizar este patinete de noite");
		}
	}
	public void info() {
		System.out.println("Material: " + this.material);
		System.out.println("Tamanho: " + this.tamanho);
		if (buzina == true) {
			System.out.println("Buzina: Sim");
		} else {
			System.out.println("Buzina: Não");
		}
		if (lanterna == true) {
			System.out.println("Lanterna: Sim");
		} else {
			System.out.println("Lanterna: Não");
		}
	}
}
