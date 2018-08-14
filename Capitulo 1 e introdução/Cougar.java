interface HashTail {
	int getTailLength();
}

abstract class Puma implements HashTail {

	int getTailLength() {
		return 4;
	}
}

public class Cougar extends Puma {

	public static void main(String[] args) {
		
		// Puma puma = new Puma();
		System.out.println("heelo");
	}

	int getTailLength(int length) {
		return 2;
	}
}