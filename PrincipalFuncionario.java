package aula9Polimorfismo;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario(01, "Osmar", "(15)96774-3407", 1705, "R. Yiruma, Av. Piano");
		System.out.println("=========FUNCIONÁRIO==========");
		System.out.println(funcionario.getId());
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.calcularSalario(10000, 1200));
		System.out.println(funcionario.getTele());
		System.out.println(funcionario.getMatri());
		System.out.println(funcionario.getEnder());
		
		Horista horista = new Horista(02, "Márcio", "(15)98806-2586", 0102, "R. Kenny G, Av. Saxophone");
		System.out.println("===========HORISTA============");
		System.out.println(horista.getId());
		System.out.println(horista.getNome());
		System.out.println(horista.calcularSalario(6,40));
		System.out.println(horista.getTele());
		System.out.println(horista.getMatri());
		System.out.println(horista.getEnder());
		
		Jornada jornada = new Jornada(03, "Geraldo", "(15)99186-2396", 0506, "R. Michael J, Av. Microfone");
		System.out.println("===========JORNADA============");
		System.out.println(jornada.getId());
		System.out.println(jornada.getNome());
		System.out.println(jornada.calcularSalario(100,215));
		System.out.println(jornada.getTele());
		System.out.println(jornada.getMatri());
		System.out.println(jornada.getEnder());
		
		ConsultorPj consultorpj = new ConsultorPj(04, "Jorge", "(15)98913-4936", 0405, "R. John L, Av. Guitar");
		System.out.println("=========CONSULTORPJ==========");
		System.out.println(consultorpj.getId());
		System.out.println(consultorpj.getNome());
		System.out.println(consultorpj.calcularSalario(2800,252));
		System.out.println(consultorpj.getTele());
		System.out.println(consultorpj.getMatri());
		System.out.println(consultorpj.getEnder());
		
		System.out.println("==============================");
	}
}
