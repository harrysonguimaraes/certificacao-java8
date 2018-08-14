public class Sobrecarga {

	private void latir() {

		System.out.println("Latindo privado sem argumentos!");
	}

	private void latir(String latido) {

		System.out.println(latido);
	}

	//Esse método não pode ser declarado, 
	//pois já foi declarado com outro modificador de acesso. 
	// public void latir(String latido) {

	// 	System.out.println(latido);
	// }

	// Método não pode ser declarado, pois somente lançar Exception não conta como sobrecarga.
	// Não tem como saber qual método invocar pela throws exception somente.
	// private void latir(String latido) throws Exception{

	// 	System.out.println(latido);
	// }

	// Só mudou o tipo de retorno. Não é válido.
	// private boolean latir(String latido) {

	// 	System.out.println(latido);
	// 	return true;
	// }

	//Não é válido somente por ser static. 
	// private static void latir(String latido) {

	// 	System.out.println(latido);
	// }	


	public static void main(String[] args) throws Exception{
		
		Sobrecarga sc = new Sobrecarga();

		sc.latir();
		sc.latir("Latindo com parâmetros");
	}
}