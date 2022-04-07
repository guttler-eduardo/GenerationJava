package paciente;

public class Paciente {

	public static void main(String[] args) {
		
		ModeloPaciente paciente = new ModeloPaciente("AB+", 37, 76.40, 1.75);
		
		paciente.consulta();
		paciente.info();
	}
}