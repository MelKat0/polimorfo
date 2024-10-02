package aula9Polimorfismo;

public class ConsultorPj extends Funcionario {
	public ConsultorPj(int id, String nome, String tele, int matri, String ender) {
		super(id, nome, tele, matri, ender);
	}
	@Override
	public double calcularSalario(double salarioBru, double imposto) {
		return salarioBru-imposto;
	}
}
