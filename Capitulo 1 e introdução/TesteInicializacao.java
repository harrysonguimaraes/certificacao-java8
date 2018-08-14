public class TesteInicializacao {

	private int inteiro;

	public void causaErro() {

		int inteiroLocal = 0;
		System.out.println(inteiroLocal);
	}

	public static void main(String[] args) {
		
		TesteInicializacao ti = new TesteInicializacao();

		System.out.println("Imprimindo valor default do tipo primitivo de atributo de instancia: " + ti.inteiro);
		System.out.println("Dando erro por não inicializar variável loca: ");
		ti.causaErro();
	}
}