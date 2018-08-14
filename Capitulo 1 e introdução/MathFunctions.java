public class MathFunctions {

	public static void addToInt(int x, int amoutToAdd) {

		x = x + amoutToAdd;
	}

	public static void main(String[] args) {
		
		int a = 15;
		int b = 10;

		MathFunctions.addToInt(a, b);

		System.out.println(a);
	}
}