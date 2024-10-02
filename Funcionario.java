package aula9Polimorfismo;

public class Funcionario {
	
	private int id;
	private String nome;
	private String tele;
	private int matri;
	private String ender;
	
	public Funcionario(int id, String nome, String tele, int matri, String ender) {
		this.id = id;
		this.nome = nome;
		this.tele = tele;
		this.matri = matri;
		this.ender = ender;
	}
	public double calcularSalario( double salarioBru, double desc) {
		return salarioBru - desc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	public int getMatri() {
		return matri;
	}
	public void setMatri(int matri) {
		this.matri = matri;
	}
	public String getEnder() {
		return ender;
	}
	public void setEnder(String ender) {
		this.ender = ender;
	}
}
