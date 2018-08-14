public class Construtores {
	
	private Integer numero;

	public Construtores() {

		this(10);
		System.out.println("Nova instancia de " + Construtores.class.getSimpleName() + " criada pelo construtor default");

	}

	public Construtores(Integer numero) {

		this.numero = numero;
		System.out.println("Chamada ao construtor com parâmetros");
	}

	public static void main(String[] args) {
		
		Construtores c = new Construtores();
		System.out.println(c.numero);

		Construtores c2 = new Construtores(20);
		System.out.println(c2.numero);

	}
}