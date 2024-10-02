package aula9Polimorfismo;

public class PrincipalAnimal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("Edward", "M", "Cinzento");

		Leao leao = new Leao("Aslam", "M", "Africano");
		
		Tigre tigre = new Tigre("Kumal", "M", "Bengala");
		
		Cachorro cachorro = new Cachorro("Sheik", "M", "Pug");
		
		Gato gato = new Gato("Miette", "F", "Gato laranja");
		
		System.out.println("-----------LOBO------------");
		System.out.println(lobo.getNome());
		System.out.println(lobo.getRaca());
		System.out.println(lobo.getSexo());
		lobo.emitirSom();
		
		System.out.println("-----------LEAO------------");
		System.out.println(leao.getNome());
		System.out.println(leao.getRaca());
		System.out.println(leao.getSexo());
		leao.emitirSom();
		
		System.out.println("----------TIGRE------------");
		System.out.println(tigre.getNome());
		System.out.println(tigre.getRaca());
		System.out.println(tigre.getSexo());
		tigre.emitirSom();
		
		System.out.println("---------CACHORRO----------");
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getRaca());
		System.out.println(cachorro.getSexo());
		cachorro.emitirSom();
		
		System.out.println("-----------LOBO------------");
		System.out.println(lobo.getNome());
		System.out.println(lobo.getRaca());
		System.out.println(lobo.getSexo());
		lobo.emitirSom();
		
		System.out.println("-----------GATO------------");
		System.out.println(gato.getNome());
		System.out.println(gato.getRaca());
		System.out.println(gato.getSexo());
		gato.emitirSom();
		
		System.out.println("---------------------------");
	}

}
