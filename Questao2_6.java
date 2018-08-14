public class Questao2_6 {
	
	public static void main(String[] args) {
		
		int x = 4;
		long y = x * 4 - x++;

		if (y < 10)
			System.out.println("too low");
		else
			System.out.pritln("Just right");
		else System.out.println("too high");
	}
}