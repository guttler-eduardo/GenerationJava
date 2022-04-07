package funcionario;

public class Funcionario {

	public static void main(String[] args) {
		
		ModeloFuncionario funcionario1 = new ModeloFuncionario("Auxiliar Técnico", 1250.00, false);
		ModeloFuncionario funcionario2 = new ModeloFuncionario("Gerente", 3200.00, true);
		
		funcionario1.expediente();
		funcionario1.info();
		System.out.println();
		funcionario2.expediente();
		funcionario2.info();
	}
}