public class NullPointerTeste {

	static int count = 0;
	
	public static void main(String[] args) {
		
		NullPointerTeste np = new NullPointerTeste();

		System.out.println(np.count);

		np = null;


		//Achou que aqui daria nullPointer neh?! Mas não! count é static. 
		// Não usa a instância. Usa a classe. Sempre. Mesmo sendo invocado de uma instância.
		System.out.println(np.count);

	}
}