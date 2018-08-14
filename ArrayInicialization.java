public class ArrayInicialization {
	
	public static void main(String[] args) {
		
		int nums[] = new int[] {11,14,16};

		int nums2 = {32, 45, 67};
		// Como java já sabe o tipo pelo lado direito e já vai saber o tamanho pela inicialização,
		// essa é uma forma abreviada de declarar um array.

		for (int num : nums) {
			System.out.println(num);
		}
	}
}