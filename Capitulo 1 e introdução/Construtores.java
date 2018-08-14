public class Construtores {
	
	String public;

	String Public;

	

	public Construtores(String s1) {
		s1 = "Alteração no instance initialzer";
	}

	public Construtores(int num) {
		s1 = "Alteração no instance initialzer";
	}

	{
		s1 = "Alteração no instance initialzer";
	}

	{
		s2 = "Alteração de novo"
	}


	

	public static void main(String[] args) {
		
		Construtores construtor = new Construtores();
		System.out.println(construtor.s1);
	}
}