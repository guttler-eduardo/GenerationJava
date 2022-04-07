package funcionario;

public class ModeloFuncionario {

	String cargo;
	double salario;
	boolean turno;
	
	public ModeloFuncionario(String cargo, double salario, boolean turno) {
		this.cargo = cargo;
		this.salario = salario;
		this.turno = turno;
	}
	public void expediente() {
		if (turno == true) {
			System.out.println("O funcionário está trabalhando de manhã");
		} else {
			System.out.println("O funcionário está trabalhando de tarde");
		}
	}
	
	public void info() {
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Salário: R$" + this.salario);
	}
}