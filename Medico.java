package aula9Polimorfismo;

public class Medico extends ProfissionalSaude{
	private String crm;
	public Medico(String nome, String especialidade, int valorConsulta, String crm) {
		super(nome, especialidade, valorConsulta);
		this.crm = crm;
	}
	@Override
	public void agendarConsulta() {
		System.out.println("04/05");
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
}
