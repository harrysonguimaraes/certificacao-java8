public class Pai {

	public void darOrdens() {

		System.out.println("Vá já pra cama, menino!");
	}
}

class Filho extends Pai {

	public void recebeOrdens() {

		System.out.println("Ok, pai!");
	}

	public static void main(String[] args) {
		
		Filho pessoa = new Filho();
		pessoa.recebeOrdens();
	}
}