public class Cap4ReturnType {
	
	// É válido. É void, tem return, mas o return não faz nada.
	public void teste() {

		System.out.println("Imprime isso aí!");
		return;
	}

	public void testeNormal() {

		System.out.println("Método mais comum possível");
	}

	//Não é válido, pois é void e tá retornando. 
	// public void teste2() {

	// 	int num = 2;

	// 	System.out.println("Vou retornar um número mesmo sendo void");
	// 	return num;
	// }


	// Não pode. É pra retornar String e não retorna nada.
	// public String naoRetornando() {

	// 	System.out.println("Não retornando!");
	// }

	public static void main(String[] args) {
		
	}
}