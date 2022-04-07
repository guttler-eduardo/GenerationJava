package paciente;

public class ModeloPaciente {

	String tipoSangue;
	int idade;
	double peso, altura;
	
	public ModeloPaciente(String sangue, int idade, double peso, double altura) {
		this.tipoSangue = sangue;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public void consulta() {
		System.out.println("O paciente está sendo examinado");
	}
	
	public void info() {
		System.out.println("Tipo sanguíneo: " + tipoSangue);
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Peso: " + peso + " kgs");
		System.out.println("Altura: " + altura + "m");
	}
}