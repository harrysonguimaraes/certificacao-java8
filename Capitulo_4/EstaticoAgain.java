public class EstaticoAgain {
	
	static int numEstatico = 5;
	int numInstancia = 10;

	private static void printaEstatico() {

		System.out.println(numEstatico);
	}

	private void printaInstancia() {
		System.out.println(numInstancia);
	}

	public static void main(String[] args) {
		
		// Variável e método estático sendo chamados estáticamente
		System.out.println(numEstatico);
		printaEstatico();

		EstaticoAgain ea = new EstaticoAgain();
		// Variável e método estático sendo chamada a partir de uma instância.
		System.out.println(ea.numEstatico);
		ea.printaEstatico();

		// variável e método de instância sendo chamada estaticamente. Não dá.
		// System.out.println(numInstancia);
		// printaInstancia();

		// Variável de instância sendo chamada a partir de uma instância. OK.
		System.out.println(ea.numInstancia);
	}
}