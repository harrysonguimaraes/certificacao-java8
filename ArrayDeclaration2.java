public class ArrayDeclaration2 {
	
	public static void main(String[] args) {
		
		int nums[], numero;

		nums = new int[3];

		nums[0] = 2;
		nums[1] = 2;
		nums[2] = 2;

		numero = 10;

		for (int number : nums) {
			System.out.println(number);
		}

		System.out.println(numero);

	}
}