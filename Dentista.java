package aula9Polimorfismo;

public class Dentista extends ProfissionalSaude{
	private String crq;
	public Dentista(String nome, String especialidade, int valorConsulta, String crq) {
		super(nome, especialidade, valorConsulta);
		this.crq = crq;
	}
	@Override
	public void agendarConsulta() {
		System.out.println("09/05");
	}
	public String getCrq() {
		return crq;
	}
	public void setCrq(String crq) {
		this.crq = crq;
	}
}
