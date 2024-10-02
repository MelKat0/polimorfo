package aula9Polimorfismo;

public class Horista extends Funcionario {
	public Horista(int id, String nome, String tele, int matri, String ender) {
		super(id, nome, tele, matri, ender);
	}
	@Override
	public double calcularSalario(double valorHora, double horaTrab) {
		return valorHora*horaTrab;
	}
}
