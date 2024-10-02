package aula9Polimorfismo;

public class PrincipalProfissionalSaude {

	public static void main(String[] args) {
		ProfissionalSaude saude = new ProfissionalSaude("Luan", "Cardiologia", 400);
		System.out.println("***ProfissionalSaude***");
		System.out.println(saude.getNome());
		System.out.println(saude.getEspecialidade());
		System.out.println(saude.getValorConsulta());
		saude.agendarConsulta();
		
		Medico medico = new Medico("Cynthia", "Neurocirurgia", 550, "98989898");
		
		System.out.println("********Médico*********");
		System.out.println(medico.getNome());
		System.out.println(medico.getEspecialidade());
		System.out.println(medico.getValorConsulta());
		System.out.println(medico.getCrm());
		medico.agendarConsulta();
		
		Dentista dentista = new Dentista("Tifanny", "Clareamento", 300, "73737373");
		
		System.out.println("********Dentista********");
		System.out.println(dentista.getNome());
		System.out.println(dentista.getEspecialidade());
		System.out.println(dentista.getValorConsulta());
		System.out.println(dentista.getCrq());
		dentista.agendarConsulta();
		
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta("Marcelo", "Neurofuncional", 270, "66556655");
		
		System.out.println("*****Fisioterapeuta*****");
		System.out.println(fisioterapeuta.getNome());
		System.out.println(fisioterapeuta.getEspecialidade());
		System.out.println(fisioterapeuta.getValorConsulta());
		System.out.println(fisioterapeuta.getCrefito());
		fisioterapeuta.agendarConsulta();
		
		System.out.println("************************");
		
	}
}
